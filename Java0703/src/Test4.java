import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

class FrameEx4 extends JFrame implements ActionListener{
	
	String[] txt = {"+2","-1","%4"};
	JLabel la;
	JButton[] btn = new JButton[3];
	
	public FrameEx4(){
		
		// 문제 (1~60)
		
		int num = (int)(Math.random()*60+1);
		
		JPanel p = new JPanel();
		la = new JLabel("숫자가 표시됩니다.");
		
		la.setText(num+"");
		la.setFont(new Font("Gothic", Font.BOLD, 25));
		
				
		p.add(la);
		this.add(p);
		
		// 버튼 생성 -> 프레임추가
		JPanel p2 = new JPanel();
		for(int i=0;i<3;i++){
			btn[i] = new JButton(txt[i]);
			p2.add(btn[i]);
			this.add(p2,BorderLayout.SOUTH);
			
			// 버튼에 이번트 리스너 연결
			btn[i].addActionListener(this);
		}
		
		
		
		
		
		this.addKeyListener(new KeyAdapter() {

			@Override
			public void keyPressed(KeyEvent e) {
				//F1(증가),F2(감소)
				System.out.println("keypress");
				
				if(e.getKeyCode() == KeyEvent.VK_F1){
					setSize(getWidth()+10,getHeight()+10);
				}
				
				if(e.getKeyCode() == KeyEvent.VK_F2){
					setSize(getWidth()-10,getHeight()-10);
				}			
				
			}
			
		});
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300,200);
		setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// 버튼 클릭시 이벤트 처리
		System.out.println("클릭");

		// 문제의 값을 가져오기(라벨의 텍스트값을 가져오기)
		// System.out.println(la.getText());
		int n = Integer.parseInt(la.getText());
		// 버튼 구분(+2,-1,%4)
		switch(e.getActionCommand()){ // 버튼 위 라벨 값 가져오기
			case "+2":
				n+=2;
				btn[0].setEnabled(false);
				break;
			case "-1":
				n--;
				btn[1].setEnabled(false);
				break;
			case "%4":
				n%=4;
				btn[2].setEnabled(false);
				break;
		}
		System.out.println("n : "+n);
		la.setText(n+"");
		
		
		// 계산 결과가 0
		if( n == 0 ){
			JOptionPane.showMessageDialog(this, "성공!!!");
			
			for(int i=0;i<txt.length;i++){
			  btn[i].setEnabled(true);	
			}
			
			int num = (int)(Math.random()*60+1);
			la.setText(num+"");			
			
		}
		// 계산결과가 0아닐때 
		else{
			
			if(btn[0].isEnabled() == false &&
			   btn[1].isEnabled() == false &&
			   btn[2].isEnabled() == false){
			   JOptionPane.showMessageDialog(this, "실패!!!");
			}
		}
		
		
		
		
		
		
		
	}
	
}

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FrameEx4();
	}

}
