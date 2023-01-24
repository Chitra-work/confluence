package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {

    private String workflowName;

    private String currentState;

    private String currentStateColour;

    private Object currentStateStart;

    private String currentStateStartedBy;

    private CurrentStateStartedByInfo currentStateStartedByInfo;

    private String isFinal;

    private int lastFinalVersionId;

    private String lastFinalVersionNumber;

    private long lastFinalVersionDate;

    private String hasWorkflow;

    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public String getCurrentState() {
        return currentState;
    }

    public void setCurrentState(String currentState) {
        this.currentState = currentState;
    }

    public String getCurrentStateColour() {
        return currentStateColour;
    }

    public void setCurrentStateColour(String currentStateColour) {
        this.currentStateColour = currentStateColour;
    }

    public Object getCurrentStateStart() {
        return currentStateStart;
    }

    public void setCurrentStateStart(Object currentStateStart) {
        this.currentStateStart = currentStateStart;
    }

    public String getCurrentStateStartedBy() {
        return currentStateStartedBy;
    }

    public void setCurrentStateStartedBy(String currentStateStartedBy) {
        this.currentStateStartedBy = currentStateStartedBy;
    }

    public CurrentStateStartedByInfo getCurrentStateStartedByInfo() {
        return currentStateStartedByInfo;
    }

    public void setCurrentStateStartedByInfo(CurrentStateStartedByInfo currentStateStartedByInfo) {
        this.currentStateStartedByInfo = currentStateStartedByInfo;
    }

    public String getIsFinal() {
        return isFinal;
    }

    public void setIsFinal(String isFinal) {
        this.isFinal = isFinal;
    }

    public int getLastFinalVersionId() {
        return lastFinalVersionId;
    }

    public void setLastFinalVersionId(int lastFinalVersionId) {
        this.lastFinalVersionId = lastFinalVersionId;
    }

    public String getLastFinalVersionNumber() {
        return lastFinalVersionNumber;
    }

    public void setLastFinalVersionNumber(String lastFinalVersionNumber) {
        this.lastFinalVersionNumber = lastFinalVersionNumber;
    }

    public long getLastFinalVersionDate() {
        return lastFinalVersionDate;
    }

    public void setLastFinalVersionDate(long lastFinalVersionDate) {
        this.lastFinalVersionDate = lastFinalVersionDate;
    }

    public String getHasWorkflow() {
        return hasWorkflow;
    }

    public void setHasWorkflow(String hasWorkflow) {
        this.hasWorkflow = hasWorkflow;
    }

    @Override
    public String toString() {
        return "Value [workflowName=" + workflowName + ", currentState=" + currentState + ", currentStateColour="
                + currentStateColour + ", currentStateStart=" + currentStateStart + ", currentStateStartedBy="
                + currentStateStartedBy + ", currentStateStartedByInfo=" + currentStateStartedByInfo + ", isFinal="
                + isFinal + ", lastFinalVersionId=" + lastFinalVersionId + ", lastFinalVersionNumber="
                + lastFinalVersionNumber + ", lastFinalVersionDate=" + lastFinalVersionDate + ", hasWorkflow="
                + hasWorkflow + "]";
    }
}
