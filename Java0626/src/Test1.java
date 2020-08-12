import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class TestFrameEx1 extends Frame implements ActionListener{
	
	TextField txtInput;
	TextArea txtContent;
	Button addBtn;
		
	public TestFrameEx1(){
		
		setTitle("이벤트 처리 v1.2");

		txtInput = new TextField();
		txtContent = new TextArea();
		addBtn = new Button("A D D");
		
		// 프레임에 추가 
		this.add(txtInput,BorderLayout.NORTH);
		this.add(txtContent,BorderLayout.CENTER);
		this.add(addBtn,BorderLayout.SOUTH);
		
		// add 버튼 클릭시 
		// 텍스트 필드에 있는 글자를 가져와서 텍스트 에어리어에 추가 
		// 텍스트 필드에는 해당 글자가 사라져야함.
		addBtn.addActionListener(this);	
		
		
		
		setSize(300,500);
		setVisible(true);
		
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
		// 버튼 클릭시(이벤트 발생시)
		// 입력창의 글자를 가져와서 출력창에 출력
		//System.out.println("클릭");
		
		if(txtInput.getText() != ""){
			//System.out.println(txtInput.getText());
			//txtContent.append(txtInput.getText()+"\n");
			txtContent.insert(txtInput.getText()+"\n", 0);
			txtInput.setText("");
		}
		
		
		
	
		
	}
	
	
}



public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new TestFrameEx1();
	}

}
