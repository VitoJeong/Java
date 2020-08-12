import java.util.Scanner;

public class Test2 {

	public static void main(String[] args) {
		// 반복문 : 소스코드를 반복한다.

		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");
		// System.out.println("안녕하세요");

		// for(일반,확장),while,do-while

		// for(초기식;조건식;증감식){
		// 반복할 문장;
		// }

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------");
		// 1~10 홀수만 출력 1 3 5 7 9
		for (int i = 1; i <= 10; i += 2) { // i =i+2

			System.out.print(i + " ");
			// System.out.print((i++)+" ");
			// System.out.print(i+" ");
			// i++;
		}
		System.out.println("\n---------------------------");
		// 1~10 짝수만 출력 2 4 6 8 10
		for (int i = 2; i <= 10; i += 2) { // i =i+2
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------");
		// 10 ~ 1 까지 가로 출력

		for (int i = 10; i >= 1; i--) {
			System.out.print(i + " ");
		}
		System.out.println("\n---------------------------");
		// 구구단 2단
		/*
		 * < 2단 > 2 * 1 = 2 2 * 2 = 4 ... 2 * 9 = 18
		 */
		Scanner scan = new Scanner(System.in);

		int dan = 2;
		// int dan = scan.nextInt();

		System.out.println("< " + dan + "단  >");

		for (int i = 1; i <= 9; i++) { // 1~9
			// System.out.println(i);
			System.out.println(dan + " * " + i + " = " + (dan * i));
		}

		System.out.println("---------------------------------");

		// 반복문 사용 누적연산
		// 1~10까지의 합을 출력하시오. (누적합)
		int sum = 0;

		for (int i = 1; i <= 10; i++) {
			// System.out.println(i);
			// sum = sum + i;
			System.out.println("sum : " + sum);
			sum += i;
			System.out.println("1 ~ " + i + " 합 : " + sum);
		}

		System.out.println("1~10 총합 : " + sum);

		System.out.println("-------------------------------------");
		// 팩토리얼
		// 5! => 5 * 4 * 3 * 2 * 1 = 120
		// 10! => 10 * ..... * 1 = 3628800
		// 키보드 값을 입력받아서 해당숫자의 팩토리얼 계산

		 int input = scan.nextInt();

		int fac = 1;

		// for(int i=10;i>=1;i--){
		// fac = fac * i;
		// }
		
		for(int i=1;i<=input;i++){
			fac *= i;
		}
		System.out.println(input+"! = " + fac);

	}

}
