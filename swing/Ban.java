package com.jse.swing;

public class Ban {
	private Grade[] grades;
	public Ban() {
		grades = new Grade[100];
		
	}
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	
	public Grade[] getGrades() {
		return grades;
	}
}
