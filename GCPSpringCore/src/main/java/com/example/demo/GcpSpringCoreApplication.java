package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

//@SpringBootApplication
public class GcpSpringCoreApplication {

	public static void main(String[] args) {
		//SpringApplication.run(GcpSpringCoreApplication.class, args);
		//Vehicle car = new Bike();
		//car.drive();
		ApplicationContext context= new ClassPathXmlApplicationContext("SpringIOC.xml");
		//Vehicle obj=(Vehicle)context.getBean("vehicle");
		//obj.drive();
		
		//Tyre tyreObj = (Tyre) context.getBean("tyre");
		//tyreObj.display();
		Vehicle obj = (Vehicle) context.getBean("car");
		obj.drive();
	}

}
