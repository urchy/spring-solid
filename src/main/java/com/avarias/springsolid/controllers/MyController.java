/**
 * andresilva created on 18/02/2020 inside the package - com.avarias.springsolid.controllers
 */
package com.avarias.springsolid.controllers;

import com.avarias.springsolid.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

<<<<<<< HEAD
    public String sayHello() {
=======
    private final GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
>>>>>>> 340cf9fee05c8bce0c34286ef39621bf689dd979

        return greetingService.sayGreeting();
    }
}
