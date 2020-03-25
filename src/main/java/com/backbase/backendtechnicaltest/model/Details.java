package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Details {
    @JsonProperty("type")
    private String type;
    @JsonProperty("description")
    private String description;
    @JsonProperty("posted")
    private String posted;
    @JsonProperty("completed")
    private String completed;
    @JsonProperty("new_balance")
    private NewBalance newBalance;
    @JsonProperty("value")
    private Value value;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPosted() {
        return posted;
    }

    public void setPosted(String posted) {
        this.posted = posted;
    }

    public String getCompleted() {
        return completed;
    }

    public void setCompleted(String completed) {
        this.completed = completed;
    }

    public NewBalance getNewBalance() {
        return newBalance;
    }

    public void setNewBalance(NewBalance newBalance) {
        this.newBalance = newBalance;
    }

    public Value getValue() {
        return value;
    }

    public void setValue(Value value) {
        this.value = value;
    }
}
