import java.util.Random;

// 개표처리 하는 객체 생성
class VoteThread implements Runnable{

	// 100%
	int targetNum=100;
	int sum=0;
	
	Random ran = new Random();
	
	@Override
	public void run() {
		
		StringBuffer sb = new StringBuffer();
		
		while(true){
			// 개표율 (랜덤값으로 생성)
			sum += ran.nextInt(10);
			// 개표율 상태를 저장하는 공간을 비우고 시작
			sb.delete(0, sb.toString().length());
			
			// 100% 일때
			if(sum >= targetNum){
				sum = 100;
				// 상태버퍼에 해당 상태를 표시하는 문자를 추가
				for(int i=0;i<sum;i++){
					sb.append('*');
				}
				
				System.out.println(Thread.currentThread().getName()
						+" 개표율 : "+sum+" % \t "+sb
						);				
				break;
			}else{	// 100% 아닐때
				// 상태버퍼에 해당 상태를 표시하는 문자를 추가
				for(int i=0;i<sum;i++){
					sb.append('*');
				}
				
				System.out.println(Thread.currentThread().getName()
						+" 개표율 : "+sum+" % \t "+sb
						);	
			}

			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//while
	}// run
}//class



public class Test3 {

	public static void main(String[] args) {
		// 투표결과 확인하는 개표 프로그램
		
		Thread location1 = new Thread(new VoteThread(),"서울");
		Thread location2 = new Thread(new VoteThread(),"부산");
		Thread location3 = new Thread(new VoteThread(),"대구");
		Thread location4 = new Thread(new VoteThread(),"강릉");
		
		//location1.run();
		location1.start();
		location2.start();
		location3.start();
		location4.start();
		
		
		
		
		

	}

}
