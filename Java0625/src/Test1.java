import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

// 버튼리스너 (클릭시 이벤트 처리)
class ButtonListener implements ActionListener{
	// ActionListener : 버튼의 이벤트 처리가 가능한 리스너
	
	//private int a ;
	Frame frm = null;
	
	public ButtonListener(){}
	public ButtonListener(Frame f){
		frm = f;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 발생시 처리할 동작
		//System.out.println("버튼 클릭!!!! ");
		//System.out.println(e.getActionCommand());
		// getActionCommand() -> 이벤트 발생한 객체(버튼)의 텍스트 정보를 가져옴
		System.out.println(" ActionListener_actionPerformed() 실행 ! ");
		// 버튼의 종류에 따라서 출력하는 메세지를 변경
		// RED-"빨간색 버튼 클릭!!!", BLUE-"파랑색 버튼 클릭!!!"
		
		if(e.getActionCommand().equals("RED")){
			System.out.println("빨간색 버튼 클릭!!!");
			frm.setBackground(Color.RED);
			
		}else if(e.getActionCommand().equals("BLUE")){
			System.out.println("파랑색 버튼 클릭!!!");
			frm.setBackground(Color.BLUE);
		}else{
			System.out.println("...");
		}
		
		
	}
	
}


class FrameEx1 extends Frame{
	
	Button redBtn,blueBtn;
	
	public FrameEx1(){
		
		super("이벤트 처리");
		
		// 레이아웃 변경
		setLayout(new FlowLayout());
		//setLayout(new GridLayout(1, 2));
		
		this.setBackground(Color.DARK_GRAY);
		
		// 버튼 객체 2개 생성
		redBtn = new Button("RED");
		blueBtn = new Button("BLUE");
		
		//redBtn.setBackground(Color.RED);
		
		// 버튼 클릭 리스너 객체 생성
		// ButtonListener handler = new ButtonListener();
		// 버튼 클릭 리스너에 프레임의 정보를 전달
		//ButtonListener handler = new ButtonListener();
		//handler.frm = this;//프레임정보
		
		ButtonListener handler = new ButtonListener(this);
		
		
		redBtn.addActionListener(handler);
		blueBtn.addActionListener(handler);
		
		
		// 프레임에 추가
		this.add(redBtn);
		add(blueBtn);
		
		
		setSize(400,300);
		setVisible(true);
		
		this.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	}
}


public class Test1 {

	public static void main(String[] args) {

	   new FrameEx1();
	   
	   // GUI환경에서는 화면을 구현하는 부분, 이벤트를 처리하는 부분이 완전 분리
	   // 이벤트(event) : 프로그램과 사용자 사이에서 발생하는 일
	   //  => 키보드,마우스를 사용해서 해당 프로그램에 특정 요구/동작을 발생
	   // 이벤트 리스너 (event listener) : 이벤트 발생을 기다리다가 이벤트가 발생해서
	   // 이벤트 소스 객체가 전달되면 적당한 처리를 하는 객체
	   // 이벤트 소스 (event source) : 이벤트가 발생한 컴포넌트(버튼,스크롤바..)
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	   
	
	}

}
