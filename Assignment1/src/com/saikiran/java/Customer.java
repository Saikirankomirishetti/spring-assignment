package com.saikiran.java;

public class Customer 
{
	private int customerId;
	private String customerName;
	private long customerContact;
	private String customerAddress;
	private Address address;
	
	
	
	public Customer(int customerId, String customerName, long customerContact, String customerAddress,
			Address address) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerContact = customerContact;
		this.customerAddress = customerAddress;
		this.address = address;
	}
	

	public int getCustomerId() {
		return customerId;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerContact() {
		return customerContact;
	}
	public void setCustomerContact(long customerContact) {
		this.customerContact = customerContact;
	}
	public String getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(String customerAddress) {
		this.customerAddress = customerAddress;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", customerContact="
				+ customerContact + ", customerAddress=" + customerAddress + ", address=" + address + "]";
	}
	
	


}
