package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");
        Calculator calculator = (Calculator) applicationContext.getBean("calc");

        System.out.println(calculator.add());
        System.out.println(calculator.divide());
        System.out.println(calculator.multiply());
        System.out.println(calculator.substract());
    }
}
