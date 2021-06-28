package com.spring.dependency_Injection.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.spring.dependency_Injection.services.EmailService;
import com.spring.dependency_Injection.services.MessageService;

@Configuration
@ComponentScan(value={"com.spring.dependency_Injection.consumer"})
public class DIConfiguration {

	@Bean
	public MessageService getMessageService(){
		return new EmailService();
	}
}
