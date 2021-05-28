package com.techelevator.crm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List<String> vaccinationsList = new ArrayList<String>();

    public Pet(String name,String species){
        this.name = name;
        this.species = species;

    }

    public String listVaccinations(){
       String commaSeparated = String.join(",",vaccinationsList);
        return commaSeparated;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List<String> getVaccinationsList() {
        return vaccinationsList;
    }

    public void setVaccinationsList(List<String> vaccinationsList) {
        this.vaccinationsList = vaccinationsList;
    }
}
