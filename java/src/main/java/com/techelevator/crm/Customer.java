package com.techelevator.crm;

import com.techelevator.Person;

import java.util.List;

public class Customer extends Person {
    private String phoneNumber;
    private List<String> pets;

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;

    }

    public Customer(String firstName, String lastName) {
        super(firstName, lastName);
        phoneNumber = "";
        // this constructor must call the first constuctor with an empty string for the phoneNumber //

    }


}
