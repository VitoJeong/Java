import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// 분기문 if -> 하나의 조건이 만족할때 실행하는 코드

		// if - else문
		// if(조건문){
		// 조건문의 결과가 참일때 실행
		// }else{
		// 조건문의 결과가 참이 아닐때 실행
		// }

		// 정수형타입의 변수 생성후 123이라고 하는 리터럴값을 저장
		// 변수의 값이 홀수/짝수 판별
		int num = 122;

		if (num % 2 != 0) {
			// 홀수일때
			System.out.println("홀수");
		} else {
			// 짝수일때 (num % 2 == 0)
			System.out.println("짝수");
		}

		if (num % 2 != 0) {
			System.out.println("홀수");
		}

		if (num % 2 == 0) {
			System.out.println("짝수");
		}

		// 절대값 계산
		// 10 -> 10 (양수) , -10 -> 10 (음수);
		num = -50;

		if (num > 0) {
			System.out.println("num : " + num);
		} else {
			System.out.println("num : " + (num * -1));
		}
		System.out.println("----------------------------------");
		if (num < 0) {
			num = -num;
		}
		System.out.println("num : " + num);

		System.out.println("----------------------------------");
		// 삼항조건연산자

		System.out.println(" num(삼항연산자) : " + (num < 0 ? -num : num));

		// if-else if()문
		// -> 한번에 여러개의 조건을 비교해서 처리 가능
		// 경우따라서 많은수의 조건을 비교가능

		// if(조건문){
		//
		// }else if(조건문2){
		//
		// }else if(조건문3){
		//
		// }else{
		//
		// }
		// 변수의 값이 정수인가를 판단하시오.
		// (양의정수, 음의정수, 0)
		num = 100;
		if (num > 0) {
			// 양수
			System.out.println("양수");
		} else if (num < 0) {
			// 음수
			System.out.println("음수");
		} else {
			// 0
			System.out.println("0");
		}

		if (num > 0) {
			System.out.println("양수");
		} else if (num < 0) {
			System.out.println("음수");
		} else if (num == 0) {
			System.out.println("0");
		}

		// * 여러개의 조건문을 처리할때는 항상 else 구문과 함께 사용해서
		// 처리하는것이 안전한 데이터처리 방법이다. (권장)

		Scanner scan = new Scanner(System.in);
		
		// 점수를 저장하는 변수 score 생성
		int score;
		// 점수 입력 88점
		//score = 33;
		//score = Integer.parseInt(args[0]);
		System.out.print("학생의 점수를 입력하시오 >>");
		score = scan.nextInt();
		
		// 90~100 => A
		if (90 <= score && score <= 100) {
			System.out.println("A학점");
		}
		// 80~89 => B
		else if (80 <= score && score <= 89) {
			System.out.println("B학점");
		}
		// 70~79 => C
		else if (70 <= score && score <= 79) {
			System.out.println("C학점");
		}
		// 60~69 => D
		else if (60 <= score && score <= 69) {
			System.out.println("D학점");
		}
		// 그외 나머지 => F
		else{
			System.out.println("F학점");
		}
		// 조건을 보고 알맞은 학점을 출력하시오.
		
		// 키보드값 입력하기 (스캐너)
		
	/*	// 스캐너 생성
		Scanner scan = new Scanner(System.in);
		
		// 키보드 입력(데이터 입력)
		//int input = scan.nextInt(); // (숫자입력)
		String input = scan.nextLine(); // (문자입력)
		
		System.out.println("키보드 입력값 : "+input);
		
		String input2 = scan.nextLine();
		System.out.println("키보드 입력값 : "+input2);*/

		
		
		
		
		
		
		
		
		

	}

}
