import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

class FrameEx2 extends Frame {
	// 패널 : 여러개의 컴포넌트를 그룹별로 묶어서 사용하는 컨테이너/컴포넌트
	// -> 기본 레이아웃 : FlowLayout을 사용
	Panel p1,p2,p3;	
	
	public FrameEx2() {
		super("Frame v1.2");
		// 보더레이아웃 적용
		setLayout(new BorderLayout());
		
		// 패널 객체 생성
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();
		
		// 북 - 버튼1
		p1.add(new Button("btn01"));
		p1.add(new Button("btn01-1"));
		
		p1.setBackground(Color.CYAN);
		
		// 프레임에 추가
		add(p1,BorderLayout.NORTH);
		
		// 프레임의 공간에 한번에 여러개의 컴포넌트를 추가
		// => 패널 객체를 생성 -> 패널에 컴포넌트를 추가 -> 추가된 패널을 프레임에 추가
	
		// 센터 - 버튼1
		p2.add(new Button("btn02"));
		
		p2.setBackground(Color.PINK);
		
	    this.add(p2,BorderLayout.CENTER);
		
		
		
		// 남 - 버튼1
	    Button btn3 = new Button("btn03");
	    
		//p3.add(new Button("btn03"));
		p3.add(btn3);
		p3.add(new Button("btn03-1"));
		
		p3.setBackground(Color.MAGENTA);
		
		add(p3,BorderLayout.SOUTH);
		
		btn3.setVisible(false);
		//p3.setVisible(false);
		
		

		setSize(400, 200);
		this.setVisible(true);

		
		// 종료 버튼 처리
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				// 프레임창 닫기
				dispose();
				// 프로세스 종료 (작업관리자->작업끝내기)
				System.exit(0);
			}
		});

	}
}

public class Test3 {

	public static void main(String[] args) {

		FrameEx2 frameEx2 = new FrameEx2();

	}

}
