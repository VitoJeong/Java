/*class Member{
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}*/

/*class Member{
	private Object name;

	public Object getName() {
		return name;
	}
	public void setName(Object name) {
		this.name = name;
	}
}*/

class Member<T>{
	private T name;

	public T getName() {
		return name;
	}
	public void setName(T name) {
		this.name = name;
	}
}


public class Test4 {

	public static void main(String[] args) {
		//제네릭 타입을 왜 사용하는가?
		
		Member m1 = new Member();
		m1.setName("홍길동");
		System.out.println("이름 : "+m1.getName());
		
		 m1.setName(20);
		 m1.setName(3.123);
		 // => Object 업캐스팅해서 모두 저장 가능,
		 //   다운캐스팅해서 사용해야하는 불편함. (메모리 낭비)
		 
		 // => 클래스/변수/메서드 선언시 제네릭 타입을 지정해서 
		 // 객체 생성시 마다 타입을 지정해서 사용할수 있도록 준비 
		 Member<String> m2 = new Member<String>();
		 m2.setName("홍길동");
		 // m2.setName(123); (x)
		 
		 Member<Integer> m3 = new Member<Integer>();
		 m3.setName(111);
		 
		 
		 
		 
		
		

	}

}
