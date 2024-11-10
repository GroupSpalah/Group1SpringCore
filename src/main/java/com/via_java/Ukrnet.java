package com.via_java;

import lombok.*;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@AllArgsConstructor
@ToString
public class Ukrnet implements Sendable {
    @Override
    public void send() {
        System.out.println("Send by Ukrnet");
    }
}
