import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 버튼리스너 (클릭시 이벤트 처리)
class ButtonListener1 implements ActionListener {
	// ActionListener : 버튼의 이벤트 처리가 가능한 리스너

	// private int a ;
	Frame frm = null;

	public ButtonListener1() {
	}

	public ButtonListener1(Frame f) {
		frm = f;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 발생시 처리할 동작
		// System.out.println("버튼 클릭!!!! ");
		// System.out.println(e.getActionCommand());
		// getActionCommand() -> 이벤트 발생한 객체(버튼)의 텍스트 정보를 가져옴
		System.out.println(" ActionListener_actionPerformed() 실행 ! ");
		// 버튼의 종류에 따라서 출력하는 메세지를 변경
		// RED-"빨간색 버튼 클릭!!!", BLUE-"파랑색 버튼 클릭!!!"

		if (e.getActionCommand().equals("RED")) {
			System.out.println("빨간색 버튼 클릭!!!");
			frm.setBackground(Color.RED);

		} else if (e.getActionCommand().equals("BLUE")) {
			System.out.println("파랑색 버튼 클릭!!!");
			frm.setBackground(Color.BLUE);
		} else {
			System.out.println("...");
		}

	}

}

class FrameEx2 extends Frame implements ActionListener {

	Button redBtn, blueBtn,greenBtn;

	public FrameEx2() {

		super("이벤트 처리");

		// 레이아웃 변경
		setLayout(new FlowLayout());
		// setLayout(new GridLayout(1, 2));

		this.setBackground(Color.DARK_GRAY);

		// 버튼 객체 2개 생성
		redBtn = new Button("RED");
		blueBtn = new Button("BLUE");
		
		greenBtn = new Button("GREEN");

		// redBtn.setBackground(Color.RED);

		// 버튼 클릭 리스너 객체 생성
		// ButtonListener handler = new ButtonListener();
		// 버튼 클릭 리스너에 프레임의 정보를 전달
		// ButtonListener handler = new ButtonListener();
		// handler.frm = this;//프레임정보
		// ButtonListener1 handler = new ButtonListener1(this);
		// redBtn.addActionListener(handler);
		// blueBtn.addActionListener(handler);
		
		redBtn.addActionListener(this);
		blueBtn.addActionListener(this);
		
		// green 버튼 클릭시 이벤트 처리(익명클래스)
		greenBtn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("익명클래스 이벤트 처리");
				setBackground(Color.GREEN);				
			}
		});
		
		
		

		// 프레임에 추가
		this.add(redBtn);
		add(blueBtn);
		add(greenBtn);

		setSize(400, 300);
		setVisible(true);

		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}// 생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("인터페이스를 직접 구현 처리");
		
		if(e.getSource() == redBtn){
			System.out.println("RED 버튼 클릭");
			this.setBackground(Color.RED);
		}else if(e.getSource() == blueBtn){
			System.out.println("BLUE 버튼 클릭");
			this.setBackground(Color.BLUE);
		}
	}

}// class

public class Test2 {

	public static void main(String[] args) {

		new FrameEx2();

	}

}
