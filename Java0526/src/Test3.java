import java.util.ArrayList;
import java.util.Vector;

public class Test3 {

	public static void main(String[] args) {
		// 제네릭의 도입 (JDK 5.0~) => 데이터 안정성

		// Vector vec = new Vector();
		Vector<String> vec = new Vector<String>();

		vec.add("Apple");
		vec.add("Orange");
		vec.add("BananA");

		System.out.println(vec);

		// String 클래스 -> 데이터를 전부 대문자로 표시 메서드(toUpperCase())
		// => 벡터의 모든 요소의 값을 대문자로 변경해서 출력

		for (int i = 0; i < vec.size(); i++) {
			// Object tmp = vec.get(i);
			// System.out.println(tmp.toUpperCase());
			// String tmp = (String) vec.get(i);
			String tmp = vec.get(i);
			System.out.println(tmp.toUpperCase());
		}

		// * Object타입으로 모든 객체가 업캐스팅 가능해서 -> 저장 가능
		// 해당 객체를 사용할때 마다 다운캐스팅 해야하더라(단점), 다운캐스팅할 타입을 모를수 있음.
		// => 데이터의 불안전한 모습을 보여준다.

		// * 제네릭(타입) : 모든 종류의 데이터 타입을 처리할수 있도록, 일반화된 타입 매개변수
		// 클래스(인터페이스),메서드 생성시 사용 가능
		// * C++ 템플릿과 동일한 개념으로 생각
		// * 특정 컬렉션안에 저장된 데이터를 반드시 하나의 형태만 처리가능하도록 만드는 것
		// 제네릭 타입 : E,K,V,T 와 같은 형태로 대문자 알파벳 한글자로 표시됨.
		Vector<String> v = new Vector<String>();
		// => 벡터 생성시 String 타입의 데이터만 저장하겠다.
		// v.add(111);
		// v.add(String);
		// Vector<int> vi = new Vector<int>(); (x)
		// => 제네릭 타입은 기본형 타입을 사용할수 없다.
		Vector<Integer> vi = new Vector<Integer>();
		// => 기본형타입은 Wrapper 클래스 사용해서 저장
		vi.add(10); // 오토 박싱
		vi.add(new Integer(100));

		// Vector<Character> vc = new Vector<>(); (o)
		Vector<Character> vc = new Vector<Character>();
		// JDK 1.8~ 생성 객체의 제네릭 타입을 생략 가능. 그러나, 타입을 항상 명시할것!
		// * 생성되는 객체와 레퍼런스의 제네릭타입을 항상 동일하게 처리한다.

		// * 확장 for문 (foreach) - JDK 5.0~ 사용가능
		// for(데이터타입 변수명 : 배열/컬렉션 레퍼런스 ){
		// 반복 코드
		// }

		// ArrayList<Double> data = new ArrayList<Double>();
		ArrayList data = new ArrayList();
		//ArrayList<Point> data = new ArrayList<Point>();

		data.add(1.123);
		data.add(2.123);
		data.add(3.123);

		// for(Double d : data){
		// System.out.println(d);
		// }
		// for(double d : data){
		// System.out.println(d);
		// }

		for (Object d : data) {
			System.out.println(d);
		}

	}

}
