class Rectangle{
	int w,h;
	
	public Rectangle(int a, int b){
		w = a;
		h = b;
	}
	public Rectangle(int a){
		//this(a,2);
		this.w = a;
		this.h = 2;
	}
	public Rectangle(){
		//this(1,2);
		w = 1;
		h = 2;
	}	
}


class Student {
	int id;
	
	public Student(int x){
        this.id = x;		
	}
	public Student(){
		this(0);
		System.out.println("생성자 호출!");
	}
}



public class Test5 {
	int a;
	// 메서드 오버로딩 - O
	public void test(int x){ 
		a = x;
	}
	public int test(int x,int y){
		return x * y;
	}


	public static void main(String[] args) {
		// O , X
		// 1) 객체를 인스턴스라고 한다. - O
		// 2) 클래스는 객체를 생성하기위한 틀이다. - O
		// 3) 클래스는 필드(멤버변수)와 메서드로 구성된다. - O +생성자 O
		// 4) 필드의 접근지정자는 항상 public 사용해야한다. - X
		// => private 사용(캡슐화)
		// 5) 클래스 안에는 여러개의 생성자가 존재할수 있다. - O
		// 6) this()는 생성자 안에서 다른 생성자 호출하는 용도 - O
		// 7) 생성자 안에서는 this 레퍼런스를 사용할수 없음. - X
		// 8) 생성자는 객체당 딱 한번만 호출됨. - O

		// * 객체 배열 : 특정 클래스 타입의 데이터를 연속적으로 저장하는 공간을 생성
		// => 객체 배열은 해당타입의 레퍼런스를 여러개 생성하는것
		// => 해당타입의 객체를 생성해야지만 사용가능
		
		// 객체 배열
		Student[] s = new Student[5];
		// Student s;
		// Student s;
		// Student s;
		// Student s;
		// Student s;
		
		s[0] = new Student();
		// ...
		s[4] = new Student();
		

		// 객체
		Student s1 = new Student();

	}

}
