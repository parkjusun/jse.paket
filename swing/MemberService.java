package com.jse.swing;

public class MemberService {
	private MemberBean[] members;
	int i;


	public MemberService() {
		members = new MemberBean[3];
		i =0;
	}
	
	public void setMembers(MemberBean[] members) {
		this.members = members;
	}
	
	public MemberBean[] getMembers() {
		return members;
	}
	
	public void add(MemberBean member) {
		members[i] = member;
		
		i++;
	}

}
