// 추상클래스
abstract class Test{
	int a; // 변수
	final int B =10; // 상수
	
	public void method00(){
		// 일반메서드
	}
	
	// 추상메서드
	public abstract void method();
	// -> 일반 서브클래스에 상속관계를 통해서 
	//  메서드 오버라이딩을 통해서 사용. (강제성)
	// * 추상메서드를 사용하기 위해서는 상속하는 서브클래스에 반드시 오버라이딩해서 
	// 사용해야한다.
}

class TestClass extends Test{

	@Override
	public void method() {
		System.out.println("추상클래스 Test의 오버로딩된 메서드 method()");		
	}
	//public abstract void method1();
	// -> 일반 클래스에서는 추상메서드를 사용할수 없음
	// * 반드시 추상클래스 안에서만 사용 가능
	// => 일반클래스는 객체 생성 가능 -> 메서드 호출 가능 -> 동작없는 추상메서드 호출가능 있음
	// -> 에러 가능성이 존재한다.
}

public class Test3 {

	public static void main(String[] args) {
		// 추상클래스 : 객체를 생성할수 없는 클래스 
		// => 동일한 메서드를 여러개의 객체에 사용하게 하기위해서 
		
		// abstract class 클래스명{}
		
		//Test t = new Test();
		// => 추상클래스는 객체를 생성할수 없음.
		//    추상클래스는 자생력이없어서 객체 생성 불가.
		
		// 추상 메서드 : 메서드 역활을 할수 없는 메서드
		// => 바디{}(몸체)가 없는 메서드. 처리 내용이 없는 메서드
		// => 메서드 선언만 존재하는 메서드.
		
		// [접근지정자] abstract [리턴타입] 메서드명(전달인자);
		
		
		TestClass t = new TestClass();
		t.method();
		
	    System.out.println(t.a);
	    System.out.println(t.B);
	    t.method00();
		
		
		
		
		
		
		
		
		

	}

}
