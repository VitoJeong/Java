class ItwillTicket implements Runnable {

	int ticket = 30;

	@Override
	public void run() {
		// 쓰레드가 작동할때 티켓 예매

		for (int i = 1; i <= 30; i++) {
			// 쓰레드를 번갈아가면서 처리
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			// 예매 동작
			getTicket();
		} // for

	}// run()

	public synchronized void getTicket() {
		// 티켓 1장씩 예매
		ticket -= 1;// ticket = ticket -1;

		if (ticket <= 0) {
			System.out.println(Thread.currentThread().getName() + "님 잔여 티켓이 없습니다!");
			System.out.println(" 시작 화면으로 돌아갑니다 \n\n\n\n\n ");
			return;
		}
		// 티켓이 남아 있는 경우

		System.out.println(Thread.currentThread().getName() + "님 예매 성공!!! ");
		System.out.println("현재 잔여 티켓 : " + ticket + "장 \n\n\n\n");
	}

}// class

public class Test3 {

	public static void main(String[] args) {
		// 동기화(synchronized)
		// 멀티 쓰레딩 환경은 하나의 자원을(프로세스) 여러개의 쓰레드가 동시에 접근
		// -> 예상하지 못한 결과를 얻을수 있음.
		
		// 동기화 처리를 통해서 사용 => 처리되는 작업들을 한번에 하나의 쓰레드만 
		//                       처리할수 있도록 동기화
		// * 예매,예약 시스템에서는 반드시 고려해야할 상황
		
		// 한번에 하나의 쓰레드(동작)만 처리 할수 있도록 구현 
		// => 임계영역(critical section)
		

		// 1) 메서드 동기화
		// public synchronized void method(){
		//
		// }
		// 2) 동기화 코드 블럭
		// synchronized (객체) {
		//
		// }
		
		
		
		
		
		

		ItwillTicket it = new ItwillTicket();

		Thread user1 = new Thread(it, "사용자 1");
		Thread user2 = new Thread(it, "사용자 2");
		Thread user3 = new Thread(it, "사용자 3");

		user1.start();
		user2.start();
		user3.start();

	}

}
