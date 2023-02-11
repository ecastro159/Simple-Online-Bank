package com.cognixia.jump.project4.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

// Simple Customer Model for new customers

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer customerID;

    @Column(name = "first_name", nullable=false)
    private String firstName;


    @Column(name = "last_name", nullable=false)
    private String lastName;

    @Column(name = "contact_info", nullable = false)
    private String contactInfo;


    
}
