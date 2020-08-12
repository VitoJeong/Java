class Go extends Thread {
	public void run(){
	    while(true){
	    	System.out.println("Go!");
	    }		
	}	
}

class Come extends Thread {
	public void run(){
	    while(true){
	    	System.out.println("Come!");
	    }		
	}	
}



public class Test1 {

	public static void main(String[] args) {
		// 멀티 스레드(Multi Thread) p542~
		
		// 프로그램 : 응용프로그램이 하드디스크에 저장된 상태 
		//   -> 로드( 메모리에 올린다 )
		// 프로세스 : 실행중닝 프로그램 (메모리에 올라가 있는 프로그램)
		// (멀티 프로세싱)=> 멀티 태스킹 : 한번에 여러개의 작업을 동시 실행 
		
		// 스레드 : 하나의 프로그램의 최소 실행단위 
		// 멀티 스레드 : 여러개의 스레드가 실행되는 프로그램
		
		//* 윈도우 ->
		// 1) 멀티 태스킹 : 하나의 CPU가 여러개의 프로세스를 교대로 수행하는것
		// => CPU가 할당된 시간을 분해서 각 프로그램에 제어권을 전달하는 방식으로 처리하는것
		// =>  개발자가 제어 불가능한 부분(OS 영역)

		// 2) 멀티 쓰레딩 : 하나의 CPU가 여러개의 스레드를 교대로 수행하는것
		// =>  개발자가 소스코드를 사용해서 제어 가능
		// * 컨텍스트 스위칭(Context Switching) : 문맥 교환
		
		// 쓰레드 
		// 1) 정보 : 쓰레드 명, ID, 처리 소요시간, 우선순위 (OS가 처리) => 스케쥴링
		// 2) 실행코드 : 정보를 바탕으로 작업을 실행하기 위한 코드(개발자 처리)
 		// * 하나의 프로세스가 여러가지 작업을 처리해야할때, CPU가 내부적으로
		// 독립된 모듈의 형태로 작업을 처리하는데 이때 모듈을 쓰레드라고 한다.
		// - 멀티쓰레딩도 컨텍스트 스위칭을 통해서 작업을 번갈아가면서 사용한다.
		//  (작업 처리 시간이 매우 짧아서 동시에 실행되는것 처럼 보인다.)
		
		// Java 쓰레드
		// => 일반 쓰레드와 동일개념
		// Java OS
		// => JVM( OS 역활을 한다 )
		// Java 프로세스
		// => X (쓰레드로만 처리)
		
		// => 1) Thread 클래스 상속   2) Runnable 인터페이스 구현(상속)
		
		
		
		
		Go g = new Go();
		//g.run();
		
		Come c = new Come();
		
		//c.run();
		//g.run();
		
		g.start();
		c.start();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
