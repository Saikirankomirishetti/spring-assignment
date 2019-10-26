package com.saikiran.java;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{

	public static void main(String[] args) 
	{

		ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
	    
		Customer cust= (Customer)context.getBean("c1");
		   System.out.println(cust);
	      
		
		
		
	}

}
