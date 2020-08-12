import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class Test2 {

	public static void main(String[] args) {

		// switch ~ case문
		// 정수식 : 정수형변수,값, 문자형(char),문자열(한글/영어)
		// switch(정수식){
		// case 값1:
		// 실행문;
		// [break;]
		// case 값2:
		// 실행문;
		// [break;]
		// default:
		// 실행문;
		//
		// }
		// * switch -case문
		// 1) 각 케이스에서 break문을 만나면 종료된다.
		// 2) 해당 케이스에 break문이 없을경우 다음 break문을 찾을때까지
		// 모든 코드를 실행시킨다.(해당 케이스가 아니어도 실행됨)
		// 3) default문 / 마지막 케이스를 만나면 종료

		int num = 10;
		switch (num) {
		case 8:
			System.out.println("8!");
			// break;
		case 9:
			System.out.println("9!");
			// break;
		case 10:
			System.out.println("10!");
			// break;
		default:
			System.out.println("해당사항 없음");
			// break;
		}
		System.out.println("------------------------------");

		// num = 10;
		char ch = 'g';
		switch (ch) {
		case 'a':
			System.out.println("A");
		case 'g':
			System.out.println("B");
		case 'h':
			System.out.println("C");
		case 'z':
			System.out.println("D");
			break;

		default:
			break;
		}

		System.out.println("--------------------------");

		String value = "미국";

		/*
		 * switch(value){
		 * 
		 * case "한국": System.out.println("한국 입니다."); break; case "미국":
		 * System.out.println("미국 입니다."); break; }
		 */

		System.out.println("---------------------------");
		// 키보드 입력 해서 점수를 입력 받아서
		// 학생의 학점을 출력하는 프로그램 생성
		// switch-case 사용
		// 100,99~90(a),89~80(b),79~70(c),69~60(d),59~0(f),나머지 (에러)

		Scanner scan = new Scanner(System.in);
		System.out.print("학생의 점수를 입력하시오 >> ");
		int score = scan.nextInt();

		if (0 <= score && score <= 100) {
			// -> 항상 0~100 사이의 값이 들어온다.

			System.out.println("학생의 점수 : " + score);
			// System.out.println(score/10);
			int divScore = score / 10;

			switch (divScore) {
			case 10: // 100
			case 9: // 99~90
				System.out.println("A");
				break;
			case 8: // 89~80
				System.out.println("B");
				break;
			case 7: // 79~70
				System.out.println("C");
				break;
			case 6:// 69~60
				System.out.println("D");
				break;

			case 5:
			case 4:
			case 3:
			case 2:
			case 1:
			case 0:
				System.out.println("F");
				break;

			default:
				System.out.println("에러");
				break;
			}// switch

		}// if끝
		else{
			System.out.println("0~100 사이의 숫자를 입력해주세요.");
		}
		
		
		

	}

}
