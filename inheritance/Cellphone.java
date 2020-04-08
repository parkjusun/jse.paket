package com.jse.inheritance;

public class Cellphone extends Phone{
	private boolean portable;
	private String move;
	public Cellphone(String phoneNumber, String name, String company, boolean portable) {
		super(phoneNumber, name, company);
		
		setPortable(portable);
	}
	

	public boolean isPortable() {
		return portable;
	}
	public void setPortable(boolean portable) {
		if (portable) {
			this.move = "휴대 가능";
		}else {
			this.move = "휴대 불가능";
		}
	}
	
	public void setMove(String move) {
		this.move = move;
	}
	public String getMove() {
		return move;
	}
	
	
}
