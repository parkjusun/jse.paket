package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	
	public PhoneService() {
		phones = new Phone[3];
		
	}
	
	
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	
	public Phone[] getPhones() {
		return phones;
	}
	
	public void add(Phone phone,int index) {
		phones[index] = phone;
		
	}

}
