package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Value {
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amount")
    private String amount;

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
