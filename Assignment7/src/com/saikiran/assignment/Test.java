package com.saikiran.assignment;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("sample.xml");

        System.out.println(context.getBean("customer", Customer.class));

		
	}

}
