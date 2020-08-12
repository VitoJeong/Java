import java.util.ArrayList;

abstract class Hello{
	public abstract void sayHello();	
}
abstract class GoodBye {
	public abstract void sayGoodBye();	
}
class SubClassTest extends Hello{

	// 클래스 다중상속은 불가능하다.
	// 추상 클래스도 다중상속은 불가능하다.
	// => 다이아몬드 상속관계 에서 D클래스가 정보를 B,C에서 가져오는 상황에 문제 발생
	// => 인터페이스를 사용해서 다중상속을 지원 (상수,추상메서드 => 껍데기만 있음)
	/*
	    A
	   / \
	  B   C
	   \ /
	    D	
	*/
	@Override
	public void sayHello() {	}
	
	public void sayGoodBye(){   	}
	
}

interface IHello{
	public void IHello();
}
interface IGoodBye{
	void IGoodBye();
}
class SubClassI implements IHello,IGoodBye {

	@Override
	public void IHello() {	}

	@Override
	public void IGoodBye() { }	
	
}

// 추상클래스1, 인터페이스 2개 다중 상속
class SubClassAI extends Hello implements IHello,IGoodBye{

//	ArrayList<E> a;
	// alt shift s + v
	@Override
	public void sayHello() {
	}

	@Override
	public void IHello() {
	}

	@Override
	public void IGoodBye() {
	}
}

// * 인터페이스끼리의 상속
// => 인터페이스를 상속해서 또다른 인터페이스를 만들어 사용 
// => extends(확장) 다중상속가능

interface ITotal extends IHello,IGoodBye{
	public void Total();
}

class SubClassTotal implements ITotal{

	@Override
	public void IHello() {	}

	@Override
	public void IGoodBye() {	}

	@Override
	public void Total() {	}
	
}



interface IColor{
	int RED = 1;
	public static int GREEN = 2;
	public final int BLUE = 3;
	
	void setColor(int c);
	public abstract int getColor();
}

// 인터페이스를 추상클래스에서 상속 
abstract class ABSColor implements IColor{
	@Override
	public void setColor(int c) {
		System.out.println("인터페이스의 메서드 구현");
	}
}

// 추상클래스를 상속
class SubColor extends ABSColor{
	@Override
	public void setColor(int c) {
		System.out.println("추상클래스의 메서드 구현");
	}
	@Override
	public int getColor() {
		return 0;
	}
}


public class Test1 {

	public static void main(String[] args) {

		// 인터페이스 : 다중 상속을 지원하기 위해서 도입
		// => 다양한 형태의 객체 설계
		
		System.out.println(SubColor.RED);
		System.out.println(SubColor.GREEN);
		System.out.println(SubColor.BLUE);

		SubColor sc = new SubColor();
		sc.getColor();
		sc.setColor(SubColor.RED);
		
		
		// * 추상 클래스
		// 1) abstract class 생성
		// 2) 변수, 상수 모두 사용가능
		// 3) 일반메서드,추상메서드 모두 사용가능
		// 4) 확장 개념 : extends
		// 5) 단일 상속만 가능
		
		// * 인터페이스 
		// 1) interface 생성
		// 2) 상수만 가능 (public static final 묵시적 표현)
		// 3) 추상메서드만 사용가능 (public abstract 묵시적 표현)
		// 4) 구현 개념 : implements
		// 5) 다중 상속을 사용가능
		
		
		// 공통점 : 추상메서드를 포함하고있다.(객체 생성 불가능, 상속을 통해서 구현)
		//        => 메서드 오버라이딩을 사용(강제성)
		//        - 업캐스팅 가능
		
		
		
	}

}
