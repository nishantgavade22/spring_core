package com.spring.standalon_collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.standalon_collection.services.HelloWorld;

public class App {
	
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
			ApplicationContext context = new ClassPathXmlApplicationContext("standalon_collection.xml");
			
			HelloWorld hello = (HelloWorld) context.getBean("helloWorldBean");
			
			System.out.println("List: " + hello.getList());
			
			System.out.println("Set : " + hello.getSet());
			
			System.out.println("Map : " + hello.getMap());
			
			System.out.println("Props : " + hello.getProps());
					
	}
}
