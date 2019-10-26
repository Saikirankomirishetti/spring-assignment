package com.saikiran;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{
		ApplicationContext context=	new AnnotationConfigApplicationContext(ApplicationConfigure.class);
		System.out.println(context.getBean("customer", Customer.class));
		
	}

}
