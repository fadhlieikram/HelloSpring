package com.tutorialspoint;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApps {
	public static void main(String[] args){
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
		
		HelloWorld objA = (HelloWorld)context.getBean("HelloWorldBean");
		objA.setMessage("Hello ObjA");
		objA.getMessage();
		
		HelloWorld objB = (HelloWorld)context.getBean("HelloWorldBean");
		objB.setMessage("Hello ObjB");
		objB.getMessage();
		
		context.registerShutdownHook();
		
	}
}
