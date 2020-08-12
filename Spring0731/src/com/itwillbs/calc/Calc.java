package com.itwillbs.calc;

public class Calc {
	// 계산기 객체 (+ - * /)
	
	// 값을 저장하는 변수 
	private int num1;
	private int num2;
	
	
	public int getNum1() {		return num1;	}
	public int getNum2() {		return num2;	}
	public void setNum1(int num1) {		this.num1 = num1;	}
	public void setNum2(int num2) {		this.num2 = num2;	}
	
	
	// +
	public void add(){
		System.out.println("더하기 !");
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	public void add(int num1,int num2){
		System.out.println("더하기 !");
		System.out.println(num1+" + "+num2+" = "+(num1+num2));
	}
	
	
	// -
	public void sub(){
		System.out.println("빼기 !");
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}
	public void sub(int num1,int num2){
		System.out.println("빼기 !");
		System.out.println(num1+" - "+num2+" = "+(num1-num2));
	}
	// *
	public void mul(){
		System.out.println("곱하기 !");
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}
	public void mul(int num1,int num2){
		System.out.println("곱하기 !");
		System.out.println(num1+" * "+num2+" = "+(num1*num2));
	}
	// /
	public void div(){
		System.out.println("나누기 !");
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
	}
	public void div(int num1,int num2){
		System.out.println("나누기 !");
		System.out.println(num1+" / "+num2+" = "+(num1/num2));
	}
	
	
	

}
