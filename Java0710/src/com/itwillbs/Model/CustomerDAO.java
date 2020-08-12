package com.itwillbs.Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

public class CustomerDAO {
	// DAO => Data Access Object(데이터 처리 객체)
	// => DB 처리

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";
	
	// 회원목록 전부를 저장하는 백터
	Vector data = new Vector();
	

	// 디비 연결
	private void connectDB() {
		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/javadb";
		final String DBID = "root";
		final String DBPW = "1234";

		try {
			Class.forName(DRIVER);
			System.out.println("드라이버 로드 완료");

			con = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println("디비 연결 성공");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("디비 연결 실패");
			e.printStackTrace();
		}

	}

	// 디비 연결 해제
	public void closeDB() {

		try {
			if (rs != null) {		rs.close();			}
			if(pstmt != null) {   pstmt.close();   }
			if(con != null) {  con.close();  }
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	// 회원 가입 처리
	public int insertCustomer(CustomerDTO dto) {
		int result = 0;

		try {
			// 디비연결
			connectDB();
			// 3. SQL 작성 , pstmt 객체
			sql = "insert into customer " + "values(null,?,?,?,?)";
			pstmt = con.prepareStatement(sql);

			// 3-1 ?
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getId());
			pstmt.setString(3, dto.getPasswd());
			pstmt.setString(4, dto.getJumin());

			// 4 실행
			result = pstmt.executeUpdate();

			System.out.println(" 회원 가입 성공 ");

		} catch (SQLException e) {
			System.out.println(" SQL 구문 오류 ");
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}	
		

		return result;
	}
	// 회원 가입 처리
	
	// 회원 검색 처리 selectCustomer()
	public DefaultTableModel selectCustomer(){
		try {
			System.out.println("selectCustomer() 호출");
			// 디비연결
			connectDB();
			
			// sql 생성 pstmt 객체
			sql = "select * from customer";
			
			pstmt = con.prepareStatement(sql);

			// 실행 	
			rs = pstmt.executeQuery();
			
			//new DefaultTableModel(vector,vector) 객체를 사용

			// 컬럼명 저장 백터
		    Vector<String> columnNames = new Vector<String>();
		    columnNames.add("번     호");
		    columnNames.add("이     름");
		    columnNames.add("아 이 디");
		    columnNames.add("비밀번호");
		    columnNames.add("주민번호");
		    
		    // DB(rs) -> 백터 저장
		    while(rs.next()){
		    	
		    	Vector rowData = new Vector();
		    	
		    	rowData.add(rs.getInt("idx"));
		    	rowData.add(rs.getString("name"));
		    	rowData.add(rs.getString("id"));
		    	rowData.add(rs.getString("passwd"));
		    	rowData.add(rs.getString("jumin"));
		    	
		    	data.add(rowData);
		    }//rs
		    
		   //DefaultTableModel 리턴
		   // new DefaultTableModel(vector(데이터), vector(컬럼명)) 
		   DefaultTableModel dtm 
		   = new DefaultTableModel(data, columnNames){
	
				@Override
				public boolean isCellEditable(int row, int column) {
					// 셀 수정이 가능한가 판단-> 수정 불가
					return false;
				}
			   
		   };
		   
		    System.out.println(" 회원 검색 완료! ");
		   
		   //dtm.isCellEditable(row, column);
		   // 정상적인 데이터 처리가 끝날경우 dtm 객체 리턴
		   return dtm;			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			closeDB();
		}
		
		// 예외 발생후  비정상종료 경우 null리턴
		return null;
	}
	// 회원 검색 처리 selectCustomer()
	
	// deleteCustomer(Integer.parseInt(idx))
	public int deleteCustomer(int idx){
		int result = 0;
		
	    try {
	    	// DB 연결
	    	connectDB();
	    	// SQL 작성 & pstmt 객체 생성
	    	sql = "delete from customer where idx=?";
	    	
			pstmt = con.prepareStatement(sql);
			// ? 
			pstmt.setInt(1, idx);
			
			// 실행
			result = pstmt.executeUpdate();
			
			System.out.println(" 회원 삭제 완료 ");
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}	
		
		return result;		
	}
	// deleteCustomer(Integer.parseInt(idx))
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
