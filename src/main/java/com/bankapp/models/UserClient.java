package com.bankapp.models;

public class UserClient extends Client{
    private int id;
    private String cardNumber;
    private int cardPIN;

    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id=id;
    }

    public String getCardNumber() {
        return this.cardNumber;
    }
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getCardPIN() {
        return this.cardPIN;
    }
    public void setCardPIN(int cardPIN) {
        this.cardPIN = cardPIN;
    }
    public void transfer(double amount, int targetUserId){
    }


}
