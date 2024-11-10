package com.via_java;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@Import(AnotherConfig.class)
@ComponentScan(basePackages = "com.implicing_wiring")
@ImportResource("classpath:/applicationContext.xml")
public class ConfigApp {

    @Bean
    public Sendable gMail() {
        return new GMail("gmail");
    }

/*    @Bean
    public Person person() {

        GMail gMail = gMail();

        return new Person(gMail);
    }*/

    /*@Bean
    public Person person(GMail gMail) {

        return new Person(gMail);
    }*/

    @Bean
    public Person person(@Qualifier("ukrNet") Sendable sendable) {

        return Person.builder()
                .sendable(sendable)
                .build();
    }
}
