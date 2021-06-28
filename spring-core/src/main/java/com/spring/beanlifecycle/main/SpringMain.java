package com.spring.beanlifecycle.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.beanlifecycle.service.MyEmployeeService;

public class SpringMain {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("beanlifecycle.xml");
		MyEmployeeService service = ctx.getBean("myEmployeeService", MyEmployeeService.class);
		System.out.println("Bean retrieved from Spring Context");
		
		System.out.println("Employee Name="+service.getEmployee().getName());
		
		ctx.close();
		System.out.println("Spring Context Closed");
	}

}
