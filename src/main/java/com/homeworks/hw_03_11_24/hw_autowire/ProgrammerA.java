package com.homeworks.hw_03_11_24.hw_autowire;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProgrammerA {

    GeometryA geometryA;

    public void transferToEight() {
        System.out.println("transferToEight");
    }

    public void transferToSixteen() {
        System.out.println("transferToSixteen");
    }

}
