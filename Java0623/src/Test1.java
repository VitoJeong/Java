import java.awt.Frame;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class OuterClass{
	private int a;
	public /*static*/ class InnerClass{ // 멤버
		//static int b;
		public void method(){
			System.out.println("a : "+a);
		}
	}
}

// Inner 클래스
// 1) Inner 클래스는 Outer 클래스의 멤버를 자신의 멤버처럼 사용가능
//    접근지정자 상관없이 사용가능(private 가능)
// 2) Inner 클래스 안에는 static 변수를 선언할수 없음.
// 3) Inner 클래스는 반드시 Outer 클래스를 통해서 접근 가능
// 4) Outer$Inner.class 형태의 컴파일된 파일이 생성

// [사용되는 위치에 따른 Inner 클래스 종류]
// 1. member 클래스
// -> Outer클래스의 멤버변수/메서드 처럼 정의된 클래스
//   Outer o = new Outer();
//   Outer.Inner i = o.new Inner();

class OuterMember{
	int a = 100;
	private int b = 200;
	static int c = 300;
	
	public void OuterMethod(){
		System.out.println("OuterMember 객체 메서드 실행  a: 	"+a);
	}
	
	class InnerMember{
		public void prn(){
			System.out.println("a : "+a);
			System.out.println("private b : "+b);
			System.out.println("static c : "+c);
		}		
	}	
}



// 2. local 클래스
//  - Outer 클래스 안에 메서드 안에 클래스가 존재
//  - 메서드안에서 정의된 클래스이기 때문에, 지역변수처럼 생각(메서드 호출시 생성,종료 삭제)
//  - 지역변수를 사용X -> JDK 1.7 이후 부터는 지역변수 참조만 가능

class OuterLocal{
	int a = 100;
	private int b = 200;
	static int c = 300;
	
	public void OuterMethod(){
		int d = 400; // 지역변수
		final int e = 500;
		
	  class InnerLocal{
		  //d = 100; 지역변수 사용 불가
		  public void prn(){
			  System.out.println("a : "+a);
			  System.out.println("private b : "+b);
			  System.out.println("static c : "+c);
			  System.out.println("d : "+d);
			  System.out.println("e : "+e);			  
		  }// prn		  
	  }//InnerLocal
	  
	  InnerLocal il = new InnerLocal();
	  il.prn();	  
	}//OuterMethod
	
}//OuterLocal


// 3. static 클래스
// - static을 사용해서 Inner 클래스가 정의 

class StaticOuter{
	int a = 100;
	private int b = 200;
	static int c = 300;


	static class StaticInner{
		int d = 400;
		static int e = 500;
		
		public void prn(){
			//System.out.println("a : "+a);
			//System.out.println("private b : "+b);
			System.out.println("static c : "+c);
			System.out.println("d : "+d);
			System.out.println("static e : "+e);
		}	
	}
	
}


// 4. anonymous 클래스(익명클래스)
// - 익명클래스를 사용해서 Inner클래스를 정의
// - 2.local 클래스를 변형
// - 해당 클래스의 이름이 없음, 단순하게 인스턴스(객체) 생성과, 메서드 구현만 있음
// -> 인터페이스,추상클래스에서 추상메서드 구현할때 주로 사용
// -> GUI 환경에서 처리 

interface AnonymousOuter{	
	/*public abstract*/ void AnonyMethod();
}


class TestFrame extends Frame{
	
	public TestFrame(){
		
		addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
			}
			@Override
			public void windowDeactivated(WindowEvent e) {
			}
			@Override
			public void windowClosing(WindowEvent e) {
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		
	}
	
}



public class Test1 {

	public static void main(String[] args) {
		// 중첩 클래스 : 클래스 안에 또다른 클래스가 정의 되어 있는상태
		// - 멤버의 형태로 클래스를 포함
		// - 중첩 클래스는 개수의 제한이 없음
		// => 일반적인 상황 X, 나름의 형태로 클래스의 틀이 필요할때만 중첩클래스로 사용
		// => GUI(화면,이벤트 처리를 한번에 처리)
		
		// * public class(Top level class)는  해당 파일에서 하나만 존재해야한다.
		// => 중첩클래스의 경우는 public class를 여러개 사용가능하다.
		
		

		// member 클래스 생성
		OuterMember om = new OuterMember();
		om.OuterMethod();
		OuterMember.InnerMember im = om.new InnerMember();
		im.prn();
		System.out.println("------------------------------------");
		// local 클래스 생성
		OuterLocal ol = new OuterLocal();
		ol.OuterMethod();
		
		System.out.println("------------------------------------");
		//static 클래스 사용
		StaticOuter.StaticInner si = 
				new StaticOuter.StaticInner();
		//si.prn();
		new StaticOuter.StaticInner().prn();
		System.out.println("------------------------------------");
		
		// anonymous 클래스 생성
		
		//AnonymousOuter ao = new AnonymousOuter();(x)
		AnonymousOuter ao = new AnonymousOuter() {
			@Override
			public void AnonyMethod() {
				System.out.println("익명클래스에서의 메서드 호출");
			}
		};
		ao.AnonyMethod();
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
