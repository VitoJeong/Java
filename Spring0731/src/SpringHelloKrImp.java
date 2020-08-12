
public class SpringHelloKrImp implements SpringHelloKr {

	@Override
	public void sayHello() {
		System.out.println("인터페이스를 구현한 클래스");
		System.out.println("sayHello()호출!!");
	}

}
