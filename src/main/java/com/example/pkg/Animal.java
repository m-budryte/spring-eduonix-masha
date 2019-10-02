package com.example.pkg;

import java.util.List;

public class Animal {
    private String speciesName;
    private Color color;
    private Size size;
    private List<String> names;

    public Animal(){

    }

    public Animal(String speciesName, Color color, Size size) {
        this.speciesName = speciesName;
        this.color = color;
        this.size = size;
    }

    public String getSpeciesName() {
        return speciesName;
    }

    public void setSpeciesName(String speciesName) {
        this.speciesName = speciesName;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Size getSize() {
        return size;
    }

    public void setSize(Size size) {
        this.size = size;
    }

    public List<String> getNames() {
        return names;
    }

    public void setNames(List<String> names) {
        this.names = names;
    }
}
