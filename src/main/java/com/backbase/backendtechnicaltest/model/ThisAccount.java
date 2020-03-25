package com.backbase.backendtechnicaltest.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;

public class ThisAccount {
    @JsonProperty("id")
    private String id;
    @JsonProperty("holders")
    private ArrayList<Holder> holders;
    @JsonProperty("number")
    private String number;
    @JsonProperty("kind")
    private String kind;
    @JsonProperty("swift_bic")
    private Object swiftBic;
    @JsonProperty("bank")
    private Bank bank;
    @JsonProperty("IBAN")
    private Object iban;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ArrayList<Holder> getHolders() {
        return holders;
    }

    public void setHolders(ArrayList<Holder> holders) {
        this.holders = holders;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
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

    public Object getIban() {
        return iban;
    }

    public void setIban(Object iban) {
        this.iban = iban;
    }
}
