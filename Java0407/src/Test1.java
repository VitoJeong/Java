import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {

		int i;
		int j;

		i = 20;
		j = 30;

		System.out.println(i + j);
		int key = 4;

		switch (key) {
		case 1:
			System.out.println("옵션1");
		case 2:
			System.out.println("옵션2");
		case 3:
			System.out.println("옵션3");
			break;
		default:
			System.out.println("옵션4");
		}
		//////////////////////////////////////////////////////
		// 키보드입력(Scanner) 사용해서 정수 2개를 입력
		// 두 정수의 합을 출력하는 코드를 작성
		Scanner scan = new Scanner(System.in);

		/*
		 * System.out.print("두 정수를 입력하시오 ex)1 2 >>"); int num1 = scan.nextInt();
		 * int num2 = scan.nextInt();
		 * 
		 * System.out.println("정수 "+num1+"+ 정수 "+num2+" = "+(num1+num2));
		 */

		// 2차원 평면에 하나의 직사각형을 좌표로 표시한다.(50,50) (100,100) 좌표로
		// 구성된 직사각형이다. 이때, 2개의 정수값 x, y를 입력받아서 해당좌표(x,y)가
		// 직사각형 안에 존재하는지 아닌지를 판별.

		// "(00,00)는 (50,50)(100,100)의 사각형 안에 포함된다"
		// "(00,00)는 (50,50)(100,100)의 사각형 안에 포함 안된다"

		/*
		 * int x = scan.nextInt(); int y = scan.nextInt(); System.out.println(
		 * "입력받은 좌표 ("+x+","+y+")");
		 * 
		 * if((50<= x && x<=100) && (50<=y && y<=100)){
		 * System.out.println("("+x+","+y+")는  (50,50)(100,100)의 사각형 안에 포함된다");
		 * }else{ System.out.println("("+x+","+y+
		 * ")는  (50,50)(100,100)의 사각형 안에 포함 안된다"); }
		 */

		// 키보드 입력을 통해서 참,거짓의 값, 논리연산("AND","OR") 입력
		// 논리 연산을 진행하려고 할때 해당 동작을 구현하시오.
		// >> true true "AND" => true
		// >> false true "OR" => true
		// * switch-case

	/*	boolean bool1 = scan.nextBoolean();
		boolean bool2 = scan.nextBoolean();

		System.out.println("입력 값 : " + bool1 + "," + bool2);

		//String op = scan.nextLine(); //엔터키를 문자로 입력
		String op = scan.next(); // 엔터키를 단순 입력 동작으로 처리 
		System.out.println("입력 : " + op);
		
		// 입력된 데이터를 사용해서 논리 연산 실행
		switch (op) {
		case "and":
		case "AND":
			System.out.println(bool1+" && "+bool2+" = "+(bool1 && bool2));
			break;
		case "or":
		case "OR":
			System.out.println(bool1+" || "+bool2+" = "+(bool1 || bool2));
			break;

		default:
			System.out.println(" 처리가능한 연산 없음 !! ");
			break;
		}
		*/
		
		// 정수데이터 입력( 돈 ), 입력받은 돈을 각각의 단위로 바꿔서 출력
		// 5만원,1만원,5천원권,1천원권,500원,100원,10원,1원
		// => 65245원 (금액 변환 조건 : 항상 상위권종에 대해서 처리가 끝난후 다음으로 처리)
		//  1 / 1 / 1  / 0 / 0 / 2 / 4 / 5 
		// => 각각  1 / 1 / 1  / 0 / 0 / 2 / 4 / 5 필요함
		int money = scan.nextInt();
		System.out.println("금액 : "+money+"원");
		
		// 50000
		int won50000 = money / 50000;
		int result50000 = money % 50000;
		System.out.println("5만원권 변경후 남은 금액 : "+result50000);
		
		// 10000
		int won10000 = result50000 / 10000;
		int result10000 = result50000 % 10000;
		// 5000
		int won5000 = result10000 / 5000;
		int result5000 = result10000 % 5000;
		
		// 1000
		int won1000 = result5000 / 1000;
		int result1000 = result5000 % 1000;
		// 500
		int won500 = result1000 / 500;
		int result500 = result1000 % 500;
		// 100
		int won100 = result500 / 100;
		int result100 = result500 % 100;
		// 50
		int won50 = result100 / 50;
		int result50 = result100 % 50;
		// 10
		int won10 = result50 / 10;
		int result10 = result50 % 10;
		// 1
		int won1 = result10 / 1;
		int result1 = result10 % 1;
		
		
		System.out.println("입력 금액 :");
		System.out.print(" 5만원 : "+won50000+"개 ");
		System.out.print(" 1만원 : "+won10000+"개 ");
		System.out.print(" 5천원 : "+won5000+"개 ");
		System.out.println(" 1천원 : "+won1000+"개 ");
		System.out.print(" 5백원 : "+won500+"개 ");
		System.out.print(" 1백원 : "+won100+"개 ");
		System.out.print(" 1십원 : "+won10+"개 ");
		System.out.println(" 1원 : "+won1+"개 ");
		
		
		
		
		
		
		
		

	}

}
