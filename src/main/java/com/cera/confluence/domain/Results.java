package com.cera.confluence.domain;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Results {

    private Metadata metadata;

    private String id;

    private String type;

    private String status;

    private String title;

    private Extensions extensions;

    private Links _links;

    private Expandable _expandable;

    private String prefix;

    private String name;

    /**
     * @return Metadata return the metadata
     */
    public Metadata getMetadata() {
        return metadata;
    }

    /**
     * @param metadata the metadata to set
     */
    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public String toString() {
        return "[Results = " + metadata + "]";
    }

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
     * @return String return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * @return String return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return String return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return Extensions return the extensions
     */
    public Extensions getExtensions() {
        return extensions;
    }

    /**
     * @param extensions the extensions to set
     */
    public void setExtensions(Extensions extensions) {
        this.extensions = extensions;
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

    /**
     * @return String return the prefix
     */
    public String getPrefix() {
        return prefix;
    }

    /**
     * @param prefix the prefix to set
     */
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
