import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

class MouseEventListener implements MouseMotionListener{
	
	JFrame jfm = null;
	
	public MouseEventListener() {}
	public MouseEventListener(JFrame jfm) {
		this.jfm =jfm;	
		
		System.out.println(jfm);
		System.out.println(this.jfm);
	}
	
//	public MouseEventListener(Container contentPane) {
//		
//		jfm = (JFrame) contentPane;
//		
//	}
	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println(e.getSource());
		
		System.out.println("drag");
		jfm.setBackground(Color.YELLOW);
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		//System.out.println(e.getSource());
		Container c = (Container) e.getSource();
		//jfm.setBackground(Color.CYAN);
		c.setBackground(Color.CYAN);
		System.out.println("move");
	}
}



public class Test3 extends JFrame implements MouseListener{
	
	public Test3(){
		setTitle("프레임창 만들기");
		
		// 마우스 이벤트 리스너
		addMouseListener(this);
		
		//MouseEventListener mel = new MouseEventListener(getContentPane());
		MouseEventListener mel = new MouseEventListener(this);
		
		// 마우스 이벤트 리스너
		//addMouseMotionListener(new MouseEventListener(this));
		addMouseMotionListener(mel);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);		
		setSize(400,400);
		setVisible(true);
	}
	

	@Override
	public void mouseClicked(MouseEvent e) {
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseReleased(MouseEvent e) {
	}


	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("Enter");
		getContentPane().setBackground(Color.ORANGE);
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("Exit");
		getContentPane().setBackground(Color.WHITE);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new Test3();
	}

}
