package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApps {
	public static void main(String[] args){
		
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		try{
		HelloWorld objA = (HelloWorld)context.getBean("HelloWorldBean");
		objA.setMessage1("World Message1");
		objA.setMessage2("World Message2");
		objA.getMessage1();
		objA.getMessage2();
		
		HelloIndia objB = (HelloIndia)context.getBean("HelloIndiaBean");
		objB.setMessage1("India  Message1");
		objB.getMessage1();
		objB.getMessage2();
		objB.getMessage3();
		}
		finally{
			context.registerShutdownHook();
			context.close();
			}
		
	}
}
