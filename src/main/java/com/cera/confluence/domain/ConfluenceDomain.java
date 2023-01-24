package com.cera.confluence.domain;

public class ConfluenceDomain {

    private Results[] results;

    /**
     * @return Results[] return the results
     */
    public Results[] getResults() {
        return results;
    }

    /**
     * @param results the results to set
     */
    public void setResults(Results[] results) {
        this.results = results;
    }

    @Override
    public String toString() {
        return "[Results = " + results + "]";
    }

}
