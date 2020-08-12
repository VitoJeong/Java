import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TestFrameEx2 extends Frame implements ItemListener{
	
	TextArea ta;
	Checkbox ck1,ck2,ck3;
	
	Panel p;
	
	public TestFrameEx2(){
		
		setTitle("체크박스 사용하기");
		
		p = new Panel();
		
		ta = new TextArea();
		ck1 = new Checkbox("RED");
		ck2 = new Checkbox("GREEN");
		ck3 = new Checkbox("BLUE");
		
		ck1.addItemListener(this);		
		ck2.addItemListener(this);		
		ck3.addItemListener(this);		
		
		this.add(ta);
		p.add(ck1);
		p.add(ck2);
		p.add(ck3);
		this.add(p,BorderLayout.NORTH);	
		
		
		setSize(400,300);
		setVisible(true);
		
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dispose();
				System.exit(0);
			}
		});
		
	}// 생성자

	@Override
	public void itemStateChanged(ItemEvent e) {
		System.out.println("클릭");
		//System.out.println(e.toString());
		//System.out.println(e.getSource());
		// ta에 해당 버튼 "RED 선택 클릭"
		//      "     "RED 해제 클릭"
		/*if(e.getSource() == ck1){
			//System.out.println(e.getStateChange());
			if(e.getStateChange() == 1){
				ta.append("RED 선택 클릭\n");
			}else if(e.getStateChange() ==2){
				ta.append("RED 해제 클릭\n");
			}else{
				System.out.println("해당사항 없음");
			}
		}
		
		if(e.getSource() == ck2){
			//System.out.println(e.getStateChange());
			if(e.getStateChange() == 1){
				ta.append("GREEN 선택 클릭\n");
			}else if(e.getStateChange() == 2){
				ta.append("GREEN 해제 클릭\n");
			}else{
				System.out.println("해당사항 없음");
			}
		}
		
		if(e.getSource() == ck3){
			//System.out.println(e.getStateChange());
			if(e.getStateChange() == 1){
				ta.append("BLUE 선택 클릭\n");
			}else if(e.getStateChange() ==2){
				ta.append("BLUE 해제 클릭\n");
			}else{
				System.out.println("해당사항 없음");
			}
		}*/
		
		
	  String str = "해제";
	  
	  if(e.getStateChange() == ItemEvent.SELECTED) str ="선택";
		
	  ta.append(e.getItem() + str +"\n");

	  if(str.equals("해제")){
		  ta.setBackground(Color.WHITE);
	  }else{
		  if(e.getSource() == ck1){
			  ta.setBackground(Color.RED);
		  }else if(e.getSource() == ck2){
			  ta.setBackground(Color.green);
		  }else if(e.getSource() == ck3){
			  ta.setBackground(Color.BLUE);
		  }else{
			  System.out.println("해당사항 없음");
		  }
	  }
		
		
		
		
	}
	
	
}// 클래스



public class Test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestFrameEx2();
	}

}
