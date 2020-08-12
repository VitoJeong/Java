import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;

import javax.swing.JFrame;

class FrameEx1 extends Frame{
	
	
	@Override
	public void paint(Graphics g) {
		
		g.drawString("Hello~", 100, 50);
		
		// 글자 폰트 변경
		Font f = new Font("궁서체", Font.BOLD, 35);
		
		// 폰트 적용
		g.setFont(f);
		
		g.drawString("Test~", 200, 100);
		
		// 컬러 변경
		Color c = new Color(255, 0, 0);
		g.setColor(c);
		
		g.setColor(Color.MAGENTA);
		
		
		g.drawString("Color@@", 200, 150);
		
		g.drawRect(50, 50, 50, 50);
		
		g.fillRect(100, 100, 50, 50);
		
		g.drawOval(150, 150, 50, 50);
		g.fillOval(150, 150, 50, 50);
		
		
		
	}

	public FrameEx1(){
		
		//setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setLocation(800, 150);
		setVisible(true);
		
	}
	
}

public class Test1 {

	public static void main(String[] args) {
		// 그래픽 객체 
		new FrameEx1();
		
		
		

	}

}
