package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Animal zebra1 = (Animal) applicationContext.getBean("zebra1");
        Animal zebra2 = (Animal) applicationContext.getBean("zebra2");
        Animal zebra3 = (Animal) applicationContext.getBean("zebra3");

        System.out.println(zebra1.getColor().getColorName());
        System.out.println(zebra2.getColor().getColorName());
        System.out.println(zebra3.getColor().getColorName());
    }
}
