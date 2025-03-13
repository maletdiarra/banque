package com.bankapp.models;

public abstract class Client extends User{
    protected String name;
    protected String address;
    protected String phone;
    protected String cnic;
    protected double account;
    protected String accountType;

    public String getName(){
        return this.name;
    }
    public void setName(String name){
        this.name=name;
    }
    
    public String getAddress(){
        return this.address;
    }
    public void setAddress(String address){
        this.address=address;
    }
    
    public String getPhone(){
        return this.phone;
    }
    public void setPhone(String phone){
        this.phone=phone;
    }
    
    public String getCnic(){
        return this.cnic;
    }
    public void setCnic(String cnic){
        this.cnic=cnic;
    }
    
    public double getAccount(){
        return this.account;
    }
    public void setAccount(double account){
        this.account=account;
    }

    /*public String getAccountType() {
        return this.accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }*/

}
