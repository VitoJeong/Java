import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class ItwillFrame extends Frame implements Runnable{
	
	int x = 0;
	
	public ItwillFrame() {		
		
		setBackground(new Color(0,0,0));
		setSize(400,200);
		setVisible(true);		
		
		// 닫기 버튼 활성화
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); //프레임창을 종료
				System.exit(0); //프로세스 종료
			}
		});// addWindowListener
		
	}// ItwillFrame()

	@Override
	public void paint(Graphics g) {
		// 프레임에 그림 그리기
		
		Dimension d;// 가로,세로길이의 정보를 저장하는 객체 
		d = getSize();
		
		g.setFont(new Font("궁서체", Font.BOLD, 60));
		g.setColor(Color.YELLOW);
		
		g.drawString("집에 갈땐 비콘 체크", x ,d.height/2);
		
		if(x > d.width){
			x = -50;
		}
		
	}
	
	
	@Override
	public void run() {
		// 일정 시간마다 그림을 그리기 
		while(true){			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}	
			
			// 그림그리기
			repaint(); // => paint 메서드를 호출하는 메서드	
			System.out.println("다시 그림 그리기!");
			
			x+=5;			
		}// while()		
	}//run()
	
	
}// class


public class Test5 {

	public static void main(String[] args) {
		// 미니 전광판 만들기 
		
		Thread t = new Thread(new ItwillFrame());
		t.start();
		

	}

}
