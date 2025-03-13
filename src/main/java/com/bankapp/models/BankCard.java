package com.bankapp.models;

public class BankCard {
    private int cardId;
    private String cardNumber;
    private String cardCode;

    public int getCardId() {
        return this.cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardCode() {
        return this.cardCode;
    }

    public void setCardCode(String cardCode) {
        this.cardCode = cardCode;
    }

}
