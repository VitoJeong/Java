package com.itwillbs.calc;

public class MyCalc {
	// 사용자로 부터 값 2개를 전달 저장
	// 계산기능 추가(직접 구현x)
	// 계산기 객체를 생성 -> 계산기에 번호입력
	
	private int num1;
	private int num2;
	Calc c;
	
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public void setC(Calc c) {
		this.c = c;
	}
	
	
	public void myAdd(){
		c.add(num1, num2);
	}
	public void mySub(){
		c.sub(num1, num2);		
	}
	public void myMul(){
		c.mul(num1, num2);
	}
	public void myDiv(){
		c.div(num1, num2);
	}
	
	
	
	

}
