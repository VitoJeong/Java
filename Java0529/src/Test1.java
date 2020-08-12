class MyGeneric<W> {
	private W x;

	public MyGeneric() {
	}

	public MyGeneric(W x) {
		this.x = x;
	}

	// * 변수 x의 값을 리턴하는 public 메서드 take() 생성
	public W take() {
		return x;
	}
	// * 매개변수를 하나 가지고있는 compare()메서드 생성 (public)
	// 매개변수와 멤버변수가 같으면 true,다르면 false 리턴

	public boolean compare(W x) {
		if (this.x.equals(x))
			return true;
		else
			return false;
//		return this.x.equals(x);
	}

	// * 해당 클래스를 String 타입으로 구체화 해서 사용

}

public class Test1 {

	public static void main(String[] args) {

		// 제네릭타입이 지정된 클래스를 선언
		// MyGeneric / W 타입으로 구체화
		// 속성을 저장하는 변수 x (외부 접근 불가능)
		// 오버로딩된 생성자 선언
		
		MyGeneric<String> mg = new MyGeneric<String>("Hello");
		
		System.out.println(mg.take());
		System.out.println(mg.compare("hello"));
		System.out.println(mg.compare("Hello"));
		
		

	}

}
