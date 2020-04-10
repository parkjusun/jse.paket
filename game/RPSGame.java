package com.jse.game;

import java.util.Random;


import java.util.Scanner;

import com.sun.jmx.snmp.agent.SnmpUserDataFactory;

public class RPSGame {
	private int userValue;
	private int computerValue;
	private String userResultName;
	private String PCResultName;
	private String resultName;
	

	public void setUserValue(int userValue) {
		this.userValue = userValue;
	}
	
	public String getUserValue() {
		RPSGame rps = new RPSGame();
		userResultName = rps.rool(userValue);
		
		return this.userResultName;
	}
	

	public void setPcValue(int computerValue) {
		this.computerValue = computerValue;
	}
	
	public String getPcValue() {
		RPSGame rps = new RPSGame();
		PCResultName = rps.rool(computerValue);
		
		return this.PCResultName;
	}	
	
	public String rool(int value) {		
		switch (value) {
		case 1:
			this.resultName = "가위";
			break;
		case 2:
			this.resultName = "바위";
			break;
		case 3:
			this.resultName = "보";
			break;

		default:
			break;
		}
		
		return resultName;
	}	
	
	public String rpsGame() {
		String resulte;
		
		if ((userValue == 1 && computerValue == 3) ||
				(userValue == 2 && computerValue == 1) ||
				(userValue == 3 && computerValue == 2)) {
			resulte = "유저승리";
			
		} else if ((userValue == 1 && computerValue == 1) ||
				(userValue == 2 && computerValue == 2) ||
				(userValue == 3 && computerValue == 3)) {
			
			resulte = "무승부";
			
		} else {
			
			resulte = "컴퓨터 승리";
		}
		
		return resulte;
		
	}
	
}
