package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Animal animal = (Animal) applicationContext.getBean("animal");

        Color color = (Color) applicationContext.getBean("blackAndWhite1");
        System.out.println(color.getColorId());
        System.out.println(animal.getColor().getColorName());
    }
}
