package com.implicing_wiring;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@NoArgsConstructor
@ToString
@Component
public class Skype implements Callable {
    @Override
    public void call() {
        System.out.println("Call by skype");
    }
}
