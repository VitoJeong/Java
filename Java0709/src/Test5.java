import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class FrameEx5 extends JFrame{
	
	public FrameEx5(){
		setTitle("MVC 패턴 연습 JTable만들기");
		
		MyModel mm = new MyModel();
		
		// View 역활(데이터를 받아서 출력)
		// JTable 생성
		JTable table = new JTable(mm);
		
		// JScrollPane 사용 프레임추가
		JScrollPane jp = new JScrollPane(table);
		add(jp);
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,200);
		setVisible(true);
	}
	
	
}


public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        new FrameEx5();
	}

}
