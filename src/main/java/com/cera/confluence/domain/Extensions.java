package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Extensions {
    @JsonProperty("position")
    public String getPosition() {
        return this.position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    String position;
}
