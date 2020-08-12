// * 접근지정자 : 변수,메서드,클래스 선언시 해당 동작을 사용할수 있는 
// 권한을 지정하는 방법
// => 데이터를 은닉시켜서 캡슐화한 데이터로 사용하게 하는 방법
// => 데이터 보호목적
// p243

// 1) public : 자신클래스, 같은패키지, 상위(하위)클래스, 전체 
// 2) protected : 자신클래스, 같은패키지, 상위(하위)클래스
// 3) 기본생성자(default) : 생략 : 자신클래스, 같은 패키지
// 4) private : 자신클래스
class Access{
	public 			int a;
	protected 		int b;
	/*기본접근지정자 */ int c;
	private 		int d;
	
	
}


// * 멤버 = 멤버변수 + 멤버 메서드 

class Animal{
	///*기본접근지정자*/ String name;
    private String name;
	private int age;
	
	// set / get 메서드 
	// set() : 정보를 전달받아서 멤버변수를 변경하는 메서드
	// get() : 처리된 결과(멤버변수)를 돌려주는 메서드
	// setXXXX() / getXXXX()
    public void setAge(int newAge){
    	this.age = newAge;
    }
    public int getAge(){
    	return age;
    }
    
    // alt +shift + s + r
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void showInfo(){
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}	
}

public class Test1 {

	public static void main(String[] args) {
		// 기본형 자료형 (Primitive Type)
		// => 8가지(boolean,char,byte,short,int,long,float,double)
		// 참조형 자료형 (Reference Type)
		// => 8가지를 제외한 모든 타입
		
		// * 참조형 타입의 레퍼런스(참조변수)는 객체의 주소(위치)값을 저장
		
		// 동물 객체
		//  이름, 나이  (속성)
		
		// .(연산자) 사용해서 객체의 변수,메서드 접근
		
		Animal a = new Animal();
		//a.name = "강아지";
		a.setName("강아지");
		 //a.age = 3;
		a.setAge(3);
		
//		System.out.println("동물의 이름 : "+a.name);
		System.out.println("동물의 이름 : "+a.getAge());
		//System.out.println("동물의 나이 : "+a.age);
		System.out.println("동물의 나이 : "+a.getAge());
		
		// 5살, 고양이  객체 생성
		Animal b = new Animal();
		//b.name ="고양이";
		b.setName("고양이");
		//b.age = 5;
		b.setAge(10);
		
		// 동물 객체의 정보(이름,나이) 알려주는 메서드
		// showInfo()
		b.showInfo();
		
		// 전화기(Phone)객체 생성
		// 속성 : 모델명,색상
		// 자신의 모델명 , 색상의 정보를 한번에 출력하는 메서드 
		
		// 삼성 노트10, 파랑
		Phone p = new Phone();
		p.model="삼성 노트10";
		p.color="파랑";
		p.info();
		// 애플 아이폰10, 흰색
		Phone p2 = new Phone();
		p2.model = "애플 아이폰10";
		p2.color = "흰색";
		p2.info();
		
	} // main()
} // class
class Phone{
	String model;
	String color;
	
	public void info(){
		System.out.println(" 모델명 : "+model);
		System.out.println(" 색상 : "+color);
	}
}







