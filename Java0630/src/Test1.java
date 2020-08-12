import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class FrameEx1 extends Frame implements ItemListener{
	
	//라디오버튼
	Checkbox ck1,ck2,ck3;
	// 그룹
	CheckboxGroup cg;
	
	public FrameEx1(){
		
		//레이아웃 변경 -> Border -> Flow
		setLayout(new FlowLayout());
		
		cg = new CheckboxGroup();
		
		ck1 = new Checkbox("RED",cg,false);
		ck2 = new Checkbox("GREEN",cg,false);
		ck3 = new Checkbox("BLUE",cg,false);
		
		// 프레임에 추가 
		this.add(ck1);
		this.add(ck2);
		this.add(ck3);
		
		ck1.addItemListener(this);
		ck2.addItemListener(this);
		ck3.addItemListener(this);
		
		
		
		
		setSize(300,400);
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

	@Override
	public void itemStateChanged(ItemEvent e) {
		// 라디오버튼의 상태가 변경시 호출되는 메서드
		
		//e.getItem(); -> 라디오버튼에 적혀있는 글자
		//e.getSource(); -> 라디오버튼 객체
		/*if(e.getItem() == "RED"){
			System.out.println("RED");
			this.setBackground(Color.RED);
			ck1.setBackground(Color.RED);
			ck2.setBackground(Color.RED);
			ck3.setBackground(Color.RED);
			
		}else if(e.getSource() == ck2 ){
			System.out.println("GREEN");
			this.setBackground(Color.GREEN);
			ck1.setBackground(Color.GREEN);
			ck2.setBackground(Color.GREEN);
			ck3.setBackground(Color.GREEN);
			
			
		}else if(e.getSource() == ck3){
			System.out.println("BLUE");
			this.setBackground(Color.BLUE);
			ck1.setBackground(Color.BLUE);
			ck2.setBackground(Color.BLUE);
			ck3.setBackground(Color.BLUE);
			
			
		}else{
			System.out.println("해당사항 없음");
		}*/
		
		Color c = null;
		
		if(e.getSource() == ck1){
			c = Color.RED;
		}else if(e.getSource() == ck2){
			c = Color.GREEN;
		}else if(e.getSource() == ck3){
			c = Color.BLUE;
		}else{
			c = Color.WHITE;
		}
		
		this.setBackground(c);
		ck1.setBackground(c);
		ck2.setBackground(c);
		ck3.setBackground(c);
		
		
		
		
		
		
		
	}
	
	
	
}


public class Test1 {

	public static void main(String[] args) {
        new FrameEx1();
	}

}
