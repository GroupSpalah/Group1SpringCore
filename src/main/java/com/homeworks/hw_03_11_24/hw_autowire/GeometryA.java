package com.homeworks.hw_03_11_24.hw_autowire;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
public class GeometryA {

    public void cos() {
        System.out.println("cos");
    }

    public void sin() {
        System.out.println("sin");
    }

}
