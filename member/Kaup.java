package com.jse.member;
//키몸무게를 이용하여
//카우푸지수를 구하고
//그결과 정상, 저체중 비만 등으로 몸의 상태만 알려주는 프로그램
//
//
//체중(weight)/신장(stature)

public class Kaup {
	private double weight;
	private double statur;
	
	public void setStatur(double statur) {
		this.statur = statur;
	}
	
	public double getStatur() {
		return statur;
	}
	
	public void setWeight(double weight) {
		this.weight = weight;
	}
	
	public double getWeight() {
		return weight;
	}
	
	
	public String kapuResult(){
		String result;
		double averageWeight;
		double resultValue;
		//180/20 =
		averageWeight = (weight-100)*0.9;
		
		resultValue = weight/((statur*statur)/100);
		
		if (resultValue >= 40) {
			result = "과체중";
		}else if (resultValue > 30) {
			result = "과체중";
		}else if (resultValue > 25) {
			result = "정상";
		}else if (resultValue > 23) {
			result = "여윔";
		}else if (resultValue > 18.5) {
			result = "여윔";
		}else {
			result = "여윔";
		}
		
		
		return result;
		
	}

}
