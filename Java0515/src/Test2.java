import java.util.ArrayList;
// java.lang.* (자바에서 기본제공 패키지)- 생략 가능
//import java.lang.Object

class Parent /*extends Object*/ {
	
}
class Child extends Parent{
	
}

class A extends SubColor{}
class B extends ArrayList{}
class C extends Object{}
class D {
	String str="";
} 

class Point /*extends Object*/{
	private int x, y;
	public Point(){}
	public Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	
	// alt shift s  s  => toString() 자동생성
	// => 대부분 서브클래스에서 필드의 모든 정보를 한번에 출력하는 메서드로 사용
	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}

	
//	@Override
//	public String toString() {
//		return "(x,y)=("+x+","+y+")";
//	}
	@Override     // p10.equals(p20)
	public boolean equals(Object obj) {
		// 두개의 객체(x,y)모두 같은경우 - O
		//          둘중에 하나 이상 다른경우 - X
		Point pt = (Point)obj;
		
		//if(obj.x == this.x && obj.y == this.y)
		if(pt.x == this.x && pt.y == this.y)
			return true;
		else
		    return false;
	}
	
}//class Point



public class Test2 {

	public static void main(String[] args) {
		// Java.lang.Object 클래스
		// => 모든 자바 클래스의 최상위 클래스 
		// => 일반 클래스가 명시적인 상속관계가 없을경우
		//    자동으로 Object 클래스를 상속한다(컴파일러)
		// * 모든 클래스는 최상위 객체 Object를 상속한다
		
		
		D d1 = new D();
		System.out.println("클래스 이름 : "+d1.getClass());
	    System.out.println("해쉬 코드 : "+d1.hashCode());
		System.out.println("객체 문자열 : "+d1.toString());
		
		// 해쉬코드 : 시스템상에서 객체를 구분하는 고유한 정수 값
		// 클래스이름 @ 해쉬코드(16진수)
		
		System.out.println("----------------------");
		D d2 = new D();
		System.out.println("클래스 이름 : "+d2.getClass());
	    System.out.println("해쉬 코드 : "+d2.hashCode());
		System.out.println("객체 문자열 : "+d2.toString());
		
		System.out.println("----------------------");
		D d3 = d2;
		System.out.println("클래스 이름 : "+d3.getClass());
	    System.out.println("해쉬 코드 : "+d3.hashCode());
		System.out.println("객체 문자열 : "+d3.toString());
		
		// toString()
		// -> 객체의 정보를 문자열로 변경 시키는 메서드
		
		d1.str = "12345";
		System.out.println(d1.str.toString());
		
		System.out.println("----------------------");
		
		Point p = new Point();
		//=> x,y == 0,0
		System.out.println("객체 p 정보 : "+p.toString());
		System.out.println("객체 p 정보 : "+p);
		// => 속성의 값 x,y정보를 출력 
		
		Point p2 = new Point(20, 40);
		System.out.println("객체 p2정보 : "+p2);
		
		System.out.println("----------------------");
		
		// * 기본형,참조형 데이터
		//  ( == ) 연산시 차이가 발생한다.
		
	    int a = 100;
	    int b = 100;
	    
	    if( a == b )
	    	System.out.println(" 같다 ");
	    else 
	    	System.out.println("다르다");
	    
	    String str1 = new String("안녕1");
	    //String str2 = new String("안녕");
	    String str2 = str1;
	    
	    //str1 = "안녕2";
	    
	    System.out.println(str1.toString());
	    System.out.println(str2.toString());
	    
	    System.out.println(str1.hashCode());
	    System.out.println(str2.hashCode());
	    
	    System.out.println(" 객체의 레퍼런스에는 생성된 객체의 주소가 저장");
	    System.out.println(" 참조형타입은 == 연산은 객체의 주소값을 비교연산");
	    
	    if( str1 == str2 )
	    	System.out.println(" 같다 ");
	    else
	    	System.out.println(" 다르다 ");
	    
	    
	    System.out.println("-----------------------------------");
	    
	    String str3 = new String("안녕");
	    String str4 = new String("안녕");
	    
	    // equals() 사용해서 값이 같은지 다른지 확인
	    if( str3.equals(str4) )
	    	System.out.println("같다");
	    else
	    	System.out.println("다르다");
	    
	    System.out.println("---------------------------------");
	    
	    Point p10 = new Point(10,10);
	    Point p20 = new Point(10,10);
	    
	    if( p10 == p20 )
	    	System.out.println("같다");
	    else 
	    	System.out.println("다르다");
	    System.out.println("------------------------");
	    
	    if ( p10.equals(p20) )
	    	System.out.println("같다@");
	    else 
	    	System.out.println("다르다@");
	    
	    
	    
	    
	    
	    
	    
		
		
		
		
		
		

	}

}
