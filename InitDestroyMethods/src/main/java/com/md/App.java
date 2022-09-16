package com.md;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.md.stereotype.Student4;


public class App 
{
    public static void main( String[] args )
    {
        AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/md/stereotype/config.xml");
        context.registerShutdownHook();
        Student4 s1= (Student4) context.getBean("student");
        System.out.println(s1.toString());
        
        
        // Use of Spring Expression Parser
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression exp= temp.parseExpression("22+2*5+10/2");
        System.out.println(exp.getValue());
    }
}
