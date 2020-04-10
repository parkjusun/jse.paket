package com.jse.member;

public class Member {
	public String id;// 인스턴스 변수

	public Member() {
		
		// 데이터 테이블 
		
	}// 생성자

	public void setId(String id) {
		System.out.println("지역변수 들어옴 : "+id);
		this.id = id;
		System.out.println("인스턴스변수에 저장됨 : "+this.id);
	}// 메소드

	public String getId() {
		return this.id; 
	}

}

//필드 :  클래스 -> 바디 , 인스턴스 변수, 생성자, 메서드 -> 에어리어 