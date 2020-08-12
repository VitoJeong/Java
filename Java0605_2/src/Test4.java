import java.awt.dnd.DnDConstants;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.DriverPropertyInfo;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.function.DoubleBinaryOperator;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class Test4 {
	// DB연결에 필요한 정보
	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	public static final String DBID = "root";
	public static final String DBPW = "1234";

	public static Connection con = null;
	public static PreparedStatement pstmt = null;
	public static ResultSet rs = null;
	public static String sql = "";

	public static void main(String[] args) {

		// idx =3, 이면서 20살인 사람의 주민번호를 변경
		// '990909-1111111'
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			
			// 2. 디비연결
			con = DriverManager.getConnection(DBURL, DBID, DBPW);
			
			// 3. SQL 구문
			sql = "select age from itwill_member "
					+ "where idx=3";
			
			pstmt = con.prepareStatement(sql);
			
			// 4. 실행
			rs = pstmt.executeQuery();
			
			// 5. 결과 처리
			if(rs.next()){
				if(rs.getInt("age") == 20){
					
					// 정보수정
					// 3.
					sql = "update itwill_member set jumin='990909-1111111' "
							+ "where idx=3";
					
					pstmt = con.prepareStatement(sql);
					
					// 4.
					pstmt.executeUpdate();
					System.out.println(" 정보 수정 완료 ");					
					
				}else{
					System.out.println("잘못된 접근입니다.");
				}
				
			}else{
				System.out.println("idx=3번 회원 정보 없음");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
