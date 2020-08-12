class StaticTest{
	// 스태틱변수, 정적변수 => 사용시  클래스명.변수명
	private static int a = 100;
	int b = 200;
	
	public static int getA() {
		return a;
	}
	public static void setA(int a) {
		StaticTest.a = a;
		//this.a = a;(x)		
	}
	
	
	
}


public class Test1 {

	public static void main(String[] args) {

		// static : 객체 생성없이 사용할수 있다.
		// -> 메모리(heap)에 없어도 사용가능하다.(클래스영역 메모리에 저장)
		// => 데이터를 공유하기 위해서
		
		// * 클래스 생성시에 static 붙은변수는 같이 생성됨.(미리 생성)
		// => 컴파일시 static변수를 미리 저장해서 사용 
		
		//정보 a,b 출력
		//System.out.println("a : "+StaticTest.a);
		System.out.println("a : "+StaticTest.getA());
		
		//System.out.println("b : "+StaticTest.b); (x)
		StaticTest s = new StaticTest();
		//System.out.println("s.a : "+s.a);
		System.out.println("b : "+s.b);
		
		StaticTest s1 = new StaticTest();
		//System.out.println("s1.a : "+StaticTest.a);
		//s1.a = 500;
		s1.setA(500);
		s1.b = 600;
//		System.out.println("s1.a : "+s1.a);
		System.out.println("a : "+StaticTest.getA());
		System.out.println("s1.a : "+s1.getA());
		System.out.println("s1.b : "+s1.b);
		
		StaticTest s2 = new StaticTest();
		
		System.out.println("s2.a : "+s2.getA());
		System.out.println("s2.b : "+s2.b);
		
		
		
		
		
		
		
		
		
		
	}

}
