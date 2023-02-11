package com.cognixia.jump.project4.models;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.MapsId;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

// Simple Customer Model for new customers

@Entity
@Table(name = "Customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_ID")
    private Integer customerID;

    @Column(name = "first_name", columnDefinition = "varchar(50)", nullable = false)
    private String firstName;

    @Column(name = "last_name", columnDefinition = "varchar(50)", nullable = false)
    private String lastName;

    @Column(name = "contact_number", columnDefinition = "varchar(50)", nullable = false)
    private String contactInfo;

    @Column(name = "user_password", columnDefinition = "varchar(10)", nullable = false)
    private String password;

    // One to One 
    @OneToMany(mappedBy = "customer")
    private BankAccount bankAccount;

    public Customer() {
    }

    public Customer(Integer customerID, String firstName, String lastName, String contactInfo, String password) {
        super();
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactInfo = contactInfo;
        this.password = password;
    }

    public Integer getCustomerID() {
        return customerID;
    }

    public void setCustomerID(Integer customerID) {
        this.customerID = customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer [customerID=" + customerID + ", firstName=" + firstName + ", lastName=" + lastName
                + ", contactInfo=" + contactInfo + ", password=" + password + "]";
    };

    

}
