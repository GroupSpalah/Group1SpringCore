package com.homeworks.hw_10_11_24.via_java_hw_v2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ConfigAppHW.class);

        BasicCalculator basicCalculator = annotationConfigApplicationContext.getBean(BasicCalculator.class);

        basicCalculator.getProgrammer().getGeometry().cos();
        basicCalculator.getProgrammer().transferToEight();
        basicCalculator.minus();

    }
}
