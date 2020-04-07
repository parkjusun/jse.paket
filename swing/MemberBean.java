package com.jse.swing;

public class MemberBean {
	private String userid;
	private String passward;
	private String name;
	private int age;
	
	public MemberBean(String userid,String passward,String name,int age) {
		this.userid = userid;
		this.passward = passward;
		this.name = name;
		this.age = age;
	}
	
	// id
	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getUserid() {
		return userid;
	}
	
	// 비밀번호
	public void setPassward(String passward) {
		this.passward = passward;
	}
	public String getPassward() {
		return passward;
	}
	
	// 이름
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	// 나이
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	

}
