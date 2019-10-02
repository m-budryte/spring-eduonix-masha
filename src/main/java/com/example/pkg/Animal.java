package com.example.pkg;

public class Animal {
    private double weight;
    private float height;
    private String speciesName;

    public  Animal (double weight, float height, String speciesName){
        this.weight = weight;
        this.height = height;
        this.speciesName = speciesName;
    }
    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }
}
