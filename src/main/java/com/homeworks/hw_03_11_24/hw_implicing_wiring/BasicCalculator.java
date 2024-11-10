package com.homeworks.hw_03_11_24.hw_implicing_wiring;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BasicCalculator {

    @Autowired
    Calculable programmer;

    @Autowired
    Calculable geometry;

    public void plus() {
        System.out.println("+");
    }

    public void minus() {
        System.out.println("-");
    }
}
