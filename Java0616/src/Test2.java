// Java.lang.Thread 클래스를 상속
class ItwillThread extends Thread {

	public ItwillThread() {
	}

	public ItwillThread(String name) {
		super(name);
	}

	@Override
	public void run() {
		// 스레드 객체가 수행할 작업을 작성
		// 일반적으로 while(true){} 포함하고있다.
		// => 쓰레드를 처리하는 시간이 매우 짧기때문에
		// run() 끝나면 자동으로 쓰레드 소멸되기 때문에 멀티쓰레딩이 불가능하다.

		// while (true) {
		// System.out.println(getName() + "!");
		// }
		
		for(int n=1;n<=5;n++){
			for(long k=1;k<10000000000L;k++);
			System.out.println(getName()+" : "+n);
			
		}
	}
}

// run() 안에서 무한루프 반복문 -> 딜레이(시간을 끄는 작업)
// => 왜 필요한가? 쓰레드로 처리하는 작업 단위는 CPU가 처리하는 시분할 시간보다 오래걸리는
// 작업이어야 멀티 쓰레딩 환경이 구축됨.

// CPU 처리시간 -> A 쓰레드 처리시간, B 쓰레드 처리시간
//    10s    ->       5s            5s
// => CPU 처리시간보다 쓰레드 처리시간이 짧기 때문에 굳이 멀티 쓰레딩 없이
// 처리하는게 훨씬 빠르다.( CPU 처리 순서대로 처리 )
// => 멀티 쓰레딩의 개념이 필요가 없음. (멀티 쓰레딩을 사용하면 더 처리가 느려진다)

// CPU 처리시간 -> A 쓰레드 처리시간, B 쓰레드 처리시간
//    10s    ->      50s             50s
// => CPU 처리시간보다 쓰레드 처리시간이 길기 때문에 쓰레드를 나누어서 동시에 처리 (번갈아가면서)
//    B-10s / A-10s/A-10s/B-10s/...../B-10s
// => 먼저 실행되는 쓰레드, 자주 실행되는 쓰레드는 알수 없음(OS가 결정함)
// => 멀티 쓰레딩 환경






public class Test2 {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread().getName());
		// -> main() : 하나의 쓰레드

		// 쓰레드를 상속하고있는 객체를 생성
		// ItwillThread th = new ItwillThread();
		// ItwillThread th2 = new ItwillThread();
		// ItwillThread th3 = new ItwillThread();
		ItwillThread th = new ItwillThread("1번 쓰레드");
		ItwillThread th2 = new ItwillThread("2번 쓰레드");
		ItwillThread th3 = new ItwillThread("3번 쓰레드");

		// 쓰레드 실행 : run() 직접 실행X, start() 통해서 간접 호출
		th.start();
		th2.start();
		th3.start();

	}

}
