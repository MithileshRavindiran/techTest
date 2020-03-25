package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Transaction {
    @JsonProperty("id")
    private String id;
    @JsonProperty("this_account")
    private ThisAccount thisAccount;
    @JsonProperty("other_account")
    private OtherAccount otherAccount;
    @JsonProperty("details")
    private Details details;
    @JsonProperty("metadata")
    private TransactionMetadata transactionMetadata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ThisAccount getThisAccount() {
        return thisAccount;
    }

    public void setThisAccount(ThisAccount thisAccount) {
        this.thisAccount = thisAccount;
    }

    public OtherAccount getOtherAccount() {
        return otherAccount;
    }

    public void setOtherAccount(OtherAccount otherAccount) {
        this.otherAccount = otherAccount;
    }

    public Details getDetails() {
        return details;
    }

    public void setDetails(Details details) {
        this.details = details;
    }

    public TransactionMetadata getTransactionMetadata() {
        return transactionMetadata;
    }

    public void setTransactionMetadata(TransactionMetadata transactionMetadata) {
        this.transactionMetadata = transactionMetadata;
    }
}
