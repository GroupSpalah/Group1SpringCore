package com.homeworks.hw_27_10_24;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        BasicCalculator basicCalculator = context.getBean(BasicCalculator.class);

        basicCalculator.getProgrammer().getGeometry().cos();

    }
}
