package com.homeworks.hw_03_11_24.hw_autowire;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BasicCalculator {

    ProgrammerA programmerA;

    public void plus() {
        System.out.println("+");
    }

    public void minus() {
        System.out.println("-");
    }
}
