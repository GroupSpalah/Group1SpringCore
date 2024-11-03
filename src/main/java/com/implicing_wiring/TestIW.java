package com.implicing_wiring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestIW {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        Man man = context.getBean(Man.class);

//        System.out.println(man.getPhone().getNumber());

        man.getSkype().call();
    }
}