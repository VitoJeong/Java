
public class Test1 {

	public static void main(String[] args) {
		// 조건식 만들기
		// 1) int형 변수 x가 10보다 크고, 20보다 작을때 true
		// -> 10 < x && x < 20
		// 2) char형 변수 ch가 'x'또는 'X'일때 true
		// -> ch == 'x' || ch == 'X'
		// 3) char형 변수 ch가 영문자일때 true(대문자)
		// -> 'A' <= ch && ch <= 'Z'
		// 4) int형 변수 y가 400으로 나누워 떨어지거나 또는 4로 나눠떨어지고,
		// 100으로 나누어 떨어지지 않을때 true
		// -> (y % 400 == 0) || (y % 4 == 0) && (y % 100 != 0)
		// 5) boolean형 변수 powerOn false일때 true
		// -> powerOn == false / !powerOn

		// 1 ~ 20까지 정수 중에서 2의 배수 또는 3의 배수가 아닌 수의 총합을 계산하시오.
		int sum = 0;

		for (int i = 1; i <= 20; i++) {
			if (i % 2 != 0 && i % 3 != 0) {
				sum += i;
			}
			// System.out.print(i+" ");
		}
		System.out.println("sum : " + sum);
		System.out.println("----------------------------------");

		// 두 개의 주사위를 던져서, 눈의 합이 6이되는 경우의 수를 계산
		// 1 + 5 = 6
		// ...
		// 총 : 00 개
		int cnt = 0;
		for (int i = 1; i <= 6; i++) { // 1번 주사위
			for (int j = 1; j <= 6; j++) { // 2번 주사위
				if (i + j == 6) {
					System.out.println(i + " + " + j + " = " + (i + j));
					cnt++;
				}
			}
		}
		System.out.println("총 : " + cnt + " 개");
		System.out.println("------------------------------------");

		// 방정식 2x + 4y = 10을 만족하는 모든 해를 구하시오.
		// 단, x,y는 정수. (0<=x<=10, 0<=y<=10)
		for (int x = 0; x <= 10; x++) {
			for (int y = 0; y <= 10; y++) {
				if (2 * x + 4 * y == 10) {
					System.out.println("x =" + x + ",y=" + y);
				}
			}
		}

		System.out.println("------------------------------------");
		// 피보나치 수열 : 1번,2번 자리는 항상 1, 그다음부터는 바로 앞에 2개의 합을 저장
		// 1,1,2,3,5,....
		// 10번째 까지의 피보나치 수열을 출력
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;

		for (int i = 1; i <= 10; i++) {
			// System.out.print(i+" ");
			if (i == 1) {
				System.out.print(num1 + " ");
			} else if (i == 2) {
				System.out.print(num2 + " ");
			} else { // 3번자리 이상
				num3 = num1 + num2;
				System.out.print(num3 + " ");
				num1 = num2;
				num2 = num3;
			}
			// 숫자 위치 교환
			// num3 = num2 + num1
			// num4 = num3 + num2
			// => num1 => num2, num2 => num3
		}
		///////////////////////////////////////////
		System.out.println();
		num1 = 1;
		num2 = 1;
		num3 = 0;

		System.out.print(num1 + "," + num2);

		for (int i = 0; i < 8; i++) {
			num3 = num1 + num2;
			System.out.print("," + num3);

			num1 = num2;
			num2 = num3;
		}

		System.out.println("------------------------------");
		for (int i = 0; i <= 10; i++) {
			for (int j = 0; j <= i; j++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println("------------------------------");
		// while문으로 변경
		int i = 0;
		while (i <= 10) {
			int j = 0;
			while (j <= i) {
				System.out.print(" * ");
				j++;
			}
			System.out.println();
			i++;
		}

		// for(초기식;조건식;증감식){
		//
		// }
		// 초기식
		// while(조건식){
		// 증감식
		// }
		System.out.println("------------------------------");
		
		// 다음 계산의 결과를 출력하시오.
		// 1+(1+2)+(1+2+3)+(1+2+3+4)+...+(1+2+3+.....+10)
		// 1 + 3 + 6 + 10+ .... + 55 =220
		//sum = 0;
		// 1
		//for(i=1;i<=1;i++) {	   sum +=i;		}
		// 1 + 2
		//for(i=1;i<=2;i++) {	   sum +=i;		}
		// 1 + 2 + 3
		//for(i=1;i<=3;i++) {	   sum +=i;		}
		// 1 + 2 + 3 + 4
		// 1 + 2 + 3 + 4 + 5
		// 1 + 2 + 3 + 4 + 5 + 6
		// 1 + 2 + 3 + 4 + 5 + 6 + 7
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 
		// 1 + 2 + 3 + 4 + 5 + 6 + 7 + 8 + 9 + 10
		//for(i=1;i<=10;i++) {	   sum +=i;		}
		
		sum = 0;
		int total = 0;
		for(i=1;i<=10;i++){
			sum += i;
			total += sum;
			System.out.println("1~"+i+"의 합 : "+sum);
			System.out.println("total : "+total);
		}
		//System.out.println("sum : "+sum);
		System.out.println("total : "+total);
		
		System.out.println("----------------------------------");
		// 1 + (-2) + 3 + (-4) + 5 +......
		// 이연산을 처리해서 결과가 100되는 시점을 출력
		sum = 0;
		// 1) 숫자는 1 부터 계속해서 1씩 증가한다.
		for(int n=1;true;n++){
			
			// 2) 홀수는 양수, 짝수는 음수로 표시한다.
			if(n%2 != 0){// 홀수
				//n = n;
			}else{ // 짝수
				n = -n; // -1 * n
			}
			System.out.println(n);
			// 3) 모든 양수, 음수를 더한다.
			sum += n;
			// 3-1) 음수일때는 다시 양수로 변경
			if(n <0 ){
				n = -n;
			}
			
			//System.out.println(sum);
			// 4) 합이 100되면 연산을 멈춘다.
			if(sum == 100){ 
			    System.out.println("합 : "+sum+", 값 : "+n);	
				break;
			}
		}
		System.out.println("-------------------------------");
		
		sum = 0;
		int num = 0;
		int s = 1; // 숫자의 부호를 결정하는 변수
		
		for(int a=1;true;a++,s=-s){
			// 1,-2,3,-4,...
			num = a * s;
			sum += num; // sum = sum + num;
			
			if(sum >= 100) break;			
		}
		
		System.out.println("합 : "+sum+", 값 : "+num);
		
		System.out.println("-------------------------------");
		
		sum = 0;
		num = 0;
		s = 1; // 숫자의 부호를 결정하는 변수
		
		for(int a=1;sum<100;a++,s=-s){
			// 1,-2,3,-4,...
			num = a * s;
			sum += num; // sum = sum + num;
		}
		
		System.out.println("합 : "+sum+", 값 : "+num);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
