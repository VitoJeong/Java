import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Random;

import javax.swing.JFrame;

class FrameEx5 extends JFrame implements Runnable{
	
	Thread th;
	
	
	public FrameEx5(){
		setTitle("프레임 흔들기");
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//setSize(200,200);
		//setLocation(300, 300);
		setBounds(400, 400, 200, 200);
		// x,y, 가로,세로
		setVisible(true);
		
		// 프레임창 종료(프레임 클릭시)
		this.addMouseListener(new MouseAdapter() {
			@Override
			public void mousePressed(MouseEvent e) {
				
				if(!th.isAlive()){ // 쓰레드가 작동하지 않으면
					return;
				}
				// 쓰레드 작동중
				// 작동중인 쓰레드에게 인터럽트를 전달해서
				// 쓰레드를 멈추게함.
				
				// 제어 가능한 인터럽트 : 사용자(개발자) 원하는 시점에 동작을 적용
				// 제어 불가능한 인터럽트 : 정전, 물리적 전원이 제거되는 동작
				
				th.interrupt();				
				
			}	
		});
		
		
	    th = new Thread(this);
	    th.start();		
		
	}// 생성자
	
	@Override
	public void run() {
		// 프레임 진동 : 일정시간마다 프레임의 좌표를 이동
		
		Random r = new Random();
		while(true){
			
			try {
				Thread.sleep(10);
			} catch (InterruptedException e) {
				e.printStackTrace();
				return;//쓰레드 종료
			}
			
			int x = getX() + r.nextInt()%5; // -4~4 랜덤값 생성
			int y = getY() + r.nextInt()%5; 
			
			setLocation(x, y);
		}
		
	} // run
	
}// 클래스


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FrameEx5();
	}

}
