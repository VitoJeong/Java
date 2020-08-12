/*접근지정자*/interface ITest {
	// 상수o, 변수x
	// int a;(x)
	// final int a = 100; //(o)
	///////////////////////////////////////////
	// 인터페이스 안에 있는 모든 데이터
	// => 자동으로 static형태로 처리
	// => 상수로 처리됨(final)

	// public static final int A = 100;
	// public final int B = 100;
	// public static int C = 100;
	// public int D = 100;
	// int E = 100;
	// // int F; (x)=> 값을 초기화 해야지만 상수로 처리 가능

	// 일반메서드(x),추상메서드 (o)
	// public void Method(){ } (x)
	// public abstract void Method(); // (o)

	//////////////////////////////////////////////
	// 인터페이스 안에있는 모든 메서드
	// => abstract 키워드가 없어도 자동으로 처리됨.
	// => 접근지정자는 항상 public (*오버라이딩시 접근지정자 주의)

	// public abstract void Method1();
	// /*public*/ abstract void Method2();
	// public /*abstract*/ void Method3();
	// /*public abstract */ void Method4();

}// interface ITest

class SubInterClass implements ITest {

	// @Override
	// public void Method() {
	//
	// }

}

public class Test4 {

	public static void main(String[] args) {
		// 인터페이스 : 클래스의 형태가 아닌 별도의 개념
		// -> 동일한 이름의 메서드를 접근할수 있도록 사용하기 위해

		// ITest it = new ITest();(x)
		// => 객체 생성 불가능하다.(추상메서드를 포함하고있기 때문)
		// => 상속을 통해서 추상메서드 구현해서 사용해야함.

		// 인터페이스의 상속은 implements를 통해서 구현한다.
		
		// 상속 -1) 확장 (extends) : 클래스 간의 관계(추상클래스 포함)
		//    -2) 구현 (implements) : 클래스와 인터페이스간의 관계
		
		

	}

}
