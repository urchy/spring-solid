/**
 * andresilva created on 18/02/2020 inside the package - com.avarias.springsolid.controllers
 */
package com.avarias.springsolid.controllers;

import com.avarias.springsolid.services.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class PropertyInjectedController {

    @Autowired
    public GreetingService greetingService;

    public String getGreeting(){
        return  greetingService.sayGreeting();
    }

}
