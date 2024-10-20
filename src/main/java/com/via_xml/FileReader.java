package com.via_xml;

import lombok.*;
import lombok.experimental.FieldDefaults;


@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class FileReader {
    String fileName;

    public void action() {
        System.out.println("Read from file " + fileName);
    }
}
