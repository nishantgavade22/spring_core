package com.spring.dependency_Injection.test;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.dependency_Injection.configuration.DIConfiguration;
import com.spring.dependency_Injection.consumer.MyApplication;

public class ClientApplication {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DIConfiguration.class);
		MyApplication app = context.getBean(MyApplication.class);
		
		app.processMessage("Hi Nishant", "nishant@gmail.com");
		
		//close the context
		context.close();
	}

}
