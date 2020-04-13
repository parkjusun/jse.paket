package com.jse.member;

public class MemberServiceImp implements MemberService {
	private Member[] members;
	private int count;

	public MemberServiceImp() {
		// TODO Auto-generated constructor stub
		members = new Member[5];
	}

	@Override
	public void setMembers(Member[] members) {
		// TODO Auto-generated method stub

	}

	@Override
	public Member[] getMemebers() {
		// TODO Auto-generated method stub

		return members;
	}

	@Override
	public void add(Member member) {
		// TODO Auto-generated method stub
		members[count] = member;
		
		
		count++;
		
	}





}
