package com.homeworks.hw_10_11_24.via_java_hw;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCalculator {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext annotationConfigApplicationContext =
                new AnnotationConfigApplicationContext(ConfigAppHW.class);

        BasicCalculator basicCalculator = annotationConfigApplicationContext.getBean(BasicCalculator.class);

        basicCalculator.getCalculable().calculate("sin");
        basicCalculator.calculate("minus");

    }
}
