package com.md.withoutComponent;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages="com.md")  // required only if we use @component to create bean by default
public class JavaConfig {
	
	@Bean  // we can Specify a bean name @Bean("employee") or else default name will be same as below method name Employee1
	public Employee1 Employee1() {
		Employee1 emp = new Employee1();
		return emp;
	}

}
