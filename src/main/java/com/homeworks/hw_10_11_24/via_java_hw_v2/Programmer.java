package com.homeworks.hw_10_11_24.via_java_hw_v2;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Programmer {

    @Autowired
    Geometry geometry;

    public void transferToEight() {
        System.out.println("transferToEight");
    }

    public void transferToSixteen() {
        System.out.println("transferToSixteen");
    }

}
