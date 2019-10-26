package com.saikiran;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("singleton")
public class Customer 
{
	@Autowired
	@Qualifier("item1")
	private Item item1;
	@Autowired
	@Qualifier("item2")
	private Item item2;
	@Autowired
	@Qualifier("item3")
	private Item item3;
	
	ApplicationContext applicationContext = null;

	public Item getItem1() {
		return item1;
	}

	public void setItem1(Item item1) {
		this.item1 = item1;
	}

	public Item getItem2() {
		return item2;
	}

	public void setItem2(Item item2) {
		this.item2 = item2;
	}

	public Item getItem3() {
		return item3;
	}

	public void setItem3(Item item3) {
		this.item3 = item3;
	}

	
	@Override
	public String toString() {
		return "Customer [item1=" + item1 + ", item2=" + item2 + ", item3=" + item3 + ", applicationContext="
				+ applicationContext + "]";
	}
	
	
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		this.applicationContext=applicationContext;
	}
}
