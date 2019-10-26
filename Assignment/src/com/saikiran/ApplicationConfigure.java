package com.saikiran;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.saikiran")
public class ApplicationConfigure
{
		Item item=	 new Item();
	@Bean(name = "item1")
	public Item item1()
	{

	item.setItemName("IceCream");
	item.setItemPrice("1000");
		return item;
		
	}
	@Bean(name = "item2")
	public Item item2()
	{
		return item;
		
	}
	@Bean(name = "item3")
	public Item item()
	{
		return item;
		
	}	
	
}
