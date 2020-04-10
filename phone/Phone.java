package com.jse.phone;

public class Phone {
	private String phoneNumber, name, company;
	
	
	public Phone(String phoneNumber,String name,String company) {
		this.phoneNumber = phoneNumber;
		this.name = name;
		this.company = company;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public String getCompany() {
		return company;
	}

	@Override
	public String toString() {
		return "Phone [phoneNumber=" + phoneNumber + ", name=" + name + ", company=" + company + "]";
	}
	
	


}


class Cellphone extends Phone{
	private boolean portable;
	private String move;
	
	public Cellphone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company);
		this.portable = portable;
		setPortable(this.portable);
	}
	

	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
//		if (portable) {
//			this.move = "휴대 가능";
//		}else {
//			this.move = "휴대 불가능";
//		}
//		
		this.move = (portable)? "휴대 가능":"휴대 불가능";
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString()+", portable"+portable+", move"+move;
	}
	
}


class Iphone extends Cellphone{
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
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + ", search = "+ search;
	}
}

class GalaxyNote extends Iphone{
	private String bigSize;

	public GalaxyNote(String phoneNumber, String name, String company, boolean portable, String search, String bigSize) {
		super(phoneNumber, name, company, portable, search);
		// TODO Auto-generated constructor stub
		
		this.bigSize = bigSize;
		
	}
	
	public void setBigSize(String bigSize) {
		this.bigSize = bigSize;
	}
	
	public String getBigSize() {
		return bigSize;
	}
	@Override
	public String toString() {
		return "GalaxyNote [bigSize=" + bigSize + "]";
	}
	
}




