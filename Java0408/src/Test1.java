
public class Test1 {

	public static void main(String[] args) {
		// for(초기식;조건식;증감식){
		// 반복할 코드;
		// }
		// 1~10 까지 for문 사용해서 가로출력
		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n-----------------------------");
		// while() 문
		// 초기식
		// while(조건식){
		// 반복할 코드;
		// 증감식;
		// }
		// 1~10 까지 while문 사용해서 가로출력
		int i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n-----------------------------");
		// 1~10까지 수중에서 홀수만 출력 (while)
		// int i=1; (x)
		i = 1;
		while (i <= 10) {
			System.out.print(i + " ");
			i += 2;
		}
		System.out.println("\n-----------------------------");
		// * while 반복문은 항상 조건문을 먼저 실행한다.
		i = 1;
		while (i++ <= 4) {
			System.out.print(i + " ");
		}
		System.out.println("\n-----------------------------");

		i = 2;
		while (i <= 5) {
			System.out.print(i + " ");
			i++;
		}
		System.out.println("\n-----------------------------");
		i = 1;
		while (++i <= 4) {
			System.out.print(i + " ");
		}
		System.out.println("\n-----------------------------");

		// while을 사용해서 1~10 까지의 누적합
		int sum = 0;
		i = 1;
		while (i <= 10) {
			sum += i;
			i++;
		}
		System.out.println("총합 : " + sum);
		// while을 사용해서 1~10 까지 짝수의 누적합
		i = 0;
		sum = 0;
		while (i <= 10) {
			sum += i;
			// i++;
			// 2씩증가
			i += 2;
			System.out.println("짝수의 합 : " + sum);
		}
		// System.out.println("짝수의 합 : "+sum);
		System.out.println("---------------------------");
		i = 2;
		sum = 0;
		while (i <= 10) {
			sum += i;
			// i++;
			// 2씩증가
			i += 2;
			System.out.println("짝수의 합 : " + sum);
		}
		System.out.println("---------------------------");
		i = 0;
		sum = 0;
		while (i <= 8) {
			i += 2;
			sum += i;
			System.out.println("짝수의 합 : " + sum);
		}

		System.out.println("---------------------------");
		// do-while()문

		// 초기식;
		// do{
		// 	반복할 코드;
		// 	증감식;
		// }while(조건식);
		
		i = 1;
		do{
			System.out.println(i);
			i++;
		}while(i<=5);
		
		
		System.out.println("\n---------------------------");
		i = 1;
		do{
			System.out.print(i+" ");
		}while(i++<=5);
		
		// * 반복문의 경우 반복할 코드의 내용이 한줄일경우 중괄호를 생략 가능
		System.out.println("\n---------------------------");
		
		for(int a=1;a<=5;a++){
			System.out.println(a);
		    System.out.println("안녕");
		}
		System.out.println("\n---------------------------");
		
		i = 0;
		while(i++<=4);
		System.out.println(i + " ");
		
		System.out.println("\n---------------------------");
		i = 1;
		do
			System.out.print(i+" ");
		while(i++<=5);
		
		
		
		
		
		
		

	}

}
