package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Result {
    @JsonProperty("id")
    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    String id;

    @JsonProperty("type")
    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    String type;

    @JsonProperty("status")
    public String getStatus() {
        return this.status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    String status;

    @JsonProperty("title")
    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String title;

    @JsonProperty("metadata")
    public Metadata getMetadata() {
        return this.metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    Metadata metadata;

    @JsonProperty("extensions")
    public Extensions getExtensions() {
        return this.extensions;
    }

    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
    }

    Extensions extensions;

    @JsonProperty("_links")
    public Links get_links() {
        return this._links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    Links _links;

    @JsonProperty("_expandable")
    public Expandable get_expandable() {
        return this._expandable;
    }

    public void set_expandable(Expandable _expandable) {
        this._expandable = _expandable;
    }

    Expandable _expandable;

    @JsonProperty("prefix")
    public String getPrefix() {
        return this.prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    String prefix;

    @JsonProperty("name")
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    String name;

    @JsonProperty("results")
    public Results getResults() {
        return this.results;
    }

    public void setResults(Results results) {
        this.results = results;
    }

    Results results;
}
