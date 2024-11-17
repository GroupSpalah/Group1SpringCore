package com.homeworks.hw_10_11_24.via_java_hw;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@Component("geometry")
public class Geometry implements Calculable {

    public void cos() {
        System.out.println("cos");
    }

    public void sin() {
        System.out.println("sin");
    }


    @Override
    public void calculate(@NotNull String operation) {
        switch (operation) {
            case "cos" -> cos();
            case "sin" -> sin();
        }
    }
}
