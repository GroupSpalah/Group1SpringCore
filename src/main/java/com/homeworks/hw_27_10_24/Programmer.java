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

public class Programmer {

    Geometry geometry;

    public void transferToEight() {
        System.out.println("transferToEight");
    }

    public void transferToSixteen() {
        System.out.println("transferToSixteen");
    }
}
