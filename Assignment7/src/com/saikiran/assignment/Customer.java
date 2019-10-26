package com.saikiran.assignment;

class Customer {

	private Item item;

	private String itemName;
	private String price;
	
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Customer [item=" + item + ", itemName=" + itemName + ", price=" + price + "]";
	}
	
	

}
