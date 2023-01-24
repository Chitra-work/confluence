package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Root {
    @JsonProperty("results")
    public ArrayList<Result> getResults() {
        return this.results;
    }

    public void setResults(ArrayList<Result> results) {
        this.results = results;
    }

    ArrayList<Result> results;

    @JsonProperty("start")
    public int getStart() {
        return this.start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    int start;

    @JsonProperty("limit")
    public int getLimit() {
        return this.limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    int limit;

    @JsonProperty("size")
    public int getSize() {
        return this.size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    int size;

    @JsonProperty("cqlQuery")
    public String getCqlQuery() {
        return this.cqlQuery;
    }

    public void setCqlQuery(String cqlQuery) {
        this.cqlQuery = cqlQuery;
    }

    String cqlQuery;

    @JsonProperty("searchDuration")
    public int getSearchDuration() {
        return this.searchDuration;
    }

    public void setSearchDuration(int searchDuration) {
        this.searchDuration = searchDuration;
    }

    int searchDuration;

    @JsonProperty("totalSize")
    public int getTotalSize() {
        return this.totalSize;
    }

    public void setTotalSize(int totalSize) {
        this.totalSize = totalSize;
    }

    int totalSize;

    @JsonProperty("_links")
    public Links get_links() {
        return this._links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    Links _links;
}
