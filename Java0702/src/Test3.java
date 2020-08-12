import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

class FrameEx3 extends JFrame implements ActionListener{
	
	JButton btn1,btn2,btn3,btn4;
	
	public FrameEx3(){		
		setTitle("스윙 연습하기");
		//setLayout(new FlowLayout());
		setLayout(new GridLayout(1, 4));
		
		btn1 = new JButton("input");
		btn2 = new JButton("Message");
		btn3 = new JButton("Confirm");
		btn4 = new JButton("Option");
		
		add(btn1);
		add(btn2);
		add(btn3);
		add(btn4);
		
		// 버튼 리스너 연결
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		
		
		//  JOptionPane 클래스
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);		
	}// 생성자	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == btn1){
			
			String msg = JOptionPane.showInputDialog(this,"질문입니다.");
			//String msg = JOptionPane.showInputDialog("질문입니다.");
			// -> 부모 컴포넌트를 지정한경우 (this포함) 부모컴포넌트의 중앙에 표시됨
			// -> this 지정 안한경우, 화면의 중앙에 표시
			
			System.out.println("답  :"+msg);
			
		}else if(e.getSource() == btn2){
			
			JOptionPane.showMessageDialog(this, "메세지 입니다");			
			
		}else if(e.getSource() == btn3){
			
			int value = JOptionPane.showConfirmDialog(this, "프로그램을 종료하시겠습니까?");			
			
			System.out.println("값 : "+value);	
			
			if(value == JOptionPane.YES_OPTION){
				System.exit(0);
			}
			
		}else if(e.getSource() == btn4){
			
			String[] str = {"추가","검색","종료"};
			
		int value =JOptionPane.showOptionDialog(
					this, // 부모컴포넌트
					"원하는 작업을 선택하시오", //질문
					"옵션대화상자",// 대화상자 제목
					JOptionPane.YES_NO_CANCEL_OPTION, //버튼
					JOptionPane.ERROR_MESSAGE,// 질문옆 아이콘
					null,
					str, //버튼위에 작성될 라벨
					str[0]); // 초기값
			
			System.out.println("value : "+value);
			
			
		}else{
			System.out.println("해당사항 없음");
		}
		
		
		
		
	}
	
}// 클래스


public class Test3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         new FrameEx3();
	}

}
