import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx4 extends Frame implements MouseListener,MouseMotionListener {
	
	Label info;
	
	public FrameEx4() {
		
		info = new Label("Location");
		info.setBackground(Color.yellow);
		add(info,BorderLayout.NORTH);
		
		
		setSize(500, 500);
		setBackground(Color.ORANGE);
		setVisible(true);
		
		// 프레임에  마우스 이벤트 리스너 추가
		//addMouseListener(l);
		this.addMouseListener(this);
		this.addMouseMotionListener(this);
		
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
	public void mouseClicked(MouseEvent e) {
		System.out.println("mouseClicked() 실행");
	}
	@Override
	public void mousePressed(MouseEvent e) {
		System.out.println("mousePressed() 실행");
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		System.out.println("mouseReleased() 실행");
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		System.out.println("mouseEntered() 실행");
	}
	@Override
	public void mouseExited(MouseEvent e) {
		System.out.println("mouseExited() 실행");
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		System.out.println("mouseDragged() 실행");
		info.setText("Dragged().................");
	}
	@Override
	public void mouseMoved(MouseEvent e) {
		System.out.println("mouseMoved() 실행");
		//e.getX();
		//e.getY();
		info.setText("(x,y)=("+e.getX()+","+e.getY()+")");
		System.out.println("(x,y)=("+e.getX()+","+e.getY()+")");
		
		
		if(100<=e.getX() && e.getX()<=150){
			System.exit(0);
		}
	}
	
	
	
	
	
}

public class Test4 {

	public static void main(String[] args) {
		new FrameEx4();

	}

}
