package com.avarias.springsolid;

import com.avarias.springsolid.controllers.MyController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringSolidApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(SpringSolidApplication.class, args);

		MyController myController = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);
	}

}
