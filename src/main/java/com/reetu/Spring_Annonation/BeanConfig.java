package com.reetu.Spring_Annonation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import com.reetu.beans.Address;
import com.reetu.beans.Employee;

@Configuration
public class BeanConfig {
	@Scope("prototype")
	@Bean
	Employee getEmployee() {
		return new Employee();
	}
	
	@Scope("prototype")
	//by default: //@Scope("singleton")
	@Bean
	Address getAddress() {
		return new Address();
	}
}
