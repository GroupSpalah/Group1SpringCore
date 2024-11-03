package com.homeworks.hw_27_10_24;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BasicCalculator {

    Programmer programmer;

    public void plus() {
        System.out.println("+");
    }

    public void minus() {
        System.out.println("-");
    }
}
