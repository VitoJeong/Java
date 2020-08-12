import javax.swing.plaf.synth.SynthScrollPaneUI;

public class Test1 {
	
	// 메서드 선언 
	public static void hello_itwill(){
		//  void : 메서드의 리턴값이 없음.
		// => 특정 작업의 처리 동작만 구현함.
		System.out.println("Hello ITWILL!!");
		System.out.println("Hello Java");
	}
	
	public static void hello_name(String name){// 타입 매개변수
		System.out.println("Hello "+name);		
	}
	
	// 특정 결과를 리턴하는(돌려주는) 메서드
	public static String hello(){
		
		return "Hello"; 
		// 해당 메서드의 목적 (리턴후 동작은 없음),리턴문을 만나면 종료됨.		
	}
	
	public static String rtnName(String name){
		// "홍길동" + "님 안녕하세요"
		String result = name + "님 안녕하세요";
		return result;
	}
	

	public static void main(String[] args) {
		// 메서드 : 특정 동작을 한번에 여러개 구현하기 위한 방법
		// -> 객체지향 : 메서드, 절차지향 : 함수
		
		// * main 메서드 : 프로그램을 실행시키는 메서드 
		// => 모듈화 프로그래밍 

		System.out.println();

		// [접근지정자] [리턴타입] [메서드명](전달인자1,...) // 메서드 머리
		// {
		// 		실행동작;  
		// 		변수 선언;                      // 메서드 몸통
		//		return 값;
		// }
		
		// 메서드 호출(사용)
		hello_itwill();
		
		// 메서드 호출
		hello_name("홍길동");
		hello_name("관리자");
		// hello_name(1234);
		
		// 메서드 호출
		String str = hello();
		System.out.println(" str : "+str);
		System.out.println("----------------------");
		System.out.println(hello());
		
		System.out.println(rtnName("홍길동"));
		
		
		

	}// main()

}// class
