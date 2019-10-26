package com.saikiran.assignment;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.saikiran")
public class ApplicationConfig 
{
@Bean	
public BankAccountRepositoryImpl bankAccountRepositoryImpl()
{
	
	BankAccountRepositoryImpl	bankAccountRepositoryImpl = new BankAccountRepositoryImpl();
	bankAccountRepositoryImpl.setUrl("jdbc:mysql://localhost:3306");
	bankAccountRepositoryImpl.setUser("root");
	bankAccountRepositoryImpl.setPassword("123456");
	return bankAccountRepositoryImpl;

}
}
