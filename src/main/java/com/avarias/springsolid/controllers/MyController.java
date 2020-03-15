/**
 * andresilva created on 18/02/2020 inside the package - com.avarias.springsolid.controllers
 */
package com.avarias.springsolid.controllers;

import com.avarias.springsolid.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){

        return greetingService.sayGreeting();
    }
}
