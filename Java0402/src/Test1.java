
public class Test1 {

	public static void main(String[] args) {

		// 기본형 타입 8개
		/*
		 * 논리형 - boolean - 1byte 문자형 - char - 2byte 정수형 - byte - 1byte - short -
		 * 2byte - int - 4byte (기본형) - long - 8byte 실수형 - float - 4byte - double
		 * - 8byte (기본형)
		 */

		// Q1.
		byte a = 11;
		byte b = 29;
		// byte c = (byte)(a + b);
		int c = a + b;

		System.out.println("c :  " + c); // 40

		// Q2.
		char ch = 'A'; // 65
		// * 문자형의 기본적으로 정수형타입의 데이터를 따른다
		// ch += 6; // 복합대입연산
		// => ch = ch + 6; 65 + 6 = 71

		// ch = ch + 6;(x)
		ch = (char) (ch + 6);

		System.out.println("ch : " + ch);

		char ch2 = 65;
		// ch2 = ch2 + 10;
		ch2 += 10;
		System.out.println("ch2 : " + ch2);

		char ch3 = 'G';
		System.out.println("ch3 : " + (char) (ch3 - 6));

		int ch4 = 65;
		System.out.println("ch4 : " + ch4);

		int ch5 = 'A';
		System.out.println("ch5 : " + (char) ch5);

		// Q3.

		float f = 3 / 2f;
		System.out.println(" f : " + f);

		// float f2 = 3.0f/2f;
		float f2 = (float) (3.0 / 2f);
		System.out.println(" f2 : " + f2);
		
		long l = 3000 * 3000 * 3000L;
		
		System.out.println(" l : "+l);
		// * 기본형 타입이아닌 연산이 필요한경우 (long,float,double)
		//  연산시 데이터중에 하나 이상 해당 타입이면 자동으로 변경되서 연산됨.
		
		
		float ff = 0.1f;
		// ->(4byte)
		// => 0.1007
		double dd = 0.1d;
		// -> (8byte)
		// => 0.10000001
		
		System.out.println(ff == (float)dd);
		
		boolean result = ff==(float)dd;
		
		System.out.println(result);
		// * 자바에서는 실수데이터를 정확하게 표현X
		// * float,double 연산시 double을 float형태로 변경하는게 좋음
		// => 기본형 실수형 타입의 데이터는 정밀한 계산 사용에는 부적합
		
		
		// Q4.
		
		int num = 88;
		// 변수 num 보다 크면서 가장 가까운 10의 배수에서 
		// 변수 num값을 뺀 나머지를 계산 ( 모든 2자리 수에 대한 처리 가능 )
		//  30 - 24 = 6 => 10 - 4 = 6
		//  80 - 71 = 9 => 10 - 1 = 9
		//  60 - 56 = 4    ....
		//  20 - 12 = 8
		// 100 - 97 = 3 => 10 - 7 = 3
		
		System.out.println("결과 : "+(10-num%10));
		
		// Q5.
		
		ch = 'H';
		// => char타입은 기본형이 정수형이다(정수형로 형변환 가능)
		// => 비교연산이 가능해진다.
		// A(65)~Z(90), a(97)~z(122)
		
//		boolean bool = ch >= 65 ;
//		boolean bool = ((ch >= 65) && (ch <=90))? true:false ;
//		boolean bool = ((ch >= 65) && (ch <=90));
//		boolean bool = ((65 <= ch) && (ch <=90));
		//               65 <= x <= 90
		//boolean bool = (('A' <= ch) && (ch <= 'Z'));
		//boolean bool = (('a' <= ch) && (ch <= 'z'));
//		boolean bool 
//		= (('A' <= ch) && (ch <= 'Z')) || (('a' <= ch) && (ch <= 'z'));
		//-> 숫자 일때 추가
		boolean bool 
		= (('A' <= ch) && (ch <= 'Z'))
		|| (('a' <= ch) && (ch <= 'z'))
		|| (('0' <=ch) && (ch <='9'));		
		
		// -> 변수 ch값이 영어 대문자 일때 true 값 출력 
		
		System.out.println(" bool : "+ bool);
		// 숫자 0~9
		System.out.println(4 + 6);
		// 문자'0'~'9'
		System.out.println('0' + '1');
		// 문자열 "0"~"9"
		System.out.println("4" + "6");
		
		
		
		// Q
		// ch입력된 변수의 값이  대문자이면 -> 소문자로 변경해서 출력
		// 소문자 라면 -> 그대로 출력
		ch = '@';
		
//		char value = ('A'<=ch && ch<='Z')? (char)(ch+32):(char)(ch-32);
		char value = ('A'<=ch && ch<='Z')? (char)(ch+32):(('a'<=ch && ch<='z')? (char)(ch-32):ch);
		
		System.out.println(" ch : "+ch);
		System.out.println(" 연산 후 ch : "+value);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
