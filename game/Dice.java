package com.jse.game;

import java.util.Random;
import java.util.Scanner;
import java.util.Random;

public class Dice {
	private String userResult;
	private String pcResult;
	private String finalResult;
	public int diceInt;
	
	public void setUser(String userResult) {
		this.userResult = userResult;
	}
	
	public String getUser() {
		return this.userResult;
	}
	
	//PC 랜덤 숫자 계산
	public void setpc(int diceInt) {

		this.diceInt = diceInt;
		
		if(diceInt%2 == 0) {
			pcResult ="짝";
		}else {
			pcResult ="홀";
		}
	}
	//PC 랜덤 숫자 계산 값 출력 
	public int getpcint() {
		return this.diceInt;
	}
	
	//PC홀/짝 출력
	public String getpc() {
		return this.pcResult;
	}
	
	public String dice() {
		if(this.userResult.equals(this.pcResult)) {
			finalResult = "맞음";
		}else {
			finalResult = "틀림";
		}
		return finalResult;
	}

}
