package com.bankapp.models;

public class CompanyClient {
    private String companyName;
    private String ncc;
    private String empAccount;

    public String getCompanyName() {
        return this.companyName;
    }
    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNcc() {
        return this.ncc;
    }
    public void setNcc(String ncc) {
        this.ncc = ncc;
    }

    public String getEmpAccount() {
        return this.empAccount;
    }
    public void setEmpAccount(String empAccount) {
        this.empAccount = empAccount;
    }


}
