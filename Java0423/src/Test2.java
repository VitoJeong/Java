//import com.itwillbs.sayHello.Hello;
import java.util.Scanner;
import com.itwillbs.sayHello.*;
//import java.lang.String;
//import java.lang.*;
// => 생략가능 : java.lang 패키지에 있는 모든 클래스는 
// import 구문 추가 없이 사용 가능



//class Scanner{	
//}

//import문은 프로그램의 최상단에 위치
// 외부의 클래스를 가져와서 사용할수 있도록 해준다. 
// * 자신의 클래스에 없는 정보(클래스) 가져와서 사용

class Student{
	private String name;
	private String tel;
	private int classRoom;
	
	// alt + shift + s  / r
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public int getClassRoom() {
		return classRoom;
	}
	public void setClassRoom(int classRoom) {
		this.classRoom = classRoom;
	}
}


public class Test2 {

	public static void main(String[] args) {
		
		// 학생정보를 저장하는 객체 
		// 이름,전화번호,강의실 (외부 직접 접근불가 -> setter/getter)
		
		// "홍길동","010-1234-7894" , 6
		Student s1 = new Student();
		s1.setName("홍길동");
		s1.setTel("010-1234-7894" );
		s1.setClassRoom(6);

		// "박학생","010-3232-7845" , 7
		Student s2 = new Student();
		s2.setName("박학생");
		s2.setTel("010-3232-7845");
		s2.setClassRoom(7);
		
		System.out.println(s2.getName());
		System.out.println(s2.getTel());
		System.out.println(s2.getClassRoom());
		
		// * 패키지 : 클래스의 그룹(묶음)
		// -> 동일한 이름의 클래스를 사용해서 발생하는 문제를 예방
		// => 패키지는 중복이 불가능
		// * 패키지명 
		//   [회사도메인 주소.패키지명.클래스명]
		
		//  부산(01012345678)-A클래스, 부산(01045647878)-A클래스
		// 회사 정보 (도메인:인터넷주소)
		
		// www.itwillbs.co.kr -> 패키지
		// co.kr.itwillbs.class6.abc.java
		
		// www.itwillbs.co.kr.class6.(홍길동.java)
		// www.naver.com.class6.(홍길동.java)
        //->
		// naver.com.class6.(홍길동.java)
		// -> 
		// com.naver.class6.(홍길동.java)
		
	   // Test 클래스에 있는 prn메서드 호출
		Test t = new Test();
		t.prn();
		
		Hello h = new Hello();
		h.sayHello();
		
		Scanner scan = new Scanner(System.in);
		


	}

}
