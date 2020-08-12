class Method01{
	
	public void method01(){
		System.out.println("method01!");
	}
}

interface Method02{
	public void method02();
	public void method03();
}

// @FunctionalInterface : 컴파일러에게 해당 인터페이스가 람다식으로 변경가능한
// 인터페이스 인가를 체크 어노테이션
// 사용이유 : 1) 설계시 실수 방지(컴파일 체크) 2) 명시적표현으로 개발 가독성 향상

@FunctionalInterface
interface Method03{
	public void me03();	
}



public class Test1 {

	public static void main(String[] args) {
		// 람다식 (Lambda Expression) : P378~
		// => JDK8 이후 도입(파이썬,C#)
		// 메서드를 조금더 간결하게 표현하는 방법 =>  함수형 프로그래밍
		
		// [->] 해당 표현을 통해서 람다 표현식을 사용
		
		// 람다식
		// (타입 매개변수,...) -> { 실행문; }
		
		/*
 
          public void Method(int num){
             System.out.println("숫자"+num);
          }
		  
		  (int num) -> { System.out.println("숫자"+num);}
		  
		  // 입력시 타입을 구분가능하면 타입을 제거 가능 (거의 대부분)
		  (num) -> { System.out.println("숫자"+num);}
		  
		  // 매개변수가 1개면 () 생략 가능
		   num -> { System.out.println("숫자"+num);}
		  // 실행문이 1개면 {} 생략가능
		   num ->  System.out.println("숫자"+num);
		   
		   
		   
		   Q)
		   int max(int a, int b){
		     return a>b? a:b;
		   }
		   
		   람다식 표현
		   A)
		   1) 메서드이름,리턴타입,접근지정자 모두 제거
		      {} 앞에 -> 추가
		    (int a, int b) -> { return a>b? a:b; }
		   2) 실행문이 1개면 {} 생략. return문 일경우 return 생략 (; 생략)
		     (int a, int b) -> a>b? a:b 
		   3) 타입을 알수있을경우 생략 가능
		     (a,b) -> a>b? a:b  
		*/
		
		// 함수형 인터페이스 / 타겟 타입 => 람다식 변환
		// * 람다식 파라미터와, 메서드의 구현부로만 생성(메서드의 기능에 집중)
		
		
		// Method01 mt1 = new Method01();
		// mt1.method01();
		
		Method01 mt1 = new Method01(){
			@Override
			public void method01() {
				super.method01();
			}
		};
		// 람다식 -> x
		
		// ctrl + 1 
		Method02 mt2 = new Method02() {
			@Override
			public void method02() {
				System.out.println("2222");
			}
			@Override
			public void method03() {
				System.out.println("3333");
			}
		};
		// 람다식 -> o
		
		// * 함수형 인터페이스 타입만 람다식으로 변환 가능하다.
		// 함수형 인터페이스 : 반드시 하나의 추상메서드만 있는 인터페이스,
		//   두개이상의 추상메서드가 있을경우 함수형 인터페이스가 아님=> 람다식 변경 불가능
		
		
		Method03 m4 = new Method03() {
			
			@Override
			public void me03() {
				// TODO Auto-generated method stub
				
			}
		};
		
		
		// 매개변수의 값이 하나도 없을경우는 ()는 반드시 표시 
	    Method03 m3 = () -> { };
		
		
		

	}

}
