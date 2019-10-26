package com.saikiran.assignment;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ConfigurableApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"sample.xml"});
			
		    	CustomerService cust = (CustomerService)context.getBean("customerService");
		    	
		    	System.out.println(cust);
		    	
		    	context.close();

	}

}
