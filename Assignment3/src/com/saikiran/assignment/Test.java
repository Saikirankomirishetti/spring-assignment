package com.saikiran.assignment;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
    
		ApplicationContext context=new ClassPathXmlApplicationContext("sample.xml");
		BankAccountController accountController=(BankAccountController) context.getBean("bankAccountController");
		System.out.println("The total balance is"+ -accountController.deposit(999, 1000));
		double value=accountController.withdraw(999, 3000);
		if(value==0)
			System.out.println("Insufficient Funds");
		else
			System.out.println(value);
		System.out.println("The total balance is"+accountController.getBalance(999));
		
		if(accountController.fundTransfer(999, 888, 2000))
			System.out.println("Fund Transfer");
		else
			System.out.println("Insufficient Balance");
		
		
		
	}

}
