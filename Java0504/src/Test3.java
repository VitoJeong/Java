class Parent {
	public void pprn() {
		System.out.println("Parent_pprn()  호출 ");
	}
}

class Child extends Parent {
//	public void pprn() {
//		super.pprn();
//		System.out.println("Child_pprn()  호출(오버라이딩) ");
//	}
    
	// 오버라이딩 자동 생성 : alt + shift +s  v
	// @Override (어노테이션) : 특수한 기능을 가지고있는 값(키워드)
	//   -> 해당메서드가 오버라이딩된 메서드라는것을 알려줌. (생략가능)
	
	@Override
	public void pprn() {
		//super.pprn();
		System.out.println("오버라이딩 자동완성 ");
	}

	public void cprn() {
		System.out.println("Child_cprn() 호출 ");
	}
}

class DateY {
	protected int y = 2020;
	protected int m = 5;
	protected int d = 4;
}

class DateMD extends DateY {
	// 은닉변수,Shadow변수
	 protected int m = 12;
	 protected int d = 31;

	public void today() {
		System.out.println(this.y + "/" + super.m + "/" + this.d);
	}
}

public class Test3 {

	public static void main(String[] args) {
		// 메서드 오버라이딩
		// : 서브클래스에서 슈퍼클래스와 동일한 이름의 메서드를
		// 다시 정의해서 사용하는 방법 ( 기존의 메서드는 사용하지 않고,
		// 오버라이딩된 메서드만 사용 )
		// => 슈퍼클래스의 메서드는 은닉되고, 서브클래스의 메서드가 호출

		// 1) 메서드 명
		// 2) 전달인자의 타입
		// 3) 전달인자의 개수
		// 4) 리턴타입
		// 5) 접근지정자(*서브클래스의 메서드는 슈퍼클래스의 메서드 접근지정자보다 좁아질수 없음)
		// => 위 5가지 항목이 같을경우에만 사용

		// 오버로딩,오버라이딩
		// - 둘다 동일한 이름의 메서드를 사용하는것 (다형성)

		// 오버로딩 : 메서드의 형태를 다르게해서 여러번 사용
		// 오버라이딩 : (상속) 완전히 동일한 메서드를 다시 재정의해서 사용

		// * 오버라이딩된 메서드를 사용할때 은닉되어이있는 슈퍼클래스의
		// 메서드 호출시 레퍼런스 super를 사용

		System.out.println("---------------------------------");
		Parent p = new Parent();
		p.pprn();
		// p.cprn(); (x)
		System.out.println("---------------------------------");
		Child c = new Child();
		c.cprn();
		c.pprn();
		// c.pprn(2);

		DateMD md = new DateMD();
		md.today();

	}

}
