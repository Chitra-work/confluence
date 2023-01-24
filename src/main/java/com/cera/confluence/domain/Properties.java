package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Properties {

    private Comalaworkflows comalaworkflows;

    private Links _links;

    private Expandable _expandable;

    /**
     * @return Comalaworkflows return the comalaworkflows
     */
    public Comalaworkflows getComalaworkflows() {
        return comalaworkflows;
    }

    /**
     * @param comalaworkflows the comalaworkflows to set
     */
    public void setComalaworkflows(Comalaworkflows comalaworkflows) {
        this.comalaworkflows = comalaworkflows;
    }

    /**
     * @return Links return the _links
     */
    public Links get_links() {
        return _links;
    }

    /**
     * @param _links the _links to set
     */
    public void set_links(Links _links) {
        this._links = _links;
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
        return "Properties [Comalaworkflows = " + comalaworkflows + ", Links = " + _links + ", Expandable = "
                + _expandable
                + "]";
    }

}
