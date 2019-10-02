package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Animal animal = (Animal) applicationContext.getBean("animal");
        System.out.println("height " + animal.getHeight());
        System.out.println("weight " + animal.getWeight());
        System.out.println("name " + animal.getSpeciesName());
    }
}
