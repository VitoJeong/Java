class ATM{
	
	private int money;
	
	public ATM(){}
	public ATM(int m){
		money = m;
	}
	
	// 입금
	public synchronized void deposit(String name,int amount){
		
		money += amount;
		
		System.out.println(name+"님.... "+amount+"원 입금!");		
	}
	// 출금
	public synchronized void withdraw(String name,int amount){
		if( (money-amount) >= 0 ){ // 출금 가능
			money -= amount;
			System.out.println(name+"님.... "+amount+"원 출금!");
		}else{

			System.out.println(name+"님.... 출금 불가능합니다. (잔액 부족)");
		}
	}
	
	// 잔액 조회
	public void getMoney(){
		System.out.println("\t 계좌 잔액 : "+money+" 원");
	}
} // ATM

// 계좌를 사용하는 사용자
class AtmUser extends Thread{
	
	ATM BANK;
	boolean flag = false;   // 입금(true)/출금(false)
	
	
	public AtmUser() {}
	public AtmUser(String name,ATM atm) {
		super(name);
		BANK = atm;
	}
	
	
	@Override
	public void run() {
		// 입/출금 여러번 반복(5번)
		for(int i=0;i<5;i++){
			
			try {
				Thread.sleep(500); // 0.5초 단위로 쓰레드 실행
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if(flag){
				// 입금
				BANK.deposit(getName(), (int)(Math.random()*10+2)*100);
				BANK.getMoney();
			}else{
				// 출금
				BANK.withdraw(getName(), (int)(Math.random()*10+2)*100);
				BANK.getMoney();
			}
			
			// 입금/출금 동작 변경
			flag = !flag;
		} // for
	}// run
}// AtmUser


public class Test5 {

	public static void main(String[] args) {
		// 계좌 정보를 ATM 클래스
		//  - 잔액 정보
		//  - 계좌 개설시 입금 가능
		//  - 입금 동작(deposit) : 금액을 받아서 잔액에 추가
		//  - 출금 동작(withdraw) : 금액을 받아서 잔액에서 감소, 잔액이 있을때만 출금가능
		//  - 잔액 조회(getMoney) : 현재 남은 잔액
		
		
		// 사용자 AtmUser 클래스
		// 3명의 사용자가 1개의 계좌정보를 사용
		// 출금을 진행 -> 입금 : 총 5번 진행 
		// 객체 생성시 본인의 이름, 계좌정보를 초기화 가능
		
		
		ATM KB = new ATM(1000);
		
		AtmUser user1 = new AtmUser("삼성카드", KB);
		AtmUser user2 = new AtmUser("현대카드", KB);
		AtmUser user3 = new AtmUser("신한카드", KB);
		
	
		user1.start();
		user2.start();
		user3.start();	
		

	}

}
