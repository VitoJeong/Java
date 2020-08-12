import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.FileDialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

class FrameEx3 extends JFrame implements ActionListener {

	JButton btn;

	public FrameEx3() {

		btn = new JButton("대화상자 열기");
		add(btn);
		btn.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// 위치, 크기
		setBounds(300, 300, 250, 150);
		setVisible(true);

	}// 생성자

	// 주의 표시(노란색 에러) 무시
	@SuppressWarnings("deprecation")
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("이벤트 발생");

		// 대화상자(Dialog 객체 생성)
		// Dialog dlg = new Dialog(this,"Test1");
		MyDialog dlg = new MyDialog(this);
		dlg.setSize(200, 200);
		dlg.show();
		// dlg.setVisible(true);
	}// 이벤트처리

}// 클래스

class MyDialog extends Dialog {

	Panel p;

	Button btn1, btn2;
	
	Label la;

	// public MyDialog(){}

	// Dialog 객체도 기본적으로 BorderLayout을 사용
	public MyDialog(Frame parent) {
		super(parent);
        la = new Label("Hello~");
		//add(new Label("Hello~"), BorderLayout.NORTH);
		add(la, BorderLayout.NORTH);

		// 패널 생성
		p = new Panel();

		// 버튼 생성
		btn1 = new Button("YES");
		btn2 = new Button("NO");

		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("YES 클릭");
				//dispose();
				FileDialog fdlg 
				= new FileDialog(parent,"JavaFile",FileDialog.SAVE);
				
				fdlg.setSize(200,300);
				fdlg.show();
				
			}
		});
		btn2.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("NO 클릭");
				//dispose();
				FileDialog fdlg 
				= new FileDialog(parent,"JavaFile",FileDialog.LOAD);
				
				fdlg.setSize(200,300);
				fdlg.show();
				
				la.setText(fdlg.getDirectory()+"-"+fdlg.getFile());
				
				
			}
		});

		p.add(btn1);
		p.add(btn2);

		add(p, BorderLayout.SOUTH);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose(); // 대화상자만 종료
				//System.exit(0);
			}
		});
		

	}// 대화상자 생성자

} // 대화상자 클래스

public class Test3 {

	public static void main(String[] args) {
		// Dialog 클래스( 대화 상자 )
		new FrameEx3();
	}

}
