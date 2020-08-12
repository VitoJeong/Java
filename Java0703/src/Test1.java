import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

class FrameEx1 extends JFrame {

	JLabel la;

	public FrameEx1() {
		setTitle("스윙 연습하기");

		setLayout(new FlowLayout());
		la = new JLabel("Enter키 입력시 배경색 변경");
		add(la);

		// 프레임에 이벤트 처리-> 키 이벤트 처리
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				
				//System.out.println("이벤트 동작");
				// 랜덤한색상을 사용해서 배경색을 변경
				// r/g/b 0~255
				int r = (int)(Math.random()*256); //0~255
				int g = (int)(Math.random()*256); 
				int b = (int)(Math.random()*256); 
				System.out.println("r : "+r);
				System.out.println("g : "+g);
				System.out.println("b : "+b);
				
				if(e.getKeyChar() == '\n'){
					la.setText("r="+r+",g="+g+",b="+b);
					getContentPane().setBackground(new Color(r, g, b));
				}
				// Swing에서는 컨테이너(프레임) 위에 ContentPane객체를 사용해서
				// 해당 컴포넌트를 추가
				// * 익명클래스 내부에서 해당 프레임에 접근 this(사용x)
				//     => getContentPane() 사용해서 접근
				
				if(e.getKeyChar() == 'q'){
					JOptionPane.showMessageDialog(getContentPane(), "종료합니다");
					System.exit(0);
				}
			}

		});

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400, 300);
		setVisible(true);
	}

}

public class Test1 {

	public static void main(String[] args) {

		new FrameEx1();
	}

}
