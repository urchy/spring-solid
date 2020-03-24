/**
 * andresilva created on 18/02/2020 inside the package - com.avarias.springsolid.controllers
 */
package com.avarias.springsolid.controllers;

import com.avarias.springsolid.services.GreetingService;

public class ConstructorInjectedController {

    private final GreetingService greetingService;

    public ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String getGreeting() {
        return greetingService.sayGreeting();
    }
}
