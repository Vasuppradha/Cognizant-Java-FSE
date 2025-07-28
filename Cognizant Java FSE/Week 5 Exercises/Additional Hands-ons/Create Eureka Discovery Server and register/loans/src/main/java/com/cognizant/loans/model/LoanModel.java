package com.cognizant.loans.model;

import org.springframework.stereotype.Component;

@Component
public class LoanModel {

    private String number;
    private String type;
    private int loan;
    private int emi;
    private int tenure;

    public LoanModel() {
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getLoan() {
        return loan;
    }

    public void setLoan(int loan) {
        this.loan = loan;
    }

    public int getEmi() {
        return emi;
    }

    public void setEmi(int emi) {
        this.emi = emi;
    }

    public int getTenure() {
        return tenure;
    }

    public void setTenure(int tenure) {
        this.tenure = tenure;
    }

    public LoanModel(String number, String type, int loan, int emi, int tenure) {
        this.number = number;
        this.type = type;
        this.loan = loan;
        this.emi = emi;
        this.tenure = tenure;
    }

    @Override
    public String toString() {
        return "LoanModel{" +
                "number='" + number + '\'' +
                ", type='" + type + '\'' +
                ", loan=" + loan +
                ", emi=" + emi +
                ", tenure=" + tenure +
                '}';
    }
}
