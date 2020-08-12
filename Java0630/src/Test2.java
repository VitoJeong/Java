import java.awt.Canvas;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx2 extends Frame implements ActionListener{
	
	Canvas cv;
	
	// 메뉴바 
	MenuBar mb;
	
	public FrameEx2() {
		
		cv = new Canvas();
		cv.setBackground(Color.ORANGE);
		this.add(cv);
		
		// 메뉴바 객체를 생성 -> 프레임추가
		mb = new MenuBar();
		this.setMenuBar(mb);
		
		// 메뉴 객체 추가
		Menu colorMenu = new Menu("COLOR");
		mb.add(colorMenu);
		
		Menu sizeMenu = new Menu("SIZE");
		mb.add(sizeMenu);
		
		// 메뉴 아이템
		MenuItem mItem;
		
		mItem = new MenuItem("RED");
		colorMenu.add(mItem);
		mItem.addActionListener(this);
		
		mItem = new MenuItem("GREEN");
		colorMenu.add(mItem);
		mItem.addActionListener(this);
		
		mItem = new MenuItem("BLUE");
		colorMenu.add(mItem);
		mItem.addActionListener(this);
		
		
		

		setSize(400, 400);
		setVisible(true);

		// 종료버튼
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});

	}

	// 메뉴 아이탬 클릭시 
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "RED"){
			cv.setBackground(Color.red);			
		}else if(e.getActionCommand() == "GREEN"){
			cv.setBackground(Color.GREEN);
		}else if(e.getActionCommand() == "BLUE"){
			cv.setBackground(Color.BLUE);
		}	
	}
	
	
}

public class Test2 {

	public static void main(String[] args) {
		new FrameEx2();

	}

}
