package com.example.pkg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ApplicationStart {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("Beans.xml");

        System.out.println("------------------");
        System.out.println("Point10:");
        Point point10 = (Point) applicationContext.getBean("Point10");
        System.out.println(point10.getX());
        System.out.println(point10.getY());

        System.out.println("------------------");
        System.out.println("threeDPoint11:");
        threeDPoint threeDPoint10 = (threeDPoint) applicationContext.getBean("threeDPoint11");
        System.out.println(threeDPoint10.getX());
        System.out.println(threeDPoint10.getY());
        System.out.println(threeDPoint10.getZ());

    }
}
