class InOutProcess {

	public static int MAX_GUEST = 5;
	int guestNum = 0;

	// 손님이 들어왔을때
	public synchronized void inGuest() {
		System.out.println("손님이 들어옴 : 안녕하세요~");
		guestNum++;
		System.out.println("현재 식사중인 손님 : " + guestNum + "명 ");

		// 식당에 자리가 없을때
		if (guestNum == MAX_GUEST) {
			// 대기
			try {
				wait(); // -> 쓰레드는 waiting pool에 들어감
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("식사중.......");
	}

	// 손님이 나갈때
	public synchronized void outGuest() {

		if (guestNum < 1) {
			notify(); // waiting pool에서 기다리던 쓰레드하나가 들어옴(runnable)
			return;
		}

		// else
		System.out.println("손님이 나감 : 안녕히 가세요~");
		guestNum--;
		System.out.println("현재 손님은 " + guestNum + "명 ");

	}

}

// 식당에 들어가는 사람
class inGuestThread extends Thread {

	// 식당 정보
	InOutProcess iop;

	public inGuestThread() {
	}

	public inGuestThread(InOutProcess iop) {
		this.iop = iop;
	}

	@Override
	public void run() {
		// 식당에 사람을 투입
		for (int i = 1; i <= 10; i++) {
			// 식당 입장
			iop.inGuest();

			try {
				Thread.sleep((int) Math.random() * 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

// 식당에서 나가는 사람
class OutGuestThread extends Thread {
	// 식당 정보
	InOutProcess iop;

	public OutGuestThread() {
	}

	public OutGuestThread(InOutProcess iop) {
		this.iop = iop;
	}

	@Override
	public void run() {
		// 식당에 사람을 투입
		for (int i = 1; i <= 10; i++) {
			// 식당 퇴장
			iop.outGuest();

			try {
				Thread.sleep((int) Math.random() * 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

	}

}

public class Test4 {

	public static void main(String[] args) {

		// wait()/notify(),notifyAll() 사용하기
		// => 동기화 블럭(임계영역) 안에서만 사용가능

		// wait() : 현재 실행중인 쓰레드를 대기 상태로 변경 -> waiting pool에 들어감
		// => notify(),notifyAll() 사용하면 Runnable상태
		// wait(시간) : "
		// => 일정시간이 지나면,notify(),notifyAll() 사용하면 Runnable상태

		// notify() : waiting pool에 있는 쓰레드중 하나를 Runnable 상태로 변경
		// notify() : waiting pool에 있는 쓰레드 모두를 Runnable 상태로 변경
		
		
		InOutProcess iop = new InOutProcess();
		
		inGuestThread ig = new inGuestThread(iop);
		OutGuestThread og = new OutGuestThread(iop);
		
		ig.start();
		og.start();
		

	}

}
