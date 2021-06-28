package com.spring.dependency_Injection.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.dependency_Injection.consumer.MyXMLApplication;

public class ClientXMLApplication {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("dependency_injection.xml");
		MyXMLApplication app = context.getBean(MyXMLApplication.class);

		app.processMessage("Hi Nishant", "nishant@gmail.com");

		// close the context
		context.close();
	}

}
