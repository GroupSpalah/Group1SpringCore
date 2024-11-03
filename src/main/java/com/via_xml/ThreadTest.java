package com.via_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ThreadTest {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        ThreadService service = context.getBean(ThreadService.class);

        System.out.println(service.getName());
    }
}
