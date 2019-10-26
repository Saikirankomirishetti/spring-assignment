package com.saikiran.assign;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args)
	{
      ApplicationContext factor=new ClassPathXmlApplicationContext("sample.xml");
      Question question=(Question)factor.getBean("collection");  
     System.out.println("List:"+question.getAnswers1());
     System.out.println("Set:"+question.getAnswers2());
     System.out.println("Map:"+question.getAnswers3());

		
		
		}
	
	}	