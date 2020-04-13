package com.jse.member;

import lombok.Data;

@Data
public class Member {
	
	private String name, userid, password,ssn, addres;
	
	public void member(String name,String userid,String password,String ssn, String addres) {
		this.name = name;
		this.userid = userid;
		this.password = password;
		this.ssn = ssn;
		this.addres = addres;
	}


}