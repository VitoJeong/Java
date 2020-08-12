import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test3 {
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
		// DB에 접속해서 "박학생"이라는 사람의 정보를 삭제
		
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			System.out.println(" 드라이버 로드 성공 ");
			// 2. 디비 연결
			con = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println(" 디비 로드 성공 ");
			
			/*// 3. SQL 작성 pstmt 객체 생성
			sql = "delete from itwill_member "
					+ "where name=?";
			
			pstmt = con.prepareStatement(sql);
			
			// ? 
			pstmt.setString(1, "박학생");
			
			// 4. sql 실행
			int result = pstmt.executeUpdate();
			
			System.out.println(" 삭제 완료  "+result);*/
			
			// 7-"홍길동" 삭제 처리
			// 3. SQL 작성, pstmt 객체 생성
			sql ="select name from itwill_member "
					+ "where idx = 7";
			pstmt = con.prepareStatement(sql);
			// 4. SQL 실행
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				// idx번호가 7번인 사람의 이름이 있다.
				// 이름을 비교해서 같을경우 삭제, 다를경우 에러 메세지 
				if(rs.getString("name").equals("홍길동")){
					// 삭제
					// 3. SQL 작성
					sql = "delete from itwill_member "
							+ "where name='홍길동' and idx = 7";
					pstmt = con.prepareStatement(sql);
					// 4. SQL 실행
					pstmt.executeUpdate();
					
					System.out.println("회원 정보 삭제 완료!");					
				}else{
					System.out.println("잘못된 회원 정보입니다.");
				}
			}else{
				// idx번호가 7번인 사람의 이름이 없다.
				System.out.println("삭제 할 회원이 없음.");
			}
			
			
			
			
			
			
			
			
			
		} catch (ClassNotFoundException e) {
			System.out.println(" 드라이버 로드 실패 ");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(" 디비 로드 실패 ");
			System.out.println(" SQL 구문 오류 !  ");
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		

	}

}
