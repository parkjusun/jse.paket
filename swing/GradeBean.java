package com.jse.swing;

/*
 * 클라이언트에서 프로그램 개발 요청이 왔습니다. * 
 * 이름과 국,영,수 세과목점수를 입력받아서() [홍길동 : 총점 ***점, * 평균***점,학점 : F] 을 출력하는 프로그램을 만들어 주세요. 
 * 단) 평균은 소수점이하는 절삭합니다 
 * 평균점수가 
 * 90점 이상 A 
 * 80점 이상이면 B 
 * 70점 이상이면 C 
 * 60점 이상이면 D 
 * 50점 이상이면 E 
 * 50점 미만이면 F 학점입니다라고 출력되게 해주세요
 */
public class GradeBean {
	public String name;
	public double korean;
	public double english;
	public double math;
	public double sum;
	double average;

	public GradeBean(String name, double korean, double english, double math) {
		this.name = name;
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	// 합계
	public void setSum(double korean, double english, double math) {
		this.korean = korean;
		this.english = english;
		this.math = math;
	}

	public double getSum() {
		return korean + english + math;
	}

	// 평균
	public double average() {
		return getSum() / 3;
	}

	// 학점
	public String averageResult() {
		String result = null;
		average = average();

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

	public String averageResult2() {
		String result = null;

		switch ((int) (average / 10)) {
		case 10:
			result = "A";
			break;
		case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		case 5:
			result = "E";
			break;
		default:
			result = "F";
			break;
		}

		return result;
	}
}
