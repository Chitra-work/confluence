package com.cera.confluence.domain;

public class Comalaworkflows {

    private String id;

    private String key;

    private Value value;

    private Version version;

    private Links _links;

    private Expandable _expandable;

    /**
     * @return String return the id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(String id) {
        this.id = id;
    }

    /**
     * @return String return the key
     */
    public String getKey() {
        return key;
    }

    /**
     * @param key the key to set
     */
    public void setKey(String key) {
        this.key = key;
    }

    /**
     * @return Value return the value
     */
    public Value getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(Value value) {
        this.value = value;
    }

    /**
     * @return Version return the version
     */
    public Version getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(Version version) {
        this.version = version;
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
        return "Comalaworkflows [Value = " + value + ", Version = " + version + ", Expandable = " + _expandable
                + ", Links = " + _links + "]";
    }

}
