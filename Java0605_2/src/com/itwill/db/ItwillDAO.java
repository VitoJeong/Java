package com.itwill.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Array;

public class ItwillDAO {
	// DB연결에 필요한 정보
	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	private static final String DBID = "root";
	private static final String DBPW = "1234";
	// 데이터 처리 객체 (DB관련된 작업)
	public Connection con = null;
	public PreparedStatement pstmt = null;
	public ResultSet rs = null;
	public String sql = "";

	// 1. 드라이버로드
	// 2. 디비 연결
	// => 동작처리(메서드)
	private Connection getConn() throws Exception{
		Class.forName(DRIVER);
		con = DriverManager.getConnection(DBURL, DBID, DBPW);
		System.out.println(" 드라이버로드 & 디비연결 성공  : "+con);
		return con;
	}
	
	// 자원해제 메서드 - finally구문
	public void closeDB(){
		try {
			if(rs != null) rs.close();
			if(pstmt != null) pstmt.close();
			if(con != null) con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	
	// 회원 등록 
	public void memberJoin(ItwillDTO idto){
		System.out.println("memberJoin() 실행 !!");
		try {
			con = getConn();
			System.out.println("전달된 회원정보 : "+idto);
			
			// 3. SQL 작성
			sql ="insert into itwill_member "
					+ "values(null,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			
			// ? 
			pstmt.setString(1, idto.getName());
			pstmt.setString(2, idto.getGender());
			pstmt.setInt(3, idto.getAge());
			pstmt.setString(4, idto.getJumin());
			
			// 4. 실행
			pstmt.executeUpdate();
			
			System.out.println("회원 등록 성공!\n\n\n");		
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}
	
	// 회원 조회
	public ArrayList memberList(){
		
		ArrayList memberList = new ArrayList();
		
		try {
			// 1,2 드라이버로드 & 디비연결
			con = getConn();			
			// 3. SQL 구문 작성(select) 및 실행준비(pstmt)
			sql = "select * from itwill_member";
			
			pstmt = con.prepareStatement(sql);
			
			// 4. SQL 실행 -> 결과 rs 저장
			rs = pstmt.executeQuery();
			
			while(rs.next()){
				ItwillDTO dto = new ItwillDTO();
				
				dto.setIdx(rs.getInt("idx"));
				dto.setName(rs.getString("name"));
				dto.setGender(rs.getString("gender"));
				dto.setAge(rs.getInt("age"));
				dto.setJumin(rs.getString("jumin"));
				
				// arrayList 한칸에 한명(ItwillDTO)의 정보저장
				memberList.add(dto);				
			}
			
			System.out.println(" 회원 정보 조회 성공 ");
			
			// 5. 리턴 	
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		return memberList;
	}
	// 회원 조회
	
	// 회원 조회( 1명 )
	public void getMember(int num){
		
		try {
			// 디비,드라이버 로드
			con = getConn();
			
			// 3. SQL 구문 작성
			sql = "select * from itwill_member "
					+ "where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, num);
			
			// 4. 실행
			rs = pstmt.executeQuery();
			
			// 5. 결과 처리 
			
			if(rs.next()){
				System.out.println("[회원정보]");
				System.out.println(rs.getInt("idx"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getString("gender"));
				System.out.println(rs.getInt("age"));
				System.out.println(rs.getString("jumin"));
				System.out.println("\n\n\n\n\n");
			}else{
				System.out.println("[회원정보]");
				System.out.println(" 등록되어 있지 않은 회원 입니다. ");
				System.out.println("\n\n\n\n\n");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
		
	}
	
	// 회원 수정
	public void updateMember(ItwillDTO dto){
		
		try {
			// 디비연결,드라이버로드
			con = getConn();
			
			// 3. SQL 작성 및 객체 생성
			sql = "update itwill_member set name=?,gender=?,age=?,jumin=? "
					+ "where idx=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, dto.getName());
			pstmt.setString(2, dto.getGender());
			pstmt.setInt(3, dto.getAge());
			pstmt.setString(4, dto.getJumin());
			pstmt.setInt(5, dto.getIdx());
			
			// 4. SQL 구문 실행			
			pstmt.executeUpdate();		

			System.out.println(" 정보 수정 완료 ");
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}
	
	// 회원 삭제
	public void deleteMember(int delNum,String delName){
		
		try {
			// 디비,드라이버 로드
			con = getConn();
			
			// 3. SQL 작성
			sql ="delete from itwill_member "
					+ "where idx=? and name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, delNum);
			pstmt.setString(2, delName);
			
			// 4. SQL 실행
			pstmt.executeUpdate();
			
			System.out.println(" 회원정보 삭제 완료 ");			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			closeDB();
		}
		
	}
	
	
	
	
	


}
