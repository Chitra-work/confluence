package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Metadata {

    private Labels labels;

    private Properties properties;

    private Expandable _expandable;

    /**
     * @return Labels return the labels
     */
    public Labels getLabels() {
        return labels;
    }

    /**
     * @param labels the labels to set
     */
    public void setLabels(Labels labels) {
        this.labels = labels;
    }

    /**
     * @return Properties return the properties
     */
    public Properties getProperties() {
        return properties;
    }

    /**
     * @param properties the properties to set
     */
    public void setProperties(Properties properties) {
        this.properties = properties;
    }

    /**
     * @return Expandable return the _expandable
     */
    public Expandable get_expandable() {
        return _expandable;
    }

    /**
     * @param _expandable the _expandable to set
     */
    public void set_expandable(Expandable _expandable) {
        this._expandable = _expandable;
    }

    @Override
    public String toString() {
        return "Metadata [Labels = " + labels + ", Properties = " + properties + ", Expandable = " + _expandable + "]";
    }

}
