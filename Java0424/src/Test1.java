class ProTest {
	// 속성X
	// 동작
	// test() -> 작동
	// 100회 테스트(호출)
	// 전달인자 0,1,2,3 => 메서드 호출이 전체 95%
	// 전달인자 100,200... => 메서드 호출이 전체 5%
	// 이때 개발자로 생각해봤을때 객체의 구현을 하시오.
	public void test() {
		System.out.println("test()");
	}

	public void test(String s) {
		System.out.println("test(s)");
	}

	public void test(String s, String s1) {
		System.out.println("test(s,s1)");
	}

	public void test(String s, String s1, String s2) {
		System.out.println("test(s,s1,s2)");
	}

	public void test(String... data) {
		System.out.println("test(s....s)");
	}
}

public class Test1 {

	public void method(int... num) {
		System.out.println("메서드 실행!");
		for (int i = 0; i < num.length; i++)
			System.out.println(num[i]);
	}

	public static void main(String[] args) {
		// 메서드의 전달인자의 개수가 1~50개 필요하다
		// * 가변인자(Varargs) : 메서드의 전달인자가 가변할수 있도록 처리
		// java1.8(JDK8) => JDK 5.0이후에 도입된 개념
		// * 가변인자의 활용을 적절하게 섞어서 사용해야함.
		// ( 가변인자는 배열을 생성,초기화해서 사용하기 때문 )

		Test1 t1 = new Test1();
		t1.method();
		t1.method(1);
		t1.method(1, 2);
		t1.method(1, 2, 3, 4, 1, 2, 31, 3, 1, 3);
		
		ProTest p = new ProTest();
		
		p.test();
		p.test("h");
		p.test("q","w");
		p.test("a","S","D");
		p.test("1","1","1","1","1","1","1","1","1","1");
		
		
		
		
		
		
		
		

	}

}
