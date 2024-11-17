package com.homeworks.hw_10_11_24.via_java_hw;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.jetbrains.annotations.NotNull;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
public class Programmer implements Calculable {

    public void transferToEight() {
        System.out.println("transferToEight");
    }

    public void transferToSixteen() {
        System.out.println("transferToSixteen");
    }

    @Override
    public void calculate(@NotNull String operation) {
        switch (operation) {
            case "transferToEight" -> transferToEight();
            case "transferToSixteen" -> transferToSixteen();
        }
    }
}
