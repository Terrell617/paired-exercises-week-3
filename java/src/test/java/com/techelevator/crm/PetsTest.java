package com.techelevator.crm;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class PetsTest {
    @Test
    public void test_list_vaccinations_check_for_commas() {
        Pet p = new Pet("Doggo","Dog");
        List<String> vax = new ArrayList<>();
        vax.add("Rabies");
        vax.add("Distemper");
        vax.add("Parvo");
        p.setVaccinationsList(vax);
        String result = p.listVaccinations();
        String expected = "Rabies, Distemper, Parvo";

    }

}
