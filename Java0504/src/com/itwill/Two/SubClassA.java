package com.itwill.Two;

import com.itwill.One.AccessTest;
//class AccessTest{ }

class SubOne extends AccessTest{
	
	public void prn(){
		System.out.println("SubOne_prn() 메서드 호출");
		
		//System.out.println("a : "+a);
		//System.out.println("b : "+b);//같은클래스x,같은패키지x
		System.out.println("c : "+c);// 상속관계(public)
		System.out.println("d : "+d);// 모든 클래스o		
	}
}

public class SubClassA extends AccessTest {

	public static void main(String[] args) {
		//System.out.println("a : "+a);
		//System.out.println("b : "+b);
//		System.out.println("c : "+c);
//		System.out.println("d : "+d);
		
		// => 모두 사용 X
		
		AccessTest at = new AccessTest();
		at.print();
		
//		SubClassA sa = new SubClassA();
//		System.out.println(sa.d);
		
		System.out.println("main() 호출");
		//System.out.println("a : "+at.a);
		//System.out.println("b : "+at.b);
		//System.out.println("c : "+at.c);
		System.out.println("d : "+at.d);
		
		
		SubOne so = new SubOne();
		so.prn();
		so.print(); // AccessTest객체의 메서드
		

	}

}
