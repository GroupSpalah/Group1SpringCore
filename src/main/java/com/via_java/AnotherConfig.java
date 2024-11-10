package com.via_java;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfig {
    @Bean
    public Sendable ukrNet() {
        return new Ukrnet();
    }
}
