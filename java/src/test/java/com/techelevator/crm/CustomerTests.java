package com.techelevator.crm;

import org.junit.Assert;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTests {
    @Test
    public void test_get_balance_due(){
        Customer customer = new Customer("Nancy", "Jones");
        Map<String,Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Grooming",70.0);
        servicesRendered.put("Walking", 30.0);
        servicesRendered.put("Sitting",50.0);

        double result = customer.getBalanceDue(servicesRendered);
        double expected = 150.0;
        Assert.assertEquals((int)expected,(int)result);

    }


}
