package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class OtherAccount {
    @JsonProperty("id")
    private String id;
    @JsonProperty("holder")
    private Holder holder;
    @JsonProperty("number")
    private String number;
    @JsonProperty("kind")
    private Object kind;
    @JsonProperty("IBAN")
    private Object IBAN;
    @JsonProperty("swift_bic")
    private Object swiftBic;
    @JsonProperty("bank")
    private Bank bank;
    @JsonProperty("metadata")
    private OtherAccountMetadata otherAccountMetadata;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Holder getHolder() {
        return holder;
    }

    public void setHolder(Holder holder) {
        this.holder = holder;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Object getKind() {
        return kind;
    }

    public void setKind(Object kind) {
        this.kind = kind;
    }

    public Object getIBAN() {
        return IBAN;
    }

    public void setIBAN(Object IBAN) {
        this.IBAN = IBAN;
    }

    public Object getSwiftBic() {
        return swiftBic;
    }

    public void setSwiftBic(Object swiftBic) {
        this.swiftBic = swiftBic;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public OtherAccountMetadata getOtherAccountMetadata() {
        return otherAccountMetadata;
    }

    public void setOtherAccountMetadata(OtherAccountMetadata otherAccountMetadata) {
        this.otherAccountMetadata = otherAccountMetadata;
    }
}
