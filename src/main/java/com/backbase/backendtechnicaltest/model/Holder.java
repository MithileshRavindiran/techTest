package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Holder {
    @JsonProperty("name")
    private String name;
    @JsonProperty("is_alias")
    private boolean isAlias;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlias() {
        return isAlias;
    }

    public void setAlias(boolean alias) {
        isAlias = alias;
    }
}
