package com.jse.grade;

import lombok.Data;


public class GradeServiceImpl implements GradeService{
	private Grade[] grades;
	private int count;
	
	public GradeServiceImpl() {
		grades = new Grade[3];
		count = 0;
		
	}
	@Override
	public void setGrades(Grade[] grades) {
		this.grades = grades;
	}
	
	@Override
	public Grade[] getGrades() {
		return grades;
	}
	
	@Override
	public void add(Grade grade) {
		grades[count] = grade;
		count++;	
		
	}
	@Override
	public void setCount(int count) {
		this.count = count;
		
	}
	@Override
	public void getCount() {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public double sum(Grade grade) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double average(Grade grade) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String averageResult2(Grade grade) {
		// TODO Auto-generated method stub
		
		String result = null;
		int average = (int) average(grade);

		if (average >= 90) {
			result = "A";
		} else if (average >= 80) {
			result = "B";
		} else if (average >= 70) {
			result = "C";
		} else if (average >= 60) {
			result = "D";
		} else if (average >= 50) {
			result = "E";
		} else {
			result = "F";
		}
		return result;
	}
	
	@Override
	public String printGrades() {
		// TODO Auto-generated method stub
		String result = "";
		grades = getGrades();

		for (int i = 0; i < 3; i++) {
			result +=grades[i].toString();
		}
		return result;
	}
	
	@Override
	public String ranking() {
		// TODO Auto-generated method stub
		String result ="";
		
		int a = grades[0].sum;
		int y = grades[1].sum;
		int z = grades[2].sum;
		
		if (a > y && a>z) {
			if (y > z ) {
				result = "1등 :" + grades[0].getName() + " 2등:" + grades[1].getName() + " 3등:"
						+ grades[2].getName();
			} else if (z > y) {
				result ="1등 :" + grades[0].getName() + " 2등:" + grades[2].getName() + " 3등:"
						+ grades[1].getName();
			}
		} else if (y > a && y>z) {
			if (a > z) {
				result ="1등 :" + grades[1].getName() + " 2등:" + grades[0].getName() + " 3등:"
						+ grades[2].getName();
			} else if (z > a) {
				result ="1등 :" + grades[1].getName() + " 2등:" + grades[2].getName() + " 3등:"
						+ grades[0].getName();
			}
		} else if (z > y && z>a) {
			if (y > a) {
				result ="1등 :" + grades[2].getName() + " 2등:" + grades[1].getName() + " 3등:"
						+ grades[0].getName();
			} else if (a > y) {
				result ="1등 :" + grades[2].getName() + " 2등:" + grades[0].getName() + " 3등:"
						+ grades[1].getName();
			}
		}

		return result;
	}
	
}
