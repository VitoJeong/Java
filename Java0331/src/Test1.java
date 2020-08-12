
public class Test1 {
	public static void main(String[] args) {

		// 연산자

		// 1. 산술 연산자 ( + - * / % )
		// % -> 나머지 연산자
		System.out.println("10 + 20 = " + (10 + 20));
		System.out.println("10 - 20 = " + (10 - 20));
		System.out.println("10 * 20 = " + (10 * 20));
		System.out.println("10 / 20 = " + (10 / 20));
		System.out.println("10 % 20 = " + (10 % 20));

		// 과일 25개를 한상자에 5개씩 저장 가능한 상자를 사용해서
		// 포장 하려고한다. 이때 필요한 상자의 개수는?

		System.out.println("필요한 상자의 수 : " + (25 / 5) + "개");

		int banana = 25;
		// int box = 5;
		int sizeOfBox = 5;

		System.out.println("필요한 상자의 수 : " + (banana / sizeOfBox) + "개");

		int num = 622;
		// 연산
		// num / 100; => 6.22 => (int) 6
		// num/100 * 100 ==> 600
		// 400 출력
		System.out.println("결과 : " + (num / 100 * 100));
		// 951 -> 900 , 622 -> 600

		num = 561;
		// -> 연산 -> 일의 자리만 1로 변경
		// 77.7 => 77 => 770 => 771
		// 88.6 => 88 => 880 => 881
		// 56.1 => 56 => 560 => 561

		System.out.println("결과 : " + (num / 10 * 10 + 1));

		// 2. 비교 연산자
		// == != > < >= <=
		// * 비교연산의 결과는 항상 boolean 타입이다. (true,false)
		
		// A == B : A 와 B가 같은가?
		// A != B : A 와 B가 다른가?
		// A > B : A 가 B 보다 큰가?
		// A < B : A 가 B 보다 작은가?
		// A >= B : A 가 B 보다 크거나 같은가?
		// A <= B : A 가 B 보다 작은거나 같은가?
		
		// [ >= ](o)[ => ](x)
		// => '=' 대입 연산자으로 오른쪽의 데이터를 왼쪽으로 전달하는 역활
		// * 크기 비교를 하실때 항상 크기비교 먼저 처리후 같은지 비교.
		
		// 실수형 데이터 3.123, 2.111를 저장하는 변수를 생성후 비교연산의 결과 출력
		double dNum1 = 3.123;
		double dNum2 = 2.111;
		System.out.println(" ==  : "+(dNum1 == dNum2));
		System.out.println(" !=  : "+(dNum1 != dNum2));
		System.out.println(" >  : "+(dNum1 > dNum2));
		System.out.println(" <  : "+(dNum1 < dNum2));
		System.out.println(" >=  : "+(dNum1 >= dNum2));
		System.out.println(" <=  : "+(dNum1 <= dNum2));
		//System.out.println(" =<  : "+(dNum1 =< dNum2));
		
		
		// 3. 대입연산자
		//   A = B  : 연산의 방향이 오른쪽에서 왼쪽으로 실행 
		// + 산술연산자  => 복합 대입 연산자
		//  (+ - * / %) => += -= *= /= %=
		
		// * 누적 연산
		// A += B <=> A = A + B
		// A -= B <=> A = A - B
		// A *= B <=> A = A * B
		// A /= B <=> A = A / B
		// A %= B <=> A = A % B
		int A = 10;
		System.out.println(A += 20);
		System.out.println(A += 20);
		System.out.println(A);
		
		// 4. 증감연산자 (단항연산자)
		//  ++A A++  --A A--
		// => 변수의 앞,뒤에 붙어서 1증가,1감소 연산
		A = 100;
		System.out.println("A : "+A);
		A++;
		System.out.println("A : "+A);
		++A;
		System.out.println("A : "+A);
		A = 100;
		System.out.println("A++ : "+(A++));
		System.out.println("A : "+A);		
		System.out.println("++A : "+(++A));
		
		//  ++A(전위연산자), A++(후위연산자)
		// -> ++A는 변수 A를 실행할때 증가 / 감소,
		//    A++는 변수 A를 사용하고 증가 / 감소 (문장의 끝 ;(세미콜론)을 기준 처리)
		
		// A = 102
		// -> 증감연산자를 사용해서 100으로 출력
		--A; // 101
		A--; // 101
		System.out.println("A : "+A);//100
		A++;
		--A;
		++A;
		++A;
		System.out.println((A++));
		System.out.println(A--);
		System.out.println(A);
		
		// 5. 논리연산자
		//  && (AND연산자) ||(OR 연산자)  !(NOT 연산자)
		// => boolean 타입의 데이터를 사용한 연산
		
		// A && B, A || B , !A,!B
		
		// < 논리표 >
		// A	B	&&		||
		// T	T	T		T
		// T	F	F		T
		// F	T	F		T
		// F	F	F		F
		
		boolean T = true;
		boolean F = false;
		System.out.println("&&(AND연산)은 둘다 참일때만 참의 결과"
				+"둘중에 하나라도 거짓이 있을경우 거짓의 결과를 발생"
				);
		System.out.println("T && T = "+(T&&T));
		System.out.println("T && F = "+(T&&F));
		System.out.println("F && T = "+(F&&T));
		System.out.println("F && F = "+(F&&F));
		
		System.out.println("||(OR 연산)은 둘중에 하나라도 참일경우 참의 결과"
				+"둘다 거짓일 경우 거짓의 결과를 발생"
				);
		System.out.println("T || T = "+(T||T));
		System.out.println("T || F = "+(T||F));
		System.out.println("F || T = "+(F||T));
		System.out.println("F || F = "+(F||F));
		
		
		String name = null;
		System.out.println((4<2) && (name.length()==4));
		// System.out.println((4>2) && (name.length()==4));
		// -> 실행 X. 에러발생
		// => 논리 연산을 사용해서 효율적인 계산이 가능하다.
		
		// 비트 연산자 ( & | ^ ~ ) 
		
		// 6. 삼항 (조건) 연산자
		//  조건식? 값1(참) : 값2 (거짓) ;
		
		System.out.println((100 >= 200)? "100이 크다":"200이 크다");

		// 삼항 조건 연산자를 사용해서 양수 인지를 판별하시오.
		int data = 0;
		System.out.println((data>0)? "양수입니다.":"양수가 아닙니다.");
		// -> 음수 인지 판별
		System.out.println((data<0)? "음수입니다.":"음수가 아닙니다.");
		
		// -> data 값이 '정수' 인지를 판별하시오.
		// 양수, 음수, 0
		//System.out.println((data>0)? "양수":"음수/0");
		System.out.println((data>0)? "양수":(data<0)? "음수":"0");
		
		// 과일 107개 , 상자에는 과일을 5개씩 저장 가능
		// -> 이때 필요한 상자의 개수는?
		// (단, 상자를 5개씩 채우고 남는 과일이 있을경우 새로운 상자를 사용해서 담는다.)
		
		int apple = 107;
		int sizeOfAppleBox = 5;
		
		System.out.println("필요한 상자개수 : "
		+((apple/sizeOfAppleBox)+(apple % sizeOfAppleBox > 0? 1:0) ));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
