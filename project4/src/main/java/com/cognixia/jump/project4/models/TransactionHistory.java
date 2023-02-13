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


}
