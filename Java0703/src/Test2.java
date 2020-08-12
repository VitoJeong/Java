import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

class FrameEx2 extends JFrame{
	JLabel la;
	
	public FrameEx2(){
		setTitle("마우스 휠 이벤트");
		
		setLayout(new FlowLayout());
		la = new JLabel("안녕하세요. 자바!");
		this.add(la);	
		
		// 키보드 + - 눌러졌을때 이벤트 처리
		addKeyListener(new KeyListener() {
			
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e);
				
				switch(e.getKeyChar()){
				
				case '+':
					JLabel jla = la;
					Font f = jla.getFont();
					int size = f.getSize();

					la.setFont(new Font("궁서체", Font.PLAIN, size+5));
					break;
				case '-':
					JLabel jla2 = la;
					// 라벨의 폰트정보를 저장
					Font f2 = jla2.getFont();
					int size2 = f2.getSize();

					la.setFont(new Font("궁서체", Font.PLAIN, size2-5));	
					break;
					
				
				}
				
				
				
			}
			
			@Override
			public void keyReleased(KeyEvent e) {
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
			}
		});
		
		
		
		// 마우스 휠 이벤트 처리
		la.addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				// 위로 (-1),아래로(1)
				System.out.println(e.getWheelRotation());
				
				if(e.getWheelRotation() < 0 ){
					//마우스 위로 이동(작아지게)
					// 이벤트가 발생한 대상의 객체 가져옴.
					JLabel jla = (JLabel)e.getSource();
					// 라벨의 폰트정보를 저장
					Font f = jla.getFont();
					int size = f.getSize();
					
					if(size <=5) return;				

					la.setFont(new Font("궁서체", Font.PLAIN, size-5));					
				}else{
					// 마우스 아래로 이동(커지게)
					//마우스 위로 이동(작아지게)
					// 이벤트가 발생한 대상의 객체 가져옴.
					JLabel jla = (JLabel)e.getSource();
					// 라벨의 폰트정보를 저장
					Font f = jla.getFont();
					int size = f.getSize();

					la.setFont(new Font("궁서체", Font.PLAIN, size+5));				
				}
				
				
			}
		});
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setBounds(500, 400, 400, 200);
		setVisible(true);		
	}
	
}


public class Test2 {

	public static void main(String[] args) {
        new FrameEx2();
	}

}
