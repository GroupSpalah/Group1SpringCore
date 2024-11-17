package com.homeworks.hw_10_11_24.via_java_hw;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("classpath:/homeworkContext.xml")
public class ConfigAppHW {

    @Bean
    public Calculable geometry() {
        return new Geometry();
    }

    @Bean
    public Calculable programmer() {
        return new Programmer();
    }


    @Bean
    public Calculable basicCalculator(@Qualifier("geometry") Calculable calculable) {//как я могу передавать Qualifier сюда?
        return new BasicCalculator(calculable);
    }
}
