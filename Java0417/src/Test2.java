
public class Test2 {
	// 변수 선언

	// 메서드 생성 위치
	public static void hello1() {
		System.out.println("안녕하세요 홍길동 입니다");
	}

	public static void inputNumber(int number) {
		System.out.println("입력값 : " + number);
	}

	// ckNumber1() : 전달받은 값이 양수 / 음수 판별
	public static void ckNumber1(int num) {
		if (num > 0)
			System.out.println("양수");
		else
			System.out.println("음수");

	}

	// ckNumber2() : 전달받은 값이 홀수 / 짝수 판별
	public static void ckNumber2(int num) {
		if (num % 2 == 0)
			System.out.println("짝수");
		else
			System.out.println("홀수");

	}

	// sumNumber() => 1~전달한 숫자 까지의 합을 출력
	public static void sumNumber(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		System.out.println(" sum : " + sum);
	}

	// absNumber()
	public static void absNumber(int n) {

		// if(n > 0)
		// System.out.println("|"+n+"| = "+n);
		// else
		// System.out.println("|"+n+"| = "+(-n));
		
		System.out.print("|"+n+"| = ");
		if(n < 0)
			n = -n;
		
		System.out.println(n);

	}
	
	// AplusB()
	public static double AplusB(double dNum1,double dNum2){
		double sumDouble = dNum1 + dNum2;
		
		return sumDouble;
    	//return dNum1 + dNum2;
	}
	
	
	// MyInfo()
	public static void MyInfo(String name,int classNo,int ipNo){
		
		System.out.println(name+"님은 "+classNo+"강의장에 "+ipNo+"에 있습니다.");
		
	}
	// sumSubject() => 과목 점수 3개의 합을 리턴 하는 메서드 생성
	public static int sumSubject(int k,int e, int m){
		return k+e+m;
	}
	// avgSubject() => 과목 점수 3개의 평균을 리턴하는 메서드 생성
	public static double avgSubject(int k,int e, int m){
		
		//return (k+e+m)/3.0;
		return (int)(sumSubject(k, e, m)/3.0*10+0.5)/10.0;
	}
	
	
	

	public static void main(String[] args) {
		// "안녕하세요 홍길동 입니다"
		// 출력하는 메서드 생성
		// public static
		// 리턴타입 X, 전달인자 x => 메서드 사용 출력
		hello1();
		System.out.println("-------------------------------------");
		// public static, 리턴타입 x, 정수형타입의 데이터 1개를 필요로 하는 메서드
		// inputNumber() => 전달한 숫자 출력 해주는 메서드 "입력값 : 00"
		inputNumber(300);
		// public static, 리턴타입 x, 정수형타입의 데이터 1개를 필요로 하는 메서드
		// ckNumber1() : 전달받은 값이 양수 / 음수 판별 ,
		// ckNumber2() : 전달받은 값이 홀수 / 짝수 판별

		ckNumber1(100);
		ckNumber2(33);

		// public static, 리턴타입 x, 정수형타입의 데이터 1개를 필요로 하는 메서드
		// sumNumber() => 1~전달한 숫자 까지의 합을 출력
		sumNumber(-100);

		// public static, 리턴타입 x, 정수형타입의 데이터 1개를 필요로 하는 메서드
		// absNumber() => 해당입력받은 숫자의 절대값을 출력
		absNumber(-100);
		
		// public static, 리턴 : 연산의 결과, 실수형 데이터 2개를 입력해서 
		// 두개의 변수 합을 출력하는 메서드 APlusB() => 출력
		
		System.out.println(AplusB(4.123, 7.234));
		
		
		// public static, 리턴X, 전달인자 3개 필요
		// MyInfo(), 사용자의 이름, 강의장번호, 자신의 위치
		// "홍길동 님은 6강의장 x.x.x.200번 자리에 있습니다."
		
		MyInfo("홍길동", 6, 200);
		MyInfo("홍길동", 3, 10);
		
		// public static, 리턴 : 각각 연산의 결과를 리턴,
		// 전달인자 3개
		// sumSubject() => 과목 점수 3개의 합을 리턴 하는 메서드 생성
		// avgSubject() => 과목 점수 3개의 평균을 리턴하는 메서드 생성
		
		//=> 호출 (출력)
		
		System.out.println("3과목 총점 : "+sumSubject(100, 60, 79));
		System.out.println("3과목 평균 : "+avgSubject(100, 60, 79));
		
		
		
		

	}// main()

}
