
public class Test2 {

	public static void main(String[] args) {

		// 자바프로그래밍은 문으로 구성되어있다.

		/*
		 * 문 - 1) 실행문 - 순차문 - 제어문 - 분기문 (if, if-else...) - 반복문 (for, while....)
		 * 2) 비실행문 - 주석문 ( //, \* *\ \** *\ )
		 * 
		 */

		// 분기문 if
		// 조건식 : 비교연산(비교연산자,논리연산),boolean타입 데이터
		
		// if(조건식){  
		//   조건식이 만족할때 실행할 문장
		// }
		// * 조건식이 true일 경우 항상 실행된다.
		int num = -100;
		
		if(num ==200){
			System.out.println("num값은 100이다.");
		}
		// num값이 0보다 클경우 "양수 입니다." 출력
		
		if(num > 0){
			System.out.println("양수 입니다.");
		}
		
		// if(num > 0){ System.out.println("양수 입니다."); }
		 if(num > 0) 
			 System.out.println("양수 입니다.");
		 // => 실행하는 코드의 수가 1줄일때만 중괄호를 생략가능하다.
		 // => 1줄의 코드도 중괄호를 사용
		 num = -20;
		 if(num > 0){
			 System.out.println("양수");
		     System.out.println("값은 : "+num);
		 }
		     
		     
		 
		
		
		
		
		

	}

}
