package com.avarias.springsolid;

import com.avarias.springsolid.controllers.I18nController;
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

		I18nController i18nController = (I18nController) ctx.getBean("i18nController");
		System.out.println(i18nController.sayGreeting());


		MyController myController = (MyController) ctx.getBean("myController");

		System.out.println("---- primary bean");
		System.out.println(myController.sayHello());


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
