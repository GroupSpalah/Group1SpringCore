package com.homeworks.hw_03_11_24.hw_implicing_wiring;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@Component("geometry")
public class Geometry implements Calculable{

    public void cos() {
        System.out.println("cos");
    }

    public void sin() {
        System.out.println("sin");
    }

    @Override
    public void transferToEight() {

    }

    @Override
    public void transferToSixteen() {

    }

}
