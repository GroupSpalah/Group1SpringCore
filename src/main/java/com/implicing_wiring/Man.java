package com.implicing_wiring;

import com.via_xml.ReaderService;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@FieldDefaults(level = AccessLevel.PRIVATE)
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class Man {
    @Autowired
    @Qualifier("skype")
    Callable callable;

    @Autowired
    ReaderService readerService;
}
