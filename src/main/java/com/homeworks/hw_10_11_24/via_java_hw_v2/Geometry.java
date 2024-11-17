package com.homeworks.hw_10_11_24.via_java_hw_v2;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@Component("geometry")
public class Geometry {

    public void cos() {
        System.out.println("cos");
    }

    public void sin() {
        System.out.println("sin");
    }

}
