package com.via_java;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestViaJava {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        Person person = context.getBean(Person.class);

//        System.out.println(person.getGMail().getName());

//        person.getSendable().send();
//        person.getMan().getReaderService().getReader().action();
    }
}
