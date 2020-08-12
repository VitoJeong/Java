class A{
	private int a,b;
	public void set(int a,int b){
		this.a = a;
		this.b = b;
	}
}
class B extends A{
	protected int c,d;
}
class C extends B{
	public int e,f;
}
class D extends B{
	
}



class TestA{
	private int x,y;
	
	public TestA(){}
	
	public TestA(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	protected void setX(int x){
		this.x = x;
	}	
}
class TestB extends TestA{
	private int w;
	
	public TestB(){
		//super();
		super(10,10);
	}
	
	protected void setXY(int a,int b,int c){
		setX(a+b);
		// y = b;
		w = c;
	}	
}

class Shape{
	public void draw(){
		System.out.println("shape");
	}	
}

class Circle extends Shape{
	public void draw(){
		System.out.println("circle");
	}
	public void paint(){
		// 1."shape"출력
		super.draw();
		System.out.println("-----------------");
		// 2."circle"출력
		this.draw();
	}
}


abstract class ABSShape{
}

class Rect extends ABSShape{
}

// ABSShape a; (o)
// ABSShape a = new ABSShape();(x)
// ABSShape a = new Rect(); (o)

// 전화번호를 저장하는 Phone 객체
// 사용자의 이름,전화번호를 저장하는 SamsungPhone 객체
// => 객체 생성시 (이름,전화번호 정보를 초기화)
// => show() => 개인정보(이름,전화번호 출력) *모든 핸드폰은 필수적으로 있어야하는 기능

abstract class Phone{
	String tel;
	public Phone(){}
	public Phone(String tel){
		this.tel = tel;
	}
	public abstract void show();
}
class SamsungPhone extends Phone{
	String name;
	public SamsungPhone(){}
	public SamsungPhone(String name,String tel){
		super(tel);
		this.name = name;
	}
	@Override
	public void show() {
		System.out.println("이름 : "+tel+", 전화번호 :"+tel);
	}
	
}









public class Test3 {

	public static void main(String[] args) {
		
		//1
		A a = new A();
		// a.a =10; (x)
		// a.b = 10;( x)
		// => 같은 객체라도 접근지정에 따른 범위가 지정되어있음.
		a.set(10, 20);
		
		//2 
		B b = new B();
		// b.a /b =10;
		b.c = 10;
		b.d = 20;
		b.set(10, 20);
		
		// 3
		C c = new C();
		// c.a=10; (x)
		c.c = 10; // d 동일
		c.e = 10; // f 동일
		c.set(10, 20);
		
		
		
		// O X
		// 1. 슈퍼클래스의 private 멤버는 서브클래스에서 바로 접근이 불가능하다. O
		// 2. 슈퍼클래스의 protected 멤버는 같은패키지에 있는 서브클래스만 접근 가능하다. O
		// 3. 슈퍼클래스의 public 멤버는 모든 클래스에서 접근이 가능하다. O
		// 4. 메서드 오버라이딩의 경우 상속을 했을때만 사용 가능하다 O
		// 5. 메서드 오버라이딩은 서브클래스의 메서드를 재 정의 해서 사용하는것 X
		// 6. 메서드 오버라이딩시 메서드 이름,전달인자의 타입,개수, 리턴 타입까지 모두 같아야한다. O
		
		
		System.out.println("---------------------------------");
		
		A ac = new C();
		
		System.out.println(ac instanceof A);
		System.out.println(ac instanceof B);
		System.out.println(ac instanceof C);
		System.out.println(ac instanceof D);
		
		System.out.println("-------------------------------------");
		
		System.out.println(new D() instanceof A);
		System.out.println(new D() instanceof B);
//		System.out.println(new D() instanceof C); (x)
		
		System.out.println(new B() instanceof C);
		
		System.out.println("------------------------------------");
		
		Shape s = new Shape();
		s.draw();
		
		Circle cc = new Circle();
		cc.draw();
		cc.paint();
		
		Shape ss = new Circle();
		ss.draw();
		// ss.paint(); 
		
		Circle cs = (Circle)ss;
		cs.paint();		
		
		
		

	}

}
