package com.jse.member;

public class MemberServiceImp implements MemberService {
	private String[] valus;
	private String all;
	private int count;

	@Override
	public void setMembers(Member[] members) {
		// TODO Auto-generated method stub
		valus = new String[5];
		all = "";
		count = 0;
	}

	@Override
	public Member[] getMemebers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub
		String[] data = String.format("%s / %s / %s / %s ", member.getName(), member.getUserid(), member.getPassword(),
				member.getAddress()).split("/");

		for (int i = 0; i < 5; i++) {
			valus = data[i].split(",");
		}
		

	}

	@Override
	public String result() {
		
		
		// TODO Auto-generated method stub
			all = "이름 : "+valus[0]+"아이디 : "+valus[1]+"비밀번호 : "+valus[2]+"주민번호 : "+valus[3];
		return all;
	}

}
