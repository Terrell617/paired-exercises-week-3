package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
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


    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        Map<String,Double> servicesRendered = new HashMap<>();

    }
}
