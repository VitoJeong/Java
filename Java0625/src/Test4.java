import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;

class FrameEx4 extends Frame implements ActionListener {
	// 관리자 계정
	private static final String ID = "admin";
	private static final String PW = "1234";

	Panel p1, p2, p3;
	TextField txtID, txtPW;
	Button logInBtn;

	public FrameEx4() {
		super("이벤트 처리 v1.1");

		// 패널 컨테이너 객체 생성
		p1 = new Panel();
		p2 = new Panel();
		p3 = new Panel();

		// 컴포넌트 객체 생성
		txtID = new TextField(20);
		txtPW = new TextField(20);
		txtPW.setEchoChar('@');

		logInBtn = new Button("LogIn");

		logInBtn.addActionListener(this);

		// 프레임에 추가(위치 지정)
		// 패널은 FlowLayout 사용(기본값)
		p1.add(new Label(" I D "));
		p1.add(txtID);
		p2.add(new Label(" P W "));
		p2.add(txtPW);

		p3.add(p1);
		p3.add(p2);

		this.add(p3, BorderLayout.CENTER);
		this.add(logInBtn, BorderLayout.EAST);

		setSize(300, 150);
		setVisible(true);

		// 종료 버튼
		addWindowListener(new WindowAdapter() {

			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}

		});

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 이벤트 처리
		System.out.println("로그인 이벤트 처리");
		// 아이디, 비밀번호를 입력후 -> 로그인 버튼 클릭시
		// 관리자 아이디,비밀번호와 같으면 "로그인성공 : admin"
		// 아이디,비밀번호가 잘못된경우 -> 에러메세지 출력
		
		if(txtID.getText().equals(ID)){
			System.out.println("아이디가 동일");
			if(txtPW.getText().equals(PW)){
				System.out.println("로그인 성공:"+txtID.getText());
			}else{
			    System.out.println("비밀번호 오류!");	
			}			
		}else{
			System.out.println("아이디가 다름(관리자 아님)");
			// 자바스크립트 ALERT창
			JOptionPane.showMessageDialog(this, "아이디 없음!!");
		}
		
		

	}

}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameEx4();
	}

}
