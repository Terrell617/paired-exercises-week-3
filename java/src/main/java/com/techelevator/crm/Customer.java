package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;


import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List<String> pets = new ArrayList<>();

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
        double total = 0;
        for (String item : servicesRendered.keySet()) {
            double newCharge = servicesRendered.get(item);
            total += newCharge;
        }
        return total;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List<String> getPets() {
        return pets;
    }

}