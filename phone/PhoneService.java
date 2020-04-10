
package com.jse.phone;

public class PhoneService {
	private Phone[] phones;
	private Cellphone[] celPhones;
	private Iphone[] iphones;
	private GalaxyNote[] galaxyNotes;
	
	public PhoneService() {
		this.phones = new Phone[3];
		this.celPhones = new Cellphone[3];
		this.iphones = new Iphone[3];
		this.galaxyNotes = new GalaxyNote[3];
		
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
	
	public void setIphones(Iphone[] iphones) {
		this.iphones = iphones;
	}
	
	public Iphone[] getIphones() {
		return iphones;
	}
	
	public void setGalaxyNotes(GalaxyNote[] galaxyNotes) {
		this.galaxyNotes = galaxyNotes;
	}
	
	public GalaxyNote[] getGalaxyNotes() {
		return galaxyNotes;
	}
	
	public void add(Phone phone,int index) {
		phones[index] = phone;
		
	}
	
	public void addCelPhone(Cellphone celPhone,int index) {
		celPhones[index] = celPhone;
	}
	
	public void addIphone(Iphone iphone, int index) {
		iphones[index] = iphone;
	}
	
	public void addGalayNote(GalaxyNote galaxyNote, int index) {
		galaxyNotes[index] = galaxyNote;
	}
	

}
