package com.bankapp.models;
import java.util.Date;

public class Transaction {
    private int transactionId;
    private Date date;
    private int uesrId;
    private double amount;
    private String transactionType;
    private int targetUserId;

    public int getTransactionId() {
        return this.transactionId;
    }
    public void setTransactionId(int transactionId) {
        this.transactionId = transactionId;
    }

    public Date getDate() {
        return this.date;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public int getUesrId() {
        return this.uesrId;
    }
    public void setUesrId(int uesrId) {
        this.uesrId = uesrId;
    }
    
    public double getAmount() {
        return this.amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getTransactionType() {
        return this.transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public int getTargetUserId() {
        return this.targetUserId;
    }
    public void setTargetUserId(int targetUserId) {
        this.targetUserId = targetUserId;
    }


}
