// MyMath 객체 생성
// long 타입의 인스턴스 변수 2개를 가지고있음.
// 인스턴스 메서드 4개를 사용해서 사칙연산을 리턴( + - * / )
// 객체의 변수값을 사용해서 계산

// MyMath 클래스에 
// 클래스 메서드 4개를 오버로딩을 사용해서 생성
// 전달인자 2개를 전달받아서, 사칙연산후 결과 리턴

class MyMath {
	long num1;
	long num2;
	
	public MyMath(){}
	public MyMath(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}

	public long Add() {		return num1 + num2;	}
	public long Sub() {		return num1 - num2;	}
	public long Mul(){		return num1 * num2;	}
	public long Div() {		return num1 / num2;	}
	
	public static long Add(int a,int b){		return a+b;	}
	public static long Sub(int a, int b) {		return a - b;	}
	public static long Mul(int a, int b){		return a * b;	}
	public static long Div(int a,int b) {		return a / b;	}
	
	
}
// 100,200 의 사칙연산값을 출력





public class Test4 {

	public static void main(String[] args) {
		System.out.println(" + :"+MyMath.Add(100, 200));
		System.out.println(" - :"+MyMath.Sub(100, 200));
		System.out.println(" * :"+MyMath.Mul(100, 200));
		System.out.println(" / :"+MyMath.Div(100, 200));
		
		// * MyMath 객체 생성시 데이터 100,200값으로 초기화 
		// MyMath my = new MyMath();
		// my.num1 = 100;
		// my.num2 = 200;
		
		MyMath my = new MyMath(100, 200);
		
		System.out.println(" +  : "+my.Add());
		System.out.println(" -  : "+my.Sub());
		System.out.println(" *  : "+my.Mul());
		System.out.println(" /  : "+my.Div());
		
		
		// System.out.println(Math.random());
		System.out.println(Math.max(100, 200));
		
		
		
		

	}

}
