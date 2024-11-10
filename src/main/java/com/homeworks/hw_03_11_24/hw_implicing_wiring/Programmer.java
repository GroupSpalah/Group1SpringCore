package com.homeworks.hw_03_11_24.hw_implicing_wiring;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
public class Programmer implements Calculable {

    @Override
    public void cos() {

    }

    @Override
    public void sin() {

    }

    public void transferToEight() {
        System.out.println("transferToEight");
    }

    public void transferToSixteen() {
        System.out.println("transferToSixteen");
    }

}
