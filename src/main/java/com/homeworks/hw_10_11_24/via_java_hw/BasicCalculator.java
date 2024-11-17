package com.homeworks.hw_10_11_24.via_java_hw;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
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
public class BasicCalculator implements Calculable {

    Calculable calculable;

    public void plus() {
        System.out.println("+");
    }

    public void minus() {
        System.out.println("-");
    }

    @Override
    public void calculate(@NotNull String operation) {
        switch (operation) {
            case "plus" -> plus();
            case "minus" -> minus();
        }
    }
}
