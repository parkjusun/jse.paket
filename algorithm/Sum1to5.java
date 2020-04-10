package com.jse.algorithm;

public class Sum1to5 {
	public static void main(String[] args) {
		sum();
	}

	static void sum() {
		int a = 0;
		
		for(int i=1; i<=10; i++) {
			System.out.println(i);
			a += i;
		}
		System.out.println(String.format(">>>>>>>>>%d", a));
		
		
	}
}
