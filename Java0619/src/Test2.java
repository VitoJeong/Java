class GuGu implements Runnable{
	int dan;
	
	public GuGu() {	}
	public GuGu(int dan) {
		this.dan = dan;
	}	

	@Override
	public void run() {
		// 쓰레드를 하나씩 작동하기 위해서 sleep()
		long time = (long)(Math.random()*500);
		
		System.out.println(dan+"단 "+time+"만큼 sleep() ");
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		// 구구단 출력 
		System.out.println("<"+dan+"단>");			
		for(int i=1;i<=9;i++){
			System.out.println(dan+" * "+i+" = "+(dan*i));
		}
		
	}
	
}


public class Test2 {

	public static void main(String[] args) {
		
		// 구구단을 출력 (세로)
		// 2~9단 (랜덤한 순서로 출력) ex)2...9....4...7...6..8...3
		// => 구구단 객체를 생성해서 사용
		
		Thread t2 = new Thread(new GuGu(2));
		Thread t3 = new Thread(new GuGu(3));
		Thread t4 = new Thread(new GuGu(4));
		Thread t5 = new Thread(new GuGu(5));
		Thread t6 = new Thread(new GuGu(6));
		Thread t7 = new Thread(new GuGu(7));
		Thread t8 = new Thread(new GuGu(8));
		Thread t9 = new Thread(new GuGu(9));
		
		t2.start();
		t3.start();
		t4.start();
		t5.start();
		t6.start();
		t7.start();
		t8.start();
		t9.start();
		
		

	}

}
