package com.cera.confluence.controllers;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.IOUtils;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.cera.confluence.domain.ConfluenceDomain;
import com.cera.confluence.domain.Metadata;
import com.cera.confluence.domain.Results;
import com.cera.confluence.domain.Value;
import com.google.gson.Gson;

@RestController
public class ConfluenceController {

    Logger logger = LoggerFactory.getLogger(ConfluenceController.class);
    DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    Calendar calendar = Calendar.getInstance();

    @RequestMapping("/confluence/label=lccf-v2-99-1-1-1")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getConfluenceDataForSpecificLabel() throws IOException {

        ClassPathResource StaticDataResource = new ClassPathResource("sample.json");
        String staticDataString = IOUtils.toString(StaticDataResource.getInputStream(), StandardCharsets.UTF_8);

        Gson gson = new Gson();
        ConfluenceDomain res = gson.fromJson(staticDataString, ConfluenceDomain.class);
        for (Results results : res.getResults()) {
            Metadata metadata = results.getMetadata();
            logger.info("Metadata:::" + metadata);

            boolean effectiveness = calculateEffectiveScore(metadata);
            logger.info("Effectiveness:::" + effectiveness);
        }
        return new ResponseEntity<>(new JSONObject(staticDataString).toMap(), HttpStatus.OK);

    }

    @RequestMapping("/confluence/label=cera")
    @ResponseBody
    public ResponseEntity<Map<String, Object>> getConfluenceDataForCera() throws IOException {

        ClassPathResource StaticDataResource = new ClassPathResource("stubbed_json_response.json");
        String staticDataString = IOUtils.toString(StaticDataResource.getInputStream(), StandardCharsets.UTF_8);

        Gson gson = new Gson();
        ConfluenceDomain res = gson.fromJson(staticDataString, ConfluenceDomain.class);
        for (Results results : res.getResults()) {
            Metadata metadata = results.getMetadata();
            logger.info("Metadata:::" + metadata);

            boolean effectiveness = calculateEffectiveScore(metadata);
            logger.info("Effectiveness:::" + effectiveness);
        }
        return new ResponseEntity<>(new JSONObject(staticDataString).toMap(), HttpStatus.OK);

    }

    private boolean calculateEffectiveScore(Metadata metadata) {

        logger.info("Calculate Effectiveness Score , for Id:::" + metadata.getProperties().getComalaworkflows().getId()
                + "Key:::" + metadata.getProperties().getComalaworkflows().getKey());

        Value value = metadata.getProperties().getComalaworkflows().getValue();

        boolean effectiveness = false;

        long milliSeconds = ((Number) value.getCurrentStateStart()).longValue();

        calendar.setTimeInMillis(milliSeconds);
        logger.info("currentStateStart::" + formatter.format(calendar.getTime()));

        Date date = new Date();
        logger.info("Today's Date::" + formatter.format(date));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

        try {
            Date date1 = sdf.parse(formatter.format(calendar.getTime()));
            Date date2 = sdf.parse(formatter.format(date));

            long diff = date1.getTime() - date2.getTime();

            // Frequency will be retrieved from datasource - Check with Tim (For now
            // hardcoding it)
            Long frequency = (long) 90;

            Long currentStateValue = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
            logger.info("CompareDate::" + currentStateValue);

            if (currentStateValue > frequency)
                effectiveness = true;

            return effectiveness;

        } catch (ParseException e) {
            logger.info("Date parsing exception:::" + e);

        }

        return effectiveness;

    }

}
