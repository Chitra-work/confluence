package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ProfilePicture {
    @JsonProperty("path")
    public String getPath() {
        return this.path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    String path;
}
