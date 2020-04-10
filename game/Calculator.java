package com.jse.game;

import java.util.Scanner;

import org.omg.CORBA.PRIVATE_MEMBER;

public class Calculator {
	private int num1;
	private int num2;
	private int result;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	
	public int getNum1() {
		return num1;
		
	}
	
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	public int getNum2() {
		return num2;
		
	}
	
		
	public int caculator() {
		result = num1+num2;
		return result;
	}

}
