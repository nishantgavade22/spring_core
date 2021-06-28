package com.spring.beanlifecycle.bean;

public class Employee {

	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
	System.out.println("Employee :: set name "+name);
		this.name = name;
	}
	
}
