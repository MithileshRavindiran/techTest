package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class TransactionMetadata {
    @JsonProperty("narrative")
    private Object narrative;
    @JsonProperty("comments")
    private Object comments;
    @JsonProperty("tags")
    private Object tags;
    @JsonProperty("images")
    private Object images;
    @JsonProperty("where")
    private Object where;

    public Object getNarrative() {
        return narrative;
    }

    public void setNarrative(Object narrative) {
        this.narrative = narrative;
    }

    public Object getComments() {
        return comments;
    }

    public void setComments(Object comments) {
        this.comments = comments;
    }

    public Object getTags() {
        return tags;
    }

    public void setTags(Object tags) {
        this.tags = tags;
    }

    public Object getImages() {
        return images;
    }

    public void setImages(Object images) {
        this.images = images;
    }

    public Object getWhere() {
        return where;
    }

    public void setWhere(Object where) {
        this.where = where;
    }
}
