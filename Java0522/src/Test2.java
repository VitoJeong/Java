
//import java.util.HashSet;
import java.util.*;
// java.util패키지 모두를 추가한다.

public class Test2 {

	public static void main(String[] args) {
		// 컬렉션 클래스 (p499~)
		// -> 자료구조를 사용하기 위해서 구현한 클래스
		// => 요소라고 하는 데이터를 가변인자의 저장소에 담을수 있는 객체
		// => 객체를 저장하기위해서 사용했던 고정길이 배열의 단점을 보완 (가변길이 배열)
		// => 한번에 다양한 형태의 데이터(객체)를 저장 가능
		// => 입력,출력(검색),삭제,수정 간편 (CRUD)
		// 제네릭 타입 + 컬렉션클래스 (JDK5.0 이후~)

		// 모든 컬렉션 객체는 java.util 패키지에 포함되어있다.
		// => 사용시 java.util 패키지 import 반드시 해야한다.

		// * Collection 인터페이스를 상속 : 배열처럼 데이터를 여러개 저장가능
		// 객체의 타입과 상관없이 저장가능, 필요에따라서 저장공간이 자동증가
		// Set 계열 : 순서가 없는 집합. 중복을 허용 X
		// List 계열 : 순서가 있는 집합. 중복을 허용 O

		// Set 인터페이스
		// -> 구현한 클래스 HashSet 생성
		// 컬렉션클래스 <E> 제거하면 모든타입을 Object로 저장가능
		// HashSet set = new HashSet();
		Set set = new HashSet();

		System.out.println("요소의 개수 : " + set.size());
		set.add("하나"); // String -> Object 업캐스팅
		set.add(2); // int -> Integer -> Object 오토박싱 + 업캐스팅
		set.add(3.1234);
		set.add("넷");
		set.add("five");
		set.add(6);
		set.add(6);
		System.out.println("요소의 개수 : " + set.size());

		System.out.println(set);
		System.out.println(set.toString());

		System.out.println("---------------------------");

		// for (int i = 0; i < set.size(); i++) {
		// System.out.println(i + "-" + set.get(i));
		// }

		// Iterator 인터페이스
		// -> 반복자 : 해당 컬렉션에서 현재위치, 다음 위치로 이동후 변경 동작
		// * Collections 인터페이스에서 iterator()메서드 형태로 제공
		// => Collection 인터페이스를 구현하는 모든 객체들은 iterator() 메서드를
		// 모두사용 가능하다. (컬렉션들 사이에서 동일한 접근방법을 가지는 형태)

		Iterator elements = set.iterator();

		while (elements.hasNext()) {
			System.out.println(elements.next());
		}

		// List 계열 : ArrayList, Vector, Stack, LinkedList

		List arr = new ArrayList();
		// * 인덱스를 통해서 해당요소의 위치에 접근 가능하다.
		// * 인덱스 0번부터 순차적으로 증가
		System.out.println("요소의 개수 : " + arr.size());
		arr.add("하나"); // String -> Object 업캐스팅
		arr.add(2); // int -> Integer -> Object 오토박싱 + 업캐스팅
		arr.add(3.1234);
		arr.add("넷");
		arr.add("five");
		arr.add(6);
		arr.add(6);
		System.out.println("요소의 개수 : " + arr.size());
		System.out.println(arr);

		System.out.println("---------------------------");

		for (int i = 0; i < arr.size(); i++) {
			System.out.println(i + "-" + arr.get(i));
		}
		System.out.println("-------------------------------");

		// * 디자인 패턴 : Iterator 패턴
		// * 컬렉션의 종류와 상관없이 동일한 형태의 접근을 할수있다.
		Iterator elements2 = arr.iterator();

		// [컬렉션객체].iterator() => 컬렉션 객체를 반복할수있는 형태로 변환메서드
		while (elements2.hasNext()) {
			System.out.println(elements2.next());
		}

		// * Enumeration 인터페이스 : Vector,HashMap(Table)
		// =>반복처리 할수 있도록 만들어 놓은 인터페이스

		System.out.println("------------------------------------");

		// Vector 클래스
		Vector vec = new Vector();
		// List vec = new Vector();
		
		// 요소의 개수
		System.out.println(vec.size());
		// 백터의 크기(용량)
		System.out.println(vec.capacity());
		
		for(int i=0;i<5;i++)
			vec.add(i*100);
		System.out.println(vec);
		
		for(int i=0;i<vec.size();i++){
			System.out.println(vec.get(i));
		}
		
		Iterator vecEle = vec.iterator();
		while(vecEle.hasNext()){
			System.out.println(vecEle.next());
		}
		
		
		
		
		
		

	}

}
