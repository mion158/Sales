package com.code.Sales.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="CUSTOMERS")

public class Customer {
    /**CUSTOMER_ID BIGINT PRIMARY KEY AUTOINCREMENT,
    FIRST_NAME VARCHAR(64),
    LAST_NAME VARCHAR(64),
    EMAIL VARCHAR(200) UNIQUE,
    ADDRESS VARCHAR(64),
    CITY VARCHAR(65),
    POSTCODE VARCHAR(12) */

    @Id
    @Column(name="CUSTOMER_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="FIRST_NAME")
    private String firstName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="EMAIL")
    private String email;

    @Column(name="ADDRESS")
    private String address;

    @Column(name="CITY")
    private String city;

    @Column(name="POSTCODE")
    private String postCode;

    public long getId () {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return firstName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }

    public String getCity(){
        return city;
    }
    public void setCity(String city){
        this.city = city;
    }

    public String getPostcode(){
        return postCode;
    }
    public void setPostcode(String postCode){
        this.postCode = postCode;
    }

}
