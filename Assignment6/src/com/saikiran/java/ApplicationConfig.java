package com.saikiran.java;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.saikiran.java")
@PropertySource(value = "dbConfig.properties")
public class ApplicationConfig 
{
	
	

}
