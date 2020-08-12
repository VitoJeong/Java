abstract class ABSClass{
	abstract void method1();
	void method2(){
		System.out.println("ABSClass_method2() 호출");
	}
}
abstract class MiddleClass extends ABSClass{
	// * 추상클래스도 클래스이기 때문에 상속이 가능함.
	// -> 객체생성을 할수 없기 때문에 추상메서드 호출이 불가능, 그래서 추상메서드를
	// 오버라이딩 하지 않아도 됨.=> 서브클래스가 모두 오버라이딩해서 사용
	public abstract void Method3();
	
	//abstract void method1();
	public void method1(){
		//super.method1(); (x)
		System.out.println("MiddleClass_method1() 호출");
	}
	
}

class SUBMidClass extends MiddleClass{
	@Override
	public void method1() {
		System.out.println("SUBMidClass_method1() 호출");
	}
	@Override
	public void Method3() {
		System.out.println("SUBMidClass_method3() 호출");
	}
	
}



class SUBClass extends ABSClass{
	@Override
	void method1() {
	   System.out.println("SUBClass_method1() 호출");	
	}
	void method2(){
		super.method2();
		System.out.println("SUBClass_method2() 호출");
	}
}




public class Test1 {

	public static void main(String[] args) {
		
		SUBClass sub = new SUBClass();
		
		sub.method1();
		sub.method2();
		
		
		
		

	}

}
