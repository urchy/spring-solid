package com.avarias.springsolid;

import com.avarias.springsolid.controllers.MyController;
import com.avarias.springsolid.controllers.PropertyInjectedController;
import com.avarias.springsolid.controllers.SetterInjectedController;
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


		/**
		 * This will be injected by the framework.
		 *
		 * */
		System.out.println("-----------PropertyInjectedController");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		/***
		 * Using qualifiers
		 * */
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());



	}


}
