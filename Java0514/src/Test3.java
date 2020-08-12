final class A{
	public final void aa(){
		
	}
}
class B /*extends A*/{
//	public void aa(){}  (x)
}


public class Test3 {

	public static void main(String[] args) {
		// final 키워드(제어자)
		// 1) 변수 : 더이상 변수의 값을 변경하지 못하게 상수화 시킨다.
		// 2) 메서드 : 더이상 메서드를 변경하지 못하게 함. (오버라이딩을 못하게 한다)
		// 3) 클래스 : 더이상 클래스를 변경하지 못하게 함. (상속불가)
		
		/*static */final int A = 100;
		System.out.println(" A : "+A);
		// A = 200;
		System.out.println(" A : "+A);
		
		
		

	}

}
