abstract class Shape {
	public abstract void draw();
	// public abstract void draw(String color);
	// public void draw(){ System.out.println(" 그림을 그린다. "); }
}

class Circ extends Shape { // 원
	public void draw() {
		System.out.println("원을 그린다.");
	}
	// public void draw(String color) {
	// System.out.println(color+"색 원을 그린다.");
	// }
}

class Tria extends Shape { // 삼각형
	// public void print() {
	// System.out.println("삼각형을 그린다.");
	// }
	public void draw() {
		System.out.println("삼각형을 그린다.");
	}
}

class Rect extends Shape { // 사각형
	// public void paint(){
	// System.out.println("사각형을 그린다.");
	// }
	public void draw() {
		System.out.println("사각형을 그린다.");
	}
}

public class Test2 {
	
	public static void poly(Shape ref){
		ref.draw();
	}

	public static void main(String[] args) {
		// 추상클래스 -> 왜 만들까? => 다형성
		// 유사한 형태의 클래스(객체)를 구현할때 공통적으로 있어야하는 기능을 부여하기위해서
		Circ c = new Circ();
		c.draw();
		Rect r = new Rect();
		// r.paint();
		r.draw();
		Tria t = new Tria();
		t.draw();

		System.out.println("------------------------------------");

		// Shape s = new Shape(); (x)
		// -> 추상클래스는 객체를 생성할수 없음.

		// 추상클래스의 레퍼런스는 사용가능하다.
		Shape s;

		s = new Circ(); // 업캐스팅
		s.draw();
		s = new Rect();
		s.draw();
		s = new Tria();
		s.draw();
		s.draw();

		System.out.println("----------------------------------");
		// 동일한 이름의 동작 호출을 통해서 서로 다른 객체를 호출
		// + 필요한 객체가 있을경우 직접 호출해서 사용가능(배열)

		// Shape ss = new Shape();(x)
		// -> 추상클래스를 객체 생성 X
		Shape[] shArr = new Shape[3]; // (o)
		// -> 추상클래스 타입의 배열 객체 생성 O
		// Shape sh1;
		// Shape sh2;
		// Shape sh3;
		
		shArr[0] = new Circ(); //업 캐스팅
	    shArr[1] = new Rect();
	    shArr[2] = new Tria();
	    		 
	    for(int i=0;i<shArr.length;i++)
	    	shArr[i].draw();
	    
	    System.out.println("--------------------------------");
	    
	    Circ c1 = new Circ();
	    Rect r1 = new Rect();
	    Tria t1 = new Tria();
	    
	    poly(c1);
	    poly(r1);
	    poly(t1);
	    
	    // * 추상 클래스
	    // 1) 추상클래스도 클래스이다
	    // 2) 상속이 가능하다(extends)
	    // 3) 변수,상수 사용가능
	    // 4) 일반메서드,추상메서드 사용가능
	    // 5) 모든 추상메서드는 메서드 오버라이딩 구현해서 사용해야한다
	    // 6) 업캐스팅이 가능(참조변수는 사용가능)
	    // 7) 단일 상속만 가능하다. (부모 클래스가 하나)
	    
	    
	    
	    
	    
	    
	    
	    

	}

}
