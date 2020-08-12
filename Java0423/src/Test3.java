class TestMath {
	// 속성X
	// 동작3개
	// 절대값을 계산 동작 (int,double,long처리가능)
	// => abs() 메서드 오버로딩 해서 사용
	// => 객체 생성후 결과 테스트

	public int abs(int num) {
		if (num < 0) {
			num = -num;
		}
		return num;
	}
	public long abs(long num) {
		if (num < 0) {
			num = -num;
		}
		return num;
	}
	public double abs(double num) {
		if (num < 0) {
			num = -num;
		}
		return num;
	}

}

//  TestMath2 객체를 생성해서 메서드 오버로딩을 사용
// 속성X,동작 3개
// 전달받은 인자의 정보를 출력하는 메서드
// int 1개, int 2개, int 3개를 처리하는 메서드 생성
//  객체 생성후 호출 

class TestMath2{
	
	public void prn(int a){
		System.out.println(a);		
	}
	public void prn(int a, int b){
		System.out.println(a+"\t"+b);
	}
	public void prn(int a,int b,int c){
		System.out.println(a+"\t"+b+"\t"+c);
	}
	
}






public class Test3 {

	public static void main(String[] args) {
		// 객체지향언어
		// 다형성 : 동일한 형태의 동작으로 다양한 결과를 만들어내는 형태
		// -> 이름이 동일한 메서드로 다양한 결과를 만들어내는것
		// => 상속,오버로딩,추상메서드,추상클래스,인터페이스... 모두 필요함

		// 그림을 그린다.-> draw(),paint(),print(),....
		// -> draw(모양)

		// * 메서드 오버로딩
		// : 동일한 이름의 메서드를 여러번 정의해서 사용하는것 (재정의)

		// * 컴파일러가 메서드를 구분하는 기준(요소) : 메서드 시그니처(signature)
		// 1. 메서드명
		// 2. 전달인자 타입
		// 3. 전달인자의 개수

		// => 메서드 오버로딩
		// 동일한 이름의 메서드를 재정의 해서 사용하는것
		// 1) 전달인자의 타입이 다른경우
		// 2) 전달인자의 개수가 다른경우
		
		// * 동일한 이름의 메서드를 여러개 생성함(필요에 따라서)
		//  전달인자의 타입을 다르게 하거나, 전달인자의 개수를 변경해서 선언
		
		

		System.out.println();
		
		TestMath tm = new TestMath();
		// 전달인자의 타입을 변경해서 오버로딩
		System.out.println(tm.abs(-100)); // int
		System.out.println(tm.abs(-2000L)); // long
		System.out.println(tm.abs(-9.1231)); // double
		System.out.println(tm.abs(-456456)); // int
		
		System.out.println("------------------");
		
		TestMath2 tm2 = new TestMath2();
		tm2.prn(10);
		tm2.prn(20,20);
		tm2.prn(30,30,30);
		
		System.out.println("----------------------------------");
		
		
		/*
		int add(int a,int b) { return a+b; }
		int add(int x,int y) { return x+y; }
		-> 전달인자의 이름 다른경우 => 오버로딩X
		
		int add(int a,int b) { return a+b; }
		public int add(int a,int b) { return a+b; }
		-> 접근지정자가 달라도 상관 없음 => 오버로딩 x
		
		int add(int a,int b) { return a+b; }
		long add(int a,int b) { return (long)(a+b); }
		-> 리턴타입도 달라도 상관없음 => 오버로딩X
		
		long add(int a,long b) { return a+b; }
		long add(long a,int b) { return a+b; }
		=> 오버로딩 o
		add(100,200); x => add(100L,200);
		
		
		*/
		
		

	}

}
