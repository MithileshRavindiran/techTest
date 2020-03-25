package com.backbase.backendtechnicaltest.model;


import com.fasterxml.jackson.annotation.JsonProperty;

public class NewBalance {
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amount")
    private Object amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Object getAmount() {
        return amount;
    }

    public void setAmount(Object amount) {
        this.amount = amount;
    }
}
