package com.itwillbs.calc;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class MainClass {

	public static void main(String[] args) {
		// 계산기 생성해서 
		// 값 10,20 연산출력  (강한 결합-> 데이터처리)
		Calc c = new Calc();
		c.setNum1(10);
		c.setNum2(20);
		
		c.add();
		c.sub();
		c.mul();
		c.div();
		System.out.println("---------------------------");
		
		// MyCalc 객체 생성(계산기 객체 Calc 주입)
		// 강한 결합
		MyCalc myc = new MyCalc();
		myc.setNum1(100);
		myc.setNum2(200);
		
		myc.setC(new Calc());
		
		myc.myAdd();
		myc.mySub();
		myc.myMul();
		myc.myDiv();
		
		System.out.println("---------------------------");
		
		// 스프링을 사용해서(xml파일-미리 준비되어있는 파일)
		// 해당 객체를 주입 받아서 사용
		
		// 스프링(xml)파일을 읽어오기
		BeanFactory bf4 = 
				new XmlBeanFactory(new FileSystemResource("calculator.xml"));
		
		// 사용하고자하는 객체(bean) 정보 불러오기(의존 주입)
		MyCalc myc2 = (MyCalc)bf4.getBean("myC");
		
		// 객체 사용
		myc2.myAdd();
		myc2.mySub();
		myc2.myMul();
		myc2.myDiv();
		
		
		
		
		
		
		
		

	}

}
