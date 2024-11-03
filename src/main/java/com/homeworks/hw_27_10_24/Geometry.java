package com.homeworks.hw_27_10_24;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
public class Geometry {

    public void cos() {
        System.out.println("cos");
    }

    public void sin() {
        System.out.println("sin");
    }
}
