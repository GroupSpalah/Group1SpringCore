package com.implicing_wiring;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
public class Phone implements Callable {
    String number = "067";

    @Override
    public void call() {
        System.out.println("Call by phone");
    }
}
