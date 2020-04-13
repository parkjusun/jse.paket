package com.jse.algorithm;

import java.util.Scanner;

public class Gugudan {
	int index;
	int resut;

	public static void main(String[] args) {
		

		gugudanRule();

	}

	static void gugudanRule() {
		int index = 0;
		int resut = 0;
			
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 6; j++) {
				resut = i * j;
								
					System.out.print(j + " * " + i + " = " + resut+"\t");
				
			}
			System.out.println();
			

		}
		System.out.println();
		
		for (int i = 1; i < 10; i++) {
			for (int j = 6; j < 10; j++) {
				resut = i * j;
				
				
					System.out.print(j + " * " + i + " = " + resut+"\t");
				
			}
			System.out.println();
			

		}
	}

}
