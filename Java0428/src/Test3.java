public class Test3 {
	int b = check(2);
	static int a = check(1);
	
	public static int check(int i){
		System.out.println("call "+i);
		return 0;
	}

	public static void main(String[] args) {
		System.out.println("main() 호출");
		Test3 t = new Test3();
		System.out.println("b: "+t.b);
	}
	static int c = check(3);
}
// 프로그램 실행 순서
// 1. static 멤버변수/메서드가 가장 먼저 실행됨. (먼저 나온 순서대로 생성(위->아래))
// 2. 더이상 static 멤버의 생성이 없을경우 main() 실행
// 3. 객체 생성시 인스턴스변수/메서드 실행
// 4. 객체 생성후 인스턴스 변수/메서드 사용 가능
















