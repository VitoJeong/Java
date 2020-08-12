
public class Test2 {

	public static void main(String[] args) {
		// 제어문의 활용(분기문,반복문)

		// 1~10 홀수, 짝수의 합을 각각 계산후 출력 (for)
		int odd_sum = 0;
		int even_sum = 0;
		// 홀수 합
		for (int i = 1; i <= 10; i += 2) {
			odd_sum += i;
		}
		System.out.println("(1+3+5+7+9) = " + odd_sum);
		// 짝수 합
		for (int i = 2; i <= 10; i += 2) {
			even_sum += i;
		}
		System.out.println("(2+4+6+8+10) = " + even_sum);
		// for 안에 if-else 사용
		// odd_sum = 0;
		// even_sum = 0;
		int i;
		int odd;
		int even;

		for (i = 1, odd = 0, even = 0; i <= 10; i++) { // 1~10
			if (i % 2 == 1)
				// 홀수
				odd_sum += i;
			else // (i % 2 == 0)
					// 짝수
				even_sum += i;
		}
		System.out.println("(1+3+5+7+9) = " + odd_sum);
		System.out.println("(2+4+6+8+10) = " + even_sum);

		System.out.println("----------------------------------");
		// 이중for문(다중 for문)

		// for(초기식;조건식;증감식){
		// 	for(초기식;조건식;증감식){
		//	
		// 	}
		// }
		
		for(int h=3;h<=5;h++){ // 시침
			System.out.println("시침 : "+h+" 시 ");
			for(int m=1;m<=60;m++){ // 분침
				System.out.println("분침 : "+m+" 분 ");
			}
			System.out.println("분침 증강완료. 시침 1증가");
		}
		System.out.println("----------------------------------");
		
		// 구구단 (2~9단)
		
		for(int dan=2;dan<=9;dan++){ // 2~9단
			System.out.println("< "+dan+"단  >");
			for(int n=1;n<=9;n++){ // 1~9
				 System.out.println(dan+" * "+n+" = "+(dan * n));
			}
		}
		System.out.println("----------------------------------");
		// 별그리기
		// *
	
		/*
		 1. 
		 *
		 *
		 *
		 *
		 *
		 
		 */
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println(" * ");
		System.out.println("-----------------------------------");
		System.out.println();
		for(int a=1;a<=5;a++){
			System.out.println(" * ");
		}
		System.out.println("-----------------------------------");
		// 2. * * * * * 
		System.out.println(" * * * * * ");
		System.out.println("-----------------------------------");
		for(int a=1;a<=5;a++){
			System.out.print(" * ");
		}
		/*
		// 3.
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 * * * * *
		 */
		System.out.println("\n-----------------------------------");
		for(int a=1;a<=5;a++){
			System.out.println(" * * * * * ");
		}
		
		System.out.println("\n-----------------------------------");
		for(int a=1;a<=5;a++){
			for(int b=1;b<=5;b++){
				System.out.print(" * ");				
			}
			System.out.println();
		}
		System.out.println("\n-----------------------------------");
		for(int a=0;a<5;a++){
			for(int b=0;b<4;b++){
				System.out.print(" * ");				
			}
			System.out.println(" * ");
		}
		System.out.println("\n-----------------------------------");
		/*
		// 4.
		 * 
		 * *
		 * * *
		 * * * * 
		 * * * * *
		 */
		for(int a=0;a<5;a++){
			for(int b=0;b<a;b++){
				System.out.print(" * ");
			}
			System.out.println(" * ");
		}
		/*
		5.
		 * * * * *
		 * * * *
		 * * *
		 * *  
		 * 
		 ----------------------------------
		 6.
		  * * * * *
		    * * * *
		      * * *
		        * *
		          *		 
		 ----------------------------------
		 *추가문제
         1
         2  3
         4  5  6
         7  8  9  10
         11 12 13 14 15
         1  2  3  4  5
         6  7  8  9
         10 11 12
         13 14
         15		 
		 
		 */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
