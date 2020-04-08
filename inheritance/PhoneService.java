package com.jse.inheritance;

public class PhoneService {
	private Phone[] phones;
	private Cellphone[] celPhones;
	
	public PhoneService() {
		phones = new Phone[3];
		celPhones = new Cellphone[3];
	}
	
	
	public void setPhones(Phone[] phones) {
		this.phones = phones;
	}
	
	public Phone[] getPhones() {
		return phones;
	}
	
	public void setCelPhones(Cellphone[] celPhones) {
		this.celPhones = celPhones;
	}
	
	public Cellphone[] getCelPhones() {
		return celPhones;
	}
	
	public void add(Phone phone,int index) {
		phones[index] = phone;
		
	}
	
	public void addCelPhone(Cellphone celPhone,int index) {
		celPhones[index] = celPhone;
	}
	

}
