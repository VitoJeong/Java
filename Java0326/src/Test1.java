
public class Test1 {
	public static void main(String[] args) {
		System.out.println("홍길동");

		// 자바 -> 모든 운영체제에서 사용가능
		// => JVM(자바 가상 머신)덕분에 항상 같은형태(.class)파일을 사용해서
		// 운영체제 상관없이 사용 가능
		// - 메모리 관리를 대신해준다. -> gc(가비지 컬렉터)

		System.out.println("출력문 사용하기--------------");

		// System.out.println();
		// System.out.print();
		
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.print("안녕");
		System.out.print("안녕");
		
	    System.out.println("100");
	    System.out.println("100");
	    // ;(세미콜론) => 소스코드의 끝
	    
	    // print() 사용해서 줄바꿈 표현 ("\n")
		System.out.print("줄\n 바꾸기");
		// "안녕하세요 
		//  자바 시간
		//  입니다."  => print()
		System.out.print("\n안녕하세요 \n자바 시간 \n입니다.");
		
		// [ + ]
		// 1. 연산자 (더하기)
		// 2. 연결자 (출력의 모양 변경)
		System.out.println(100+200);
		
		System.out.println("100"+"200");
		// => "값" (문자열 데이터)을(를) 연결해주는 동작
		System.out.println("안녕"+"하세요");
		
		System.out.println("제 나이는 "+20+"살");
		System.out.println(100+"만원");
		System.out.println(100+200+"만원");
		System.out.println("100"+200+"만원");
		// * 숫자 + 숫자=> 연산
		// * "문자열" + 값 => "문자열 값" => 연결자
		System.out.println("100+200="+(100+200));
		
		/*
		 * 홍
		 * 
		 * 길
		 * 동
		 * 나이는 (10+10) 살
		 * 
		 */
		//=> 출력문 print() 사용
		System.out.print("홍\n");
		System.out.print("\n");
		System.out.print("길\n");
		System.out.print("동\n");
		System.out.print("나이는"+(10+10)+"살\n");
		System.out.print("\n");
		
		
		
		
		
		
		
		

	}
}
