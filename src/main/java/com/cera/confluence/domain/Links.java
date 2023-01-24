package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Links {
    @JsonProperty("self")
    public String getSelf() {
        return this.self;
    }

    public void setSelf(String self) {
        this.self = self;
    }

    String self;

    @JsonProperty("webui")
    public String getWebui() {
        return this.webui;
    }

    public void setWebui(String webui) {
        this.webui = webui;
    }

    String webui;

    @JsonProperty("edit")
    public String getEdit() {
        return this.edit;
    }

    public void setEdit(String edit) {
        this.edit = edit;
    }

    String edit;

    @JsonProperty("tinyui")
    public String getTinyui() {
        return this.tinyui;
    }

    public void setTinyui(String tinyui) {
        this.tinyui = tinyui;
    }

    String tinyui;

    @JsonProperty("base")
    public String getBase() {
        return this.base;
    }

    public void setBase(String base) {
        this.base = base;
    }

    String base;

    @JsonProperty("context")
    public String getContext() {
        return this.context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    String context;
}
