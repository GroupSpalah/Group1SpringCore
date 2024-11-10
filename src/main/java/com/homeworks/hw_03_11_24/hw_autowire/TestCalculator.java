package com.homeworks.hw_03_11_24.hw_autowire;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("homeworkContext.xml");

        BasicCalculator basicCalculator = context.getBean("autowireBasicCalculator",BasicCalculator.class);

        basicCalculator.getProgrammerA().transferToEight();
        basicCalculator.getProgrammerA().getGeometryA().cos();

    }
}
