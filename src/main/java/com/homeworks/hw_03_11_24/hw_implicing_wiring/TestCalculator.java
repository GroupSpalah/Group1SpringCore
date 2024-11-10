package com.homeworks.hw_03_11_24.hw_implicing_wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("homeworkContext.xml");

        BasicCalculator basicCalculator = context.getBean(BasicCalculator.class);

        basicCalculator.getProgrammer().transferToEight();
        basicCalculator.getGeometry().cos();

    }
}
