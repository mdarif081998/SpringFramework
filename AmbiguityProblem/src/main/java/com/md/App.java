package com.md;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/md/config.xml");
        Addition add = (Addition)context.getBean("add");
        add.doSum();
    }
}
