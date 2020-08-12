class Hello{
	int a;
	int b;
	int c;
	int d;
	
	public Hello(){
		
	}
	// alt + shift + s  // + o
	public Hello(int a){
	}
	public Hello(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public Hello(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	
	
	
}

class Mydate2{
	
	int year;
	int month;
	int day;
	
	//public Mydate2(){}
	// this() 생성자 : 클래스 안에 있는 생성자를 호출
	// this(a)
	
/*	public Mydate2(){
		// 기본생성자
		year = 2020;
		month = 4;
		day = 24;		
	}
	public Mydate2(int year){
		this.year = year;
		month = 4;
		day = 24;
	}
	public Mydate2(int year, int month){
		this.year = year;
		this.month = month;
		day = 24;
	}
	public Mydate2(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}*/
	
	public Mydate2(){
		// 기본생성자 // 0/0/0
		// * this()생성자 호출은 반드시 생성자 첫줄에 위치 해야한다.
		this(0,0,0);
		System.out.println("기본 생성자 호출!");		
	}
	public Mydate2(int year){
		// year / 0 / 0
		this(year,0,0);
		System.out.println("생성자(1) 호출!");
	}
	public Mydate2(int year, int month){
		// year / month / 0
		this(year,month,0);
		System.out.println("생성자(2) 호출!");
	}
	public Mydate2(int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;	
		System.out.println("생성자(3) 호출!");
	}
	
	
	
	
	
	public void setDay(int day) {
		this.day = day;
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		// this 레퍼런스, super 레퍼런스
		// this : 나 자신(클래스,객체)을 가리키는 레퍼런스
		// -> 선언없이 사용가능한 레퍼런스
		// => 컴파일러가 자동으로 선언해주는 레퍼런스(객체생성시)
		
		// 1. this (주소 참조) : 해당 객체의 주소를 전달해준다.
		// 2. this (요소 구분) : 메서드의 전달인자의 이름과
		//                    멤버변수의 이름이 같을때 구분하기위해서 사용
		//                    set메서드에서 활용
		// 3. this() (예약어) : 생성자, 같은 클래스에 있는 다른 생성자 호출
		Test4 t =new Test4();
		
		
		Mydate2 my20 = new Mydate2();
		Mydate2 my21 = new Mydate2(1);
		Mydate2 my22 = new Mydate2(1,2);
		Mydate2 my23 = new Mydate2(1,2,3);
		
		
		
		
		
		
		
		
		
		

	}

}
