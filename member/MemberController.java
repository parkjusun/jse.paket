
package com.jse.member;

public class MemberController {
	
	
	public static void main(String[] args) {
		MemberServiceImp serviceImp = new MemberServiceImp();
		Member member = new Member();
		
		
		member.setName("홍길동,유관순,이순신,신사임당,이도");
		member.setUserid("hong,you,Lee,sin,leedong");
		member.setPassword("1,1,1,1,1");
		member.setAddress("900101-1,960101-1,890101-1,880101-1,891001-1");
		
	
	System.out.println(serviceImp.result());
	}
}
