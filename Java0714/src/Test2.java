
interface Test {
	public void a();
}

// 1. 인터페이스를 구현하는 서브클래스 사용
class SubTest implements Test {
	@Override
	public void a() {
		System.out.println("서브클래스 사용 a() 호출");
	}
}

@FunctionalInterface
interface Test_Param {
	public void a(int x, int y);
}

public class Test2 {

	public static void main(String[] args) {
		// 1. 서브클래스 사용
		SubTest st = new SubTest();
		st.a();

		// 2. 익명클래스
		Test t = new Test() {
			@Override
			public void a() {
				System.out.println("익명클래스 a()호출");
			}
		};
		t.a();

		// 3. 람다표현식(람다식)
		Test t2 = () -> System.out.println("람다 표현식 a()호출");

		t2.a();

		//////////////////////////////////////////////////////////

		// Test_Param 인터페이스 사용

		// 2. 익명 클래스
		Test_Param tp = new Test_Param() {
			@Override
			public void a(int x, int y) {
				System.out.println("익명클래스 : (" + x + "," + y + ")");
			}
		};

		tp.a(100, 200);

		// 3. 람다 표현식
		Test_Param tp2 = (x, y) -> System.out.println("람다식 : (" + x + "," + y + ")");

		tp2.a(300, 400);

		// 멀티쓰레드 처리(익명클래스/람다식)

		System.out.println("익명 클래스  사용");

		new Thread() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(2000);

						System.out.println("익명클래스 : " 
						    + System.currentTimeMillis());
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}// while
			}//run
		}.start();//new Thread()

		//////////////////////////////////////////////////
		System.out.println(" 람다 표현식 ");
		
		new Thread(
		/////////////////쓰레드 생성자요소///////////////////////		
			   () -> {
					while (true) {
						try {
							Thread.sleep(2000);

							System.out.println("람다식 : " 
							    + System.currentTimeMillis());
						} catch (InterruptedException e) {
							e.printStackTrace();
						}
					}// while
				}//run
		 /////////////////쓰레드 생성자요소////////////////////////		
		 		).start();//new Thread()
		
		
		
		
		
		
		
		
		
	}

}
