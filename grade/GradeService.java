package com.jse.grade;

public interface GradeService {
	public void setGrades(Grade[] grades);
	public Grade[] getGrades();
	public void setCount(int count);
	public void getCount();
	public void add(Grade grade);
	public double sum(Grade grade);
	public double average(Grade grade);
	public String averageResult2(Grade grade);
	public String printGrades();
	public String ranking();
}
