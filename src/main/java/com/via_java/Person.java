package com.via_java;

import com.implicing_wiring.Man;
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
public class Person {
    GMail gMail;
    Sendable sendable;

    @Autowired
    Man man;
}
