import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JProgressBar;

class FrameEx2 extends JFrame{
	
	JProgressBar pro;
	
	JButton startBtn;
	
	public FrameEx2(){
		setTitle("스윙 연습하기");
		
		// 프로그래스바 : 작업 진행도를 표현하기위한 컴포넌트
		
		setLayout(new FlowLayout());
		
		pro = new JProgressBar(0,100);
		pro.setStringPainted(true);
		pro.setValue(0);
		
		
		
		startBtn = new JButton("설치시작");
		
		startBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
			   //proStart();	
			}
		});
		

		add(pro);
		add(startBtn);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		setSize(400,200);
		setVisible(true);
		
		proStart();
		
	}// 생성자
	
	public void proStart(){
		// 프로그래스바 0 -> 100 1씩 증가
		int i;
		for(i=0;i<=100;i++){
			try {
				pro.setValue(i);
				Thread.sleep(500);
			} catch (InterruptedException e1) {
				e1.printStackTrace();
			}
		}	
	}
	
	
	
	
}


public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FrameEx2();
	}

}
