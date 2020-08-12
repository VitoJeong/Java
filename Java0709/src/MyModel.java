import javax.swing.table.AbstractTableModel;

// Model 역활
// 1. AbstractTableModel 타입의 서브클래스로 생성
public class MyModel extends AbstractTableModel {
	
	// 2. 테이블에 저장될 데이터 2차원 배열으로 생성
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
			{"홍길동","010-1234-3453","user01@naver.com"}	
	};
	
	// 2-1. 열의 이름저장하는 배열
	String[] columnName = {"이름","전화번호","e-mail"};
	
	
	// 3. 모델 객체에 필요한 동작을 구현
	@Override
	public int getRowCount() {
		// 표현할 행의 수
		return data.length;
	}

	@Override
	public int getColumnCount() {
		// 표현할 열의 수
		return data[0].length;
	}

	@Override
	public Object getValueAt(int rowIndex, int columnIndex) {
		// 특정 위치에 있는 객체를 리턴
		return data[rowIndex][columnIndex];
	}

	
	// 열의 이름을 사용
	@Override
	public String getColumnName(int column) {
		return columnName[column];
	}

	
	// 셀 수정 처리 
	@Override
	public boolean isCellEditable(int rowIndex, int columnIndex) {
		return columnIndex != 0? true:false;
	}

	// 테이블의 내용 수정하기 
	@Override
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
		//super.setValueAt(aValue, rowIndex, columnIndex);
		data[rowIndex][columnIndex] = aValue;
	}

	

	
	
	

}
