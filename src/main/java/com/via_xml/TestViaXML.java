package com.via_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestViaXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

//        FileReader reader = context.getBean(FileReader.class);

//        reader.action();

        ReaderService service = context.getBean(ReaderService.class);

        service.getReader().action();
    }
}