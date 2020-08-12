import java.util.Scanner;

class Runner extends Thread{
	
	String name;
	int meter;
	
	public Runner() {}
	public Runner(String name){
		this.name = name;		
	}
	
	@Override
	public void run() {
		
		for(int i=0;i<10;i++){
			
			meter+=10;
			
			if(meter == 100){
				System.out.println("도착 ! "+name);
			}else{
				System.out.println(name+" 주자 "+meter+"M 도착.");
			}
			
			try {
				Thread.sleep((int)Math.random()*1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}//for	
	} //run
}


public class Test1 {

	public static void main(String[] args) {
		// 쓰레드를 사용한 달리기 경주
		
		// 몇명이서 달리기를 할건지  입력 
		// 각각의 주자가 10m 마다 본인의 위치를 출력
		// 해당 주조가 100m에 도착하면 "도착" 달리기 완료
		
		// 주자(Runner)
		// 이름,위치(meter)
		// 0~100m 까지 이동 => run()
		// sleep() 메서드를 사용해서 10미터 마다 사용(다른값)
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(" 주자의 수를 입력하시오 : ");
		int runner = scan.nextInt();
		
		for(int i=1;i<=runner;i++){
			Thread run = new Runner(i+" 번 사용자");
			run.start();			
		}
		
		
		
		
		
		
		
		
		

	}

}
