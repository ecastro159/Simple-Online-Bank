package com.cognixia.jump.project4.models;

import java.time.LocalDateTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="TransactionHistory")
public class TransactionHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionID;

    @Column
    private Integer accountNumber;
    @Column
    private Integer customerID;
    @Column
    private String transactionType;
    @Column
    private double amount;
    @Column
    private LocalDateTime accessTime;

    

    public TransactionHistory() {
    }

    

    public TransactionHistory(Integer transactionID, Integer accountNumber, Integer customerID, String transactionType,
            double amount, LocalDateTime accessTime) {
        this.transactionID = transactionID;
        this.accountNumber = accountNumber;
        this.customerID = customerID;
        this.transactionType = transactionType;
        this.amount = amount;
        this.accessTime = accessTime;
    }



    public Integer getTransactionID() {
        return transactionID;
    }
    public void setTransactionID(Integer transactionID) {
        this.transactionID = transactionID;
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
    public String getTransactionType() {
        return transactionType;
    }
    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
    public LocalDateTime getAccessTime() {
        return accessTime;
    }
    public void setAccessTime(LocalDateTime accessTime) {
        this.accessTime = accessTime;
    }

    


}
