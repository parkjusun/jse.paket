package com.jse.inheritance;

public class Iphone extends Cellphone{
	private String search;
	
	public Iphone(String phoneNumber, String name, String company, boolean portable, String search) {
		super(phoneNumber, name, company, portable);
		// TODO Auto-generated constructor stub
		this.search = search;
		
	}
	
	public void setSearch(String search) {
		this.search = search;
	}
	
	public String getSearch() {
		return search;
	}
	
}
