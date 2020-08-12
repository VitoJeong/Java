import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

class FrameEx4 extends JFrame{
	
	public FrameEx4(){
		
		// 데이터 
		// 1. 테이블에 저장될 데이터를 이차원배열 저장
		Object[][] data={
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"},	
				{"홍길동","010-1234-3453","user01@naver.com"}	
		};
		
		// 2. 열의 이름을 저장할 배열 
		String[] columnName = {"이름","전화번호","e-mail"};
		
		////////////////////////////////////////////////////////////
		// 화면
		// 3. JTable 생성
		JTable table = new JTable(data,columnName);
		
		// 4. 화면에 추가 (테이블에 JScrollPane추가-> 프레임 추가)
		//add(table); //스크롤바 X,열 이름 X	
		add(new JScrollPane(table));	
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setVisible(true);		
	}// 생성자
	
}// 클래스




public class Test4 {

	public static void main(String[] args) {
		// Model2 개발 방식 (MVC 패턴)
		
		// Model1 -> Model2 변경
		// => 개발영역의 분리
		// Model : 비지니스로직(처리) - JAVA/DB
		// View : 처리화면 - html/jsp
		// Controller : 프로그램 제어 - Servlet
		
		// * JAVA GUI  -> JTable (MVC 패턴 사용)
  
		
		new FrameEx4();
	}

}
