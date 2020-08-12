import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		String str = "12345";
		// 숫자의 모든 합을 계산 출력 => 1 + 2+ 3 + 4 + 5 =>
		// charAt(위치) -> '값'(문자형) : 문자형 숫자 -> 정수형 숫자 변경

		// System.out.println(str.charAt(0));
		// System.out.println(str.charAt(1));
		// System.out.println(str.charAt(2));
		// System.out.println(str.charAt(3));
		// System.out.println(str.charAt(4));
		// char ch=' ';
		int sum = 0;
		for (int i = 0; i < 5; i++) {
			// System.out.println(str.charAt(i));
			// ch = str.charAt(i);
			// System.out.println(ch);
			// sum += ch; // sum = sum + ch;

			sum = sum + (str.charAt(i) - '0'); // '0' 대신 48( 정수값) 사용해도됨.
			// sum += str.charAt(i) - '0';
			// * char형은 기본적으로 정수형을 따른다.(연산시)
		}
		System.out.println("sum : " + sum);

		System.out.println(" 1+2+3+4+5 = " + 15);

		System.out.println("---------------------------------------");

		int num = 12345;

		// 반복 (계산이 끝날때 까지)
		// 나머지 연산으로 끝자리 짜르기
		// 끝자리를 더하기(누적합)
		// 나누기 연산으로 자리수 변경
		sum = 0;
		for (int i = 0; i < 5; i++) {
			sum += num % 10;
			// num = num / 10;
			num /= 10;
		}
		System.out.println("sum = "+sum);
		
		sum = 0;
		while(num > 0){
			sum += num % 10;
			// num = num / 10;
			num /= 10;
		}
		System.out.println("sum = "+sum);
		

		// 각 자리수의 합을 계산하시오.
		// 12345 1234.5
		// num num % 10
		// System.out.println("num : "+num+", %10 : "+num%10);
		// 1234 123.4
		// System.out.println("num : "+num/10+", %10 : "+(num/10)%10);
		// 123 12.3
		// System.out.println("num : "+(num/10)/10+", %10 : "+((num/10)/10)%10);
		// 12 1.2
		// 1 0.1
		// 0 0.0
		
		System.out.println("----------------------------------");
		// 랜덤값 
		int value = (int)(Math.random()*10)+1; // 1~10까지의 랜덤값
		System.out.println("랜덤값 : "+value);
		
		System.out.println(Math.random()*10);
		// 0.0 <= Math.random() < 1.0
		//       * 10
		// 0.0 *10 <= Math.random()*10 < 1.0 *10
		// 0.0 <= Math.random()*10 < 10.0
		//           (int)
		//(int) 0.0 <= (int) Math.random()*10 < (int) 10.0		
		// 0 <= (int) Math.random()*10 <  10		
		//            +1
		// 0+1 <= (int) Math.random()*10 + 1 <  10 + 1

		// 1 <= (int) Math.random()*10 + 1 <  11
	    // => 1~10까지 랜덤값
		
		// * 숫자 찾기 게임
		// 1) 문제를 생성 : 1~100까지 수 중에서 하나 
		// 2) 키보드 입력을 사용해서(Scanner) 위 문제를 해결하려고한다.
		// 3) 정답을 찾을때까지 문제는 진행되고, 도전시 마다 카운트 증가
		// 4) 해당 게임은 사용자가 정답을 찾을때 까지 진행 
		
		// Q . 48
		// > 20 (x) 오답입니다. 더 큰값을 입력하세요.
		// > 60 (x) 오답입니다. 더 작은값을 입력하세요.
		//  ...
		// > 48 (o) 정답입니다. 총 도전횟수 00회 
		System.out.println("--------------------------------------");
		
		// 1~100 랜덤한 문제 값 
		int quiz = (int)(Math.random()*100)+1;
		System.out.println("문제 : "+quiz);

		// 사용자 입력
		Scanner scan = new Scanner(System.in);
		int input = 0; // 사용자 입력값 저장 변수
		int cnt = 0; // 입력 횟수 체크 변수
		
		
		// 정답 입력 (반복문)
		do{
			System.out.println(" 1~100 까지의 수 중에서 하나를 입력하시오 >> ");
			input = scan.nextInt();
			cnt++;
			
			if(quiz > input){
				System.out.println(" 오답 ! 더 큰 수를 입력하시오. ");
			}else if(quiz < input){
				System.out.println(" 오답 ! 더 작은 수를 입력하시오. ");
			}else{
				System.out.println("정답 !! 도전횟수 : "+cnt+"회");
				break;
			}
		}while(true);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
