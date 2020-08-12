class ThreadPri extends Thread{
	
	public ThreadPri() {}
	public ThreadPri(String name,int p) {
		super(name);
		setPriority(p); // 쓰레드 우선순위 부여
	}
	@Override
	public void run() {
		
		for(int i=0;i<5;i++){
			System.out.println(getName()+" 우선순위 : "+getPriority());			
		}
	}
	
}



public class Test2 {

	public static void main(String[] args) {
		
		//Thread t1 = new Thread();
		ThreadPri p1 = new ThreadPri("작업",Thread.MIN_PRIORITY);
		ThreadPri p2 = new ThreadPri("중요한 작업",Thread.MAX_PRIORITY);
		ThreadPri p3 = new ThreadPri("보통 작업",Thread.NORM_PRIORITY);
		
		p1.start();
		try {
			p1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		p2.start();
		p3.start();
		
		
		

	}

}
