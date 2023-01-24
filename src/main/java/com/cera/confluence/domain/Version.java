package com.cera.confluence.domain;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Version {
    @JsonProperty("when")
    public Date getWhen() {
        return this.when;
    }

    public void setWhen(Date when) {
        this.when = when;
    }

    Date when;

    @JsonProperty("message")
    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    String message;

    @JsonProperty("number")
    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    int number;

    @JsonProperty("minorEdit")
    public boolean getMinorEdit() {
        return this.minorEdit;
    }

    public void setMinorEdit(boolean minorEdit) {
        this.minorEdit = minorEdit;
    }

    boolean minorEdit;

    @JsonProperty("hidden")
    public boolean getHidden() {
        return this.hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    boolean hidden;
}
