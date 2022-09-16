package com.md;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.md.withoutComponent.Employee1;
import com.md.withoutComponent.JavaConfig;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context= new AnnotationConfigApplicationContext(JavaConfig.class);
    	Employee1 emp= (Employee1) context.getBean("Employee1");
    	System.out.println(emp.toString());
    }
}
