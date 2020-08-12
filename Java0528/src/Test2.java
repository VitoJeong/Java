import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;

class Circle{
	
}

public class Test2 {

	public static void main(String[] args) {
		// O , X

		// 컬렉션들은 배열과 다르게 객체(참조형타입)만 삽입 가능하다 - O
		// 컬렉션중에 List 계열, Vector<V>, ArrayList<E>,
		// Stack<S>,LinkedList<L>등이 있다 - O
		// 모든 컬렉션 객체들은 제네릭 타입으로 지정되어있다 - O
		// 컬렉션은 배열처럼 요소를 저장하는 공간이 고정되어있다 - X (가변길이 배열)
		// 제네릭은 클래스,인터페이스,메서드를 특정타입에 종속되지 않도록하는 방법(기술) O
		// 제네릭은 기본기능으로 자바에서만 사용되는 기술이다 - X (C++,C#)
		// Vector<V> V => 제네릭 타입( 타입 매개변수 )
		// 제네릭 타입은 기본형 데이터를 사용할수 있다 - X (Wrapper 클래스사용)

		
		Vector<Integer> v = new Vector<Integer>();
		
		System.out.println("size : "+v.size());
		// v.add(3.124); (x)
		// v.add(100); (O)
		System.out.println("용량 : "+v.capacity());
		
		
		// '키' - 문자열, '값' - 실수형(Double) 타입으로 구체화된 HashMap 객체
		HashMap<String, Double> hm = new HashMap<String, Double>();
		// String 타입으로 정의된 Vector 객체 
		Vector<String> vs = new Vector<String>();
		// Circle 클래스의 객체만 저장가능한 ArrayList 객체
		ArrayList<Circle> arr = new ArrayList<Circle>();
		
		// 실수형 데이터를 저장하는 ArrayList 생성
		// 임의의 값 5개 저장
		// 해당 값을 출력 (for(;;),for(:),Iterator)
		
		List<Double> data = new ArrayList<Double>();
		
		for(int i=0;i<5;i++)
			data.add(Math.random()); // 오토 박싱
		
		System.out.println(data);
		System.out.println("----------------------------");
		for(int i=0;i<data.size();i++){
			System.out.println(data.get(i));
		}
		System.out.println("----------------------------");
		for(Double d:data){
			System.out.println(d);			
		}
		System.out.println("----------------------------");

		Iterator<Double> elements = data.iterator();
		while(elements.hasNext()){
			System.out.println(elements.next());
		}
		
		
		System.out.println("------------------------------------");
		
		// String 타입으로 구체화된 Vector 객체 생성
		Vector<String> vec = new Vector<String>();
		
		// 객체에 "Good" 값 추가
		// 객체에 "Bad" 값 추가
		// =>객체의 요소의 개수 출력
		vec.add("Good");
		vec.add("Bad");
		System.out.println("요소의 개수 : "+vec.size());
		
		// 1번 위치에 있는 요소의 값을 삭제
		// 모든 요소 출력
		vec.remove(1);
		System.out.println(vec);
		
		// 1번 위치 "itwill" 값 추가 
		// 모든 요소 출력 
		vec.add(1, "itwill");
		System.out.println(vec);
		
		//vec.add(4, "itwillbs");// 예외 발생
		//System.out.println(vec);
		
	    // 개인정보 검색 프로그램 
		// HashMap -> 이름, 나이 
		// => 값 추가 
		HashMap<String, Integer> member = new HashMap<String, Integer>();
		
		member.put("김학생", 20);
		member.put("이학생", 21);
		member.put("박학생", 22);
		member.put("정학생", 23);
		member.put("최학생", 24);
		
		System.out.println(member);
		
		// 키보드 값으로 특정 사용자의 이름을 입력시 해당 나이를 출력
		Scanner scan = new Scanner(System.in);
		System.out.println("사용자 이름을 입력하시오 > ");
		//String name = scan.next();
		//System.out.println("사용자 이름 : "+name);
		//System.out.println("사용자 나이 : "+member.get(name));
		System.out.println("사용자 나이 : "+member.get(scan.next()));
		
		 
		
		
		
		
		
		
		
		
		
		
		
	}

}
