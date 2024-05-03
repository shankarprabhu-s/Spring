package com.springIOC;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        
        StudentDemoClass s1 = (StudentDemoClass) context.getBean("s1");
        System.out.println(s1);
        
        StudentDemoClass s2 = (StudentDemoClass) context.getBean("s2");
        System.out.println(s2);
     
    	System.out.println( "Hello World!" );
        
    }
}
