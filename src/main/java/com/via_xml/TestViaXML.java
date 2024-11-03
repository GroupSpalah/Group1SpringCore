package com.via_xml;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestViaXML {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

       /* FileReader reader = context.getBean(FileReader.class);

        reader.setFileName("Legend.txt");

        FileReader reader1 = context.getBean(FileReader.class);

        String fileName = reader1.getFileName();

        System.out.println(fileName);*/

//        reader.action();

        /*ReaderService service = context.getBean("readerService", ReaderService.class);

        service.getReader().action();

        Person person = context.getBean(Person.class);

        System.out.println(person);*/

        ReaderService service = context.getBean("newReaderService", ReaderService.class);

        service.getReader().action();
    }
}