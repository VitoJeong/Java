import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx3 extends Frame implements KeyListener {

	TextField tf;
	TextArea ta;

	public FrameEx3() {

		tf = new TextField();
		this.add(tf, BorderLayout.SOUTH);

		tf.addKeyListener(this);
		tf.addKeyListener(new KeyAdapter() {

			@Override
			public void keyReleased(KeyEvent e) {
				// System.out.println(KeyEvent.VK_CONTROL);
				System.out.println(e.getKeyCode());

				// ta 배경색 변경
				// 위-RED 아래 -WHITE 왼-GREEN 오-BLUE

				if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
					System.out.println("[ctrl] 입력! ");
				} else if (e.getKeyCode() == KeyEvent.VK_UP) {
					ta.setBackground(Color.RED);
				} else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
					ta.setBackground(Color.WHITE);
				} else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
					ta.setBackground(Color.GREEN);
				} else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
					ta.setBackground(Color.BLUE);
				} else if(e.getKeyCode() == KeyEvent.VK_F4){
					System.exit(0);
				}
				
				
				
				

			}

		});

		ta = new TextArea();
		this.add(ta, BorderLayout.CENTER);

		setTitle("입력 처리 이벤트");
		setSize(300, 500);
		setVisible(true);

		// 종료버튼
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("keyTyped()....");
		// ta.append("["+e.getKeyChar()+"] keyTyped().... \n ");
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		// System.out.println("keyPressed()....");
		// ta.append("["+e.getKeyChar()+"] keyPressed().... \n ");
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// 가능하면 키보드 입력 처리 이벤트처리에서 사용
		// System.out.println("keyReleased()....");
		ta.append("[" + e.getKeyChar() + "] keyReleased().... \n ");
	}

}

public class Test3 {

	public static void main(String[] args) {
		// 키보드, 마우스 => 표준입력
		new FrameEx3();
	}

}
