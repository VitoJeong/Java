class ThreadEx{
	String name;
	public ThreadEx() {	}
	public ThreadEx(String s) {
		name = s;
	}
	public void start(){
		run();
	}
	public void run(){
		for(int num=1;num<=5;num++){
			for(int i=0;i<1000000000L;i++);
			System.out.println(name+" : "+num);
		}
	}
}

class ThreadTest implements Runnable{

	@Override
	public void run() {
		// Thread가 처리해야하는 작업을 작성하는 곳
		for(int num=1;num<=5;num++){
			for(int i=0;i<1000000000L;i++);
			System.out.println(Thread.currentThread().getName()+" : "+num);
		}
		
	}
}




public class Test3 {

	public static void main(String[] args) {
 
		// main 쓰레드(단일 쓰레드)만 동작하는 프로그램
		// => 멀티쓰레딩의 결과를 볼수 없음.
		
		ThreadEx th1 = new ThreadEx("1번 쓰레드");
		ThreadEx th2 = new ThreadEx("2번 쓰레드");
		
		//th1.start();
		//th2.start();
		
		ThreadTest tt1 = new ThreadTest();
		// tt1.start(); (x)
		
		//java.lang.Thread t = new Thread();
		Thread t = new Thread(tt1);
		t.start();
		
		// Runnable 인터페이스 구현시(상속)
		// 구현한 객체를 생성 -> Thread(x)
		// => Runnable 객체를 실행할 Thread 객체가 필요하다( 별도의 객체 생성 )
		
		Thread t2 = new Thread(new ThreadTest());
		t2.start();
		
		// new Thread(new ThreadTest()).start();
		
		// 익명클래스 
		//new ThreadTest();
		Runnable r = new Runnable() {
			@Override
			public void run() {
				for(int num=1;num<=5;num++){
					for(int i=0;i<1000000000L;i++);
					System.out.println("@@"+Thread.currentThread().getName()+" : "+num);
				}
			}
		};
		new Thread(r).start();
		
		
		
		// * 쓰레드 상태 (4가지 형태)
		
		/*
		  new  ->
		     start()          ->
		           runnable         blocked 
		       <-     run()    <-
		       stop()     
		  dead
		*/
		// new 상태 : 쓰레드 객체를 생성한 상태
		// runnable 상태 : run()를 실행할수 있는 상태 
		// * new 상태 -> runnable 상태  : start()를 통해서 상태 변경
		
		// blocked 상태 : 하나 이상의 쓰레드가 작동중이기 때문에 작업이 끝날때 까지
		//             대기중인 상태
		
		// dead 상태 : 쓰레드가 소멸된 상태
		
		// runnable <-> blocked 상태를 변경시키는 메서드/동작
		// 1) sleep / done sleep
		// 2) suspend / resume
		// 3) wait / notify
		// 4) block On IO / IO Complete
		
		
		
		
		
		
		
		
		

	}

}
