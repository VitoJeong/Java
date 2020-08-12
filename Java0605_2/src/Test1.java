import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

class MemberBean{ // DTO,VO
	private String name;
	private String gender;
	private int age;
	private String jumin;
	
	// 생성자
	public MemberBean(){}
	public MemberBean(String name,String gender,int age,String jumin){
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.jumin = jumin;		
	}

	// get/set
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}

	// toString
	@Override
	public String toString() {
		return "MemberBean [name=" + name + ", gender=" + gender + ", age=" + age + ", jumin=" + jumin + "]";
	}
	
	
	
	
	
}



public class Test1 {

	public static final String DRIVER = "com.mysql.jdbc.Driver";
	public static final String DBURL = "jdbc:mysql://localhost:3306/javadb";
	public static final String DBID = "root";
	public static final String DBPW = "1234";

	public static void MemberJoin(MemberBean mb) {
		// C:\Program Files\Java\jdk1.8.0_121\jre\lib\ext
		// => 해당 파일 복사

		// 0. 라이브러리 설치(JDBC 설치) *.jar
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			System.out.println("드라이버 로드 성공!");

			// 2. DB 접속
			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println(" DB 접속 성공! ");
			System.out.println("con : " + con);

			// // 3. SQL문 작성 & Statement객체 생성
			//
			// String sql ="insert into itwill_member "
			// + "values(null,'"+name+"','"+gender+"',"+age+",'"+jumin+"')";
			//
			// // Statement : 쿼리문을 실행 객체
			// Statement stmt = con.createStatement();
			//
			// // 4. SQL문 실행
			// stmt.executeUpdate(sql);

			// 3. SQL문 작성 & Statement객체 생성
			String sql = "insert into itwill_member " + "values(null,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(sql);

			// ?채우기
			pstmt.setString(1, mb.getName());
			pstmt.setString(2, mb.getGender());
			pstmt.setInt(3, mb.getAge());
			pstmt.setString(4, mb.getJumin());

			// 4. SQL문 실행
			int result = pstmt.executeUpdate();

			System.out.println("pstmt 사용 회원 등록 성공 : " + result);

			// executeUpdate - insert,update,delete
			// -> DB테이블에 영향을 주는경우(내용변경)
			// => 변경된 ROW수 리턴
			// executeQuery - select
			// -> DB테이블에 영향을 안주는 경우(내용변경x)
			// => 처리된 결과 리턴

			System.out.println(" 회원 등록 성공! ");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(" DB 접속 실패 ! ");
			System.out.println(" SQL 구문 오류!! ");
			e.printStackTrace();
		}
	}
	
	
	public static void MemberJoin(String name,String gender,int age,String jumin) {
		// C:\Program Files\Java\jdk1.8.0_121\jre\lib\ext
		// => 해당 파일 복사

		// 0. 라이브러리 설치(JDBC 설치) *.jar
		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);
			System.out.println("드라이버 로드 성공!");

			// 2. DB 접속
			Connection con = DriverManager.getConnection(DBURL, DBID, DBPW);
			System.out.println(" DB 접속 성공! ");
			System.out.println("con : " + con);

			// // 3. SQL문 작성 & Statement객체 생성
			//
			// String sql ="insert into itwill_member "
			// + "values(null,'"+name+"','"+gender+"',"+age+",'"+jumin+"')";
			//
			// // Statement : 쿼리문을 실행 객체
			// Statement stmt = con.createStatement();
			//
			// // 4. SQL문 실행
			// stmt.executeUpdate(sql);

			// 3. SQL문 작성 & Statement객체 생성
			String sql = "insert into itwill_member " + "values(null,?,?,?,?)";

			PreparedStatement pstmt = con.prepareStatement(sql);

			// ?채우기
			pstmt.setString(1, name);
			pstmt.setString(2, gender);
			pstmt.setInt(3, age);
			pstmt.setString(4, jumin);

			// 4. SQL문 실행
			int result = pstmt.executeUpdate();

			System.out.println("pstmt 사용 회원 등록 성공 : " + result);

			// executeUpdate - insert,update,delete
			// -> DB테이블에 영향을 주는경우(내용변경)
			// => 변경된 ROW수 리턴
			// executeQuery - select
			// -> DB테이블에 영향을 안주는 경우(내용변경x)
			// => 처리된 결과 리턴

			System.out.println(" 회원 등록 성공! ");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println(" DB 접속 실패 ! ");
			System.out.println(" SQL 구문 오류!! ");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {

		// 회원가입할 데이터(입력받음)
		String name = "박학생";
		String gender = "M";
		int age = 22;
		String jumin = "900101-1212121";

		// 자바-> 데이터 저장 -> 변수
		// -> 객체 -> 파일(DB)
		// JDBC (Java DataBase Connectivity) : 자바와 데이터베이스간의 연결정보를
		// 관리/처리하는 클래스들

		// 회원 가입 처리하는 메서드 호출(MemberJoin())
		//MemberJoin(name, gender, age, jumin);
		
		MemberBean mb = new MemberBean("kkk", gender, age, jumin);
		System.out.println(mb);
		
		
		MemberJoin(mb);
		
		

	}

}
