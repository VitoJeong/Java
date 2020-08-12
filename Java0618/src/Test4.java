import javax.swing.plaf.synth.SynthScrollPaneUI;

class DressRoom implements Runnable{

	@Override
	public void run() {
		// 한사람당 탈의실을 60초 동안 사용가능
		// 10초 단위로 앞사람의 남은시간을 알려주는 동작
		// 2~3명 사용자 동작	
		
	    synchronized (this) {
	    	
	    	for(int i=6;i>=0;i--){
	    		
	    		try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
	    		
	    		System.out.println(Thread.currentThread().getName()
	    				+"님 옷 갈아입는 중..."+(i*10)+"초 전...");
	    	}

	    	System.out.println(Thread.currentThread().getName()
	    			+"님 옷 갈아입기 완료! ");
		} // 동기화 블럭
		
	}// run
	
}//class


public class Test4 {

	public static void main(String[] args) {

		DressRoom room = new DressRoom();
		
		Thread user1 = new Thread(room,"사용자 1");
		Thread user2 = new Thread(room,"사용자 2");
		Thread user3 = new Thread(room,"사용자 3");
		
		user1.start();
		user2.start();
		user3.start();
		
		
		
		

	}

}
