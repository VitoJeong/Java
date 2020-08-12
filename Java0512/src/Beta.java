class Alpha{
	public void foo() {System.out.print("Afoo ");}
}

public class Beta extends Alpha {
	public void foo() {System.out.print("Bfoo ");}
	public static void main(String[] args) {

		//Alpha a = new Beta();
		Alpha a = new Alpha();
		// => 실행시 예외 발생 
		Beta b = (Beta) a;
		// Beta b = a;
		// => 컴파일에러 발생 (컴파일러처리후 실행동작이기 때문에 메모리에 대한 상황을 알수 없음)
		
		a.foo();
		b.foo();
		
		/*1. Afoo Afoo
		2. Afoo Bfoo
		3. Bfoo Afoo
		4. Bfoo Bfoo
		5. 컴파일에러
		6. 실행시 예외 발생*/

		
		
		
	}

}
