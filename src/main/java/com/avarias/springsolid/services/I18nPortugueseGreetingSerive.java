package com.avarias.springsolid.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Profile("PT")
@Service("I18nSerice")
public class I18nPortugueseGreetingSerive  implements GreetingService{
    @Override
    public String sayGreeting() {
        return "Ola";
    }
}
