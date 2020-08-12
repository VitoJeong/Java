class MyDate{
	private int year;
	int month;
	int day;
							
	// public MyDate(){}
	
	public MyDate(){
		// 기본 생성자 : 전달인자가 없는 생성자  
		// -> 컴파일러가 클래스에 생성자가 하나도 없을경우에만 자동으로 생성됨.
		// => 기본생성자만 생성 가능
		// * 기본 생성자는 사용유무와 상관없이 항상 생성한다.
		System.out.println("[생성자]: 객체 생성시 호출됨");
		// year = 0;
		// month = 0;
		// day = 0;
	}
	public MyDate(int a){
		System.out.println("[오버로딩된 생성자] : 객체 생성시 호출됨");
		year = a;
	}
	public MyDate(int a, int b){}
		
	// alt + shift + s / o => 생성자 자동완성
	public MyDate(int year, int month, int day) {
		super();
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public void setYear(int year) {
		this.year = year;
	}



	public void dateMy(){
		System.out.println(" 메서드  : "+year+"/"+month+"/"+day);
	}
}


public class Test3 {

	public static void main(String[] args) {
		// 클래스 구성요소
		// 1. 멤버 변수
		// 2. 멤버 메서드 // 1+2 => 멤버
		// 3. 생성자

		// 생성자 : 멤버변수를 초기화
		// -> 클래스의 이름과 동일한 메서드
		// 1. 생성자도 메서드다.
		// 2. 메서드명이 클래스명과 동일해야함.
		// 3. 메서드 리턴타입이 없음.(리턴 타입이 존재하지 않음)

		// * 생성자는 객체 생성시 해당 멤버변수의 타입의 기본값으로 초기화 
		
		
		// [접근지정자] [메서드명](전달인자,.) {
		// 	동작;
		// }

		// new Test3(); => 객체 생성
		// 1) 새로운 객체를 사용하기 위해서 메모리 할당(heap)
		// 2) 객체의 멤버 변수를 초기화
		// 3) 생성자 호출
		
		MyDate my = new MyDate();
		my.dateMy();
		//my.year=2000;
		my.dateMy();
		
		// * 메서드 오버로딩 => 생성자 오버로딩 
		// => 생성자도 오버로딩이 가능하다.
		//  항상 이름이 동일함( 클래스명 ) 
		//new MyDate(77);
		
		// * 생성자 : 클래스의 멤버변수를 초기화한다.
		// 언제? : 객체 생성시 (생성자 호출시)
		// 생성자가 하나도 없을경우 컴파일러가 자동으로
		// 기본생성자를 생성해서 처리 
		// * 생성자도 오버로딩이 가능하다.
		// => 전달된 값으로 멤버변수를 초기화한다.
		// * 기본생성자는 항상 생성해 준다.
		
//		public MyDate(){}
//		public MyDate(int a){}
//		public MyDate(int a,int b){}
		
		new MyDate(1999).dateMy();
		MyDate md = new MyDate(1999);
		md.dateMy();
		
		
		
		
		

	}

}
