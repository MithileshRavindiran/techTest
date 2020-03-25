package com.backbase.backendtechnicaltest.dto;

public class TransactionDto {
    private String id;
    private String accountId;
    private String counterPartyAccount;
    private String counterPartyName;
    private Object counterPartyLogoPath;
    private String instructedAmount;
    private String instructedCurrency;
    private String transactionAmount;
    private String transactionCurrency;
    private String transactionType;
    private String description;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getCounterPartyAccount() {
        return counterPartyAccount;
    }

    public void setCounterPartyAccount(String counterPartyAccount) {
        this.counterPartyAccount = counterPartyAccount;
    }

    public String getCounterPartyName() {
        return counterPartyName;
    }

    public void setCounterPartyName(String counterPartyName) {
        this.counterPartyName = counterPartyName;
    }

    public Object getCounterPartyLogoPath() {
        return counterPartyLogoPath;
    }

    public void setCounterPartyLogoPath(Object counterPartyLogoPath) {
        this.counterPartyLogoPath = counterPartyLogoPath;
    }

    public String getInstructedAmount() {
        return instructedAmount;
    }

    public void setInstructedAmount(String instructedAmount) {
        this.instructedAmount = instructedAmount;
    }

    public String getInstructedCurrency() {
        return instructedCurrency;
    }

    public void setInstructedCurrency(String instructedCurrency) {
        this.instructedCurrency = instructedCurrency;
    }

    public String getTransactionAmount() {
        return transactionAmount;
    }

    public void setTransactionAmount(String transactionAmount) {
        this.transactionAmount = transactionAmount;
    }

    public String getTransactionCurrency() {
        return transactionCurrency;
    }

    public void setTransactionCurrency(String transactionCurrency) {
        this.transactionCurrency = transactionCurrency;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
