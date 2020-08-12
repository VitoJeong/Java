package com.itwill.One;

public class AccessTest {
	private		int a=10;
	/*생략*/		int	b=20;
	protected	int c=30;
	public 		int	d=40;
	
	public void print(){
		System.out.println("AccessTest_print() 호출");
		
		System.out.println("a : "+a);
		System.out.println("b : "+b);
		System.out.println("c : "+c);
		System.out.println("d : "+d);
	}
}
