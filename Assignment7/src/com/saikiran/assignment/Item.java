package com.saikiran.assignment;

public class Item 
{
	private String name;
	private String qty;
	private String price;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getQty() {
		return qty;
	}
	public void setQty(String qty) {
		this.qty = qty;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [name=" + name + ", qty=" + qty + ", price=" + price + "]";
	}
	
	
	
	
	
}
