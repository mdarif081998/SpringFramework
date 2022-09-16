package com.md;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
		/*// creating IOC Container using Bean Factory
		 * System.out.println( "Constructor injection" ); Resource r=new
		 * ClassPathResource("/com/md/config.xml"); BeanFactory factory=new
		 * XmlBeanFactory(r);
		 * 
		 * Employee s=(Employee)factory.getBean("emp"); s.show();
		 * 
		 * System.out.println("Setter Injection"); Employee
		 * e1=(Employee)factory.getBean("emp1"); e1.show();
		 * 
		 * Employee e2 = (Employee) factory.getBean("emp2"); e2.show();
		 */
    	
    	  // Creating IOC Container using Application Context
//    	System.out.println("Constructor Injection");
    	ApplicationContext context = new ClassPathXmlApplicationContext("com/md/config.xml");
//		
//		  Employee e1= (Employee)context.getBean("emp"); e1.show();
//		 
    	
//    	System.out.println("Setter Injection");
    	Employee e2=(Employee) context.getBean("emp1");
    	System.out.println(e2.toString());
    	
		/*
		 * Employee e3=(Employee) context.getBean("emp2");
		 * System.out.println(e3.toString());
		 */
    }
}
