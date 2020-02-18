/**
 * andresilva created on 18/02/2020 inside the package - com.avarias.springsolid.services
 */
package com.avarias.springsolid.services;

import org.springframework.stereotype.Service;

@Service
public class PropertyInjectedGreetingService implements GreetingService {
    @Override
    public String sayGreeting() {
        return "Hello World from property";
    }
}
