package com.homeworks.hw_10_11_24.via_java_hw_v2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigAppHW {

    @Bean
    public Geometry geometry() {
        return new Geometry();
    }

    @Bean
    public Programmer programmer() {
        return new Programmer();
    }

    @Bean
    public BasicCalculator basicCalculator() {//как я могу передавать Qualifier сюда?
        return new BasicCalculator();
    }
}
