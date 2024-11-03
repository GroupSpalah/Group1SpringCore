package com.via_xml;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class ThreadService {
    String name;

    public void setName(String name) {
//        System.out.println("Setter");
        this.name = name;
    }
}
