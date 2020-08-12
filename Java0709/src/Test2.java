import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx2 extends Frame {
	
	CardLayout card = null;
	
	Panel[] p;
	Color[] color ={Color.RED,Color.BLUE,Color.CYAN,Color.PINK,Color.ORANGE};
	

	public FrameEx2() {
		// 제목
		// 레이아웃 설정
		card = new CardLayout();
		setLayout(card);
		
		// 패널 5개 생성
		p = new Panel[5];
		
		// 이벤트 처리 객체
		MouseHandle mh = new MouseHandle();
		
		for(int i=0;i<5;i++){
			p[i] = new Panel();
			p[i].setBackground(color[i]);
			// 위치,요소
			add(i+"",p[i]);
			p[i].addMouseListener(mh);
		}

		setSize(300, 600);
		setLocation(800, 250);
		setVisible(true);
		// 종료버튼
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}// 생성자
	
	
	// 내부 클래스(멤버처럼 사용)
	class MouseHandle extends MouseAdapter{
		@Override
		public void mouseClicked(MouseEvent e) {
			System.out.println("클릭");
			//card.next(FrameEx2.this);
			card.previous(FrameEx2.this);
		}
	}
	
	

}// 클래스 

public class Test2 {

	public static void main(String[] args) {
		// 카드 레이아웃 (CardLayout)
		new FrameEx2();
	}

}
