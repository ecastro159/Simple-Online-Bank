package com.cognixia.jump.project4.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "BankAccount")
public class BankAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer accountNumber;

    @Column(nullable = false)
    private Integer customerID;

    @Column(columnDefinition = "double default 0", name = "checking_account")
    private double checkingAccount;

    @Column(columnDefinition = "double default 0", name = "savings_account")
    private double savingsAccount;

    // One to One Relation to Customer
    // @ManyToOne
    // @JoinColumn(name = "customer_ID")
    // private Customer customer;

    public BankAccount(Integer accountNumber, Integer customerID, double checkingAccount, double savingsAccount,
            Customer customer) {
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.checkingAccount = checkingAccount;
        this.savingsAccount = savingsAccount;
    }

    public Integer getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Integer accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public double getCheckingAccount() {
        return checkingAccount;
    }

    public void setCheckingAccount(double checkingAccount) {
        this.checkingAccount = checkingAccount;
    }

    public double getSavingsAccount() {
        return savingsAccount;
    }

    public void setSavingsAccount(double savingsAccount) {
        this.savingsAccount = savingsAccount;
    }

    @Override
    public String toString() {
        return "BankAccount [accountNumber=" + accountNumber + ", customerID=" + customerID + ", checkingAccount="
                + checkingAccount + ", savingsAccount=" + savingsAccount + "]";
    }

}
