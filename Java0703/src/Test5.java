import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * 
 * @author 홍길동
 * @주제 : ITWILL 회원관리
 * @기간 : ~ 1주일
 * @기능 : .....
 *
 */
class FrameEx5 extends JFrame implements ActionListener {

	JPanel pName, pAge, pJumin, pGender, pGender2, pButton;

	JTextField txtName, txtAge, txtJumin;
	JRadioButton raMan, raWoman;
	JLabel laName, laAge, laJumin, laGender;

	JButton btnSend, btnCancel;

	public FrameEx5() {

		setTitle("JDBC 연결하기");

		// 레이아웃 변경
		setLayout(new GridLayout(5, 2));

		/************************************************/
		// 이름 //
		pName = new JPanel(new GridLayout(1, 2));
		laName = new JLabel(" 이 름 : ");
		// 라벨 가운데 정렬
		laName.setHorizontalAlignment(JLabel.CENTER);
		txtName = new JTextField();

		pName.add(laName);
		pName.add(txtName);

		this.add(pName);
		/************************************************/

		/************************************************/
		// 나이 //
		pAge = new JPanel(new GridLayout(1, 2));
		laAge = new JLabel(" 나 이 : ");
		// 라벨 가운데 정렬
		laAge.setHorizontalAlignment(JLabel.CENTER);
		txtAge = new JTextField();

		pAge.add(laAge);
		pAge.add(txtAge);

		this.add(pAge);
		/************************************************/

		/************************************************/
		// 주민번호 //
		pJumin = new JPanel(new GridLayout(1, 2));
		laJumin = new JLabel(" 주 민 번 호 : ");
		// laJumin.setFont(new Font("Gothic", Font.BOLD, 25));
		// 라벨 가운데 정렬
		laJumin.setHorizontalAlignment(JLabel.CENTER);
		txtJumin = new JTextField();

		pJumin.add(laJumin);
		pJumin.add(txtJumin);

		this.add(pJumin);
		/************************************************/

		/************************************************/
		// 성별 (라디오버튼) //

		pGender = new JPanel(new GridLayout(1, 2));
		pGender2 = new JPanel(new GridLayout(1, 2));

		laGender = new JLabel(" 성 별 : ");
		laGender.setHorizontalAlignment(JLabel.CENTER);

		raMan = new JRadioButton("남", true);
		raWoman = new JRadioButton("여");

		ButtonGroup bg = new ButtonGroup();

		bg.add(raMan);
		bg.add(raWoman);

		pGender2.add(raMan);
		pGender2.add(raWoman);

		pGender.add(laGender);
		pGender.add(pGender2);

		this.add(pGender);

		/************************************************/

		/************************************************/
		// 버튼 //
		pButton = new JPanel(new GridLayout(1, 2));

		btnSend = new JButton("SEND");
		btnCancel = new JButton("CANCEL");

		pButton.add(btnSend);
		pButton.add(btnCancel);

		this.add(pButton);

		/************************************************/

		// 버튼 클릭 이벤트
		// SEND - 입력된 정보를 가져와서 콘솔창 출력 -> DB
		btnSend.addActionListener(this);
		// CANCEL - 입력된 정보를 모두 초기화
		btnCancel.addActionListener(this);

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(300, 400);
		setVisible(true);
	} // 생성자

	@Override
	public void actionPerformed(ActionEvent e) {
		// System.out.println("클릭 테스트");
		// SEND
		if (e.getActionCommand() == "SEND") {
			String name = txtName.getText();
			int age = Integer.parseInt(txtAge.getText());
			String jumin = txtJumin.getText();
			String gender = raMan.isSelected() ? "남" : "여";

			System.out.println("NAME:" + name);
			System.out.println("AGE:" + age);
			System.out.println("JUMIN:" + jumin);
			System.out.println("GENDER:" + gender);

			// 전달받은 정보를 DB로 전달
			sendData(name, age, jumin, gender);
			

			JOptionPane.showMessageDialog(this, "정보 전송");

			txtName.setText("");
			txtAge.setText("");
			txtJumin.setText("");
			raMan.setSelected(true);

		}
		// CANCEL
		if (e.getSource() == btnCancel) {

			JOptionPane.showMessageDialog(this, "정보 초기화");

			txtName.setText("");
			txtAge.setText("");
			txtJumin.setText("");
			raMan.setSelected(true);

		}

	} // 이벤트 처리

	// DB연결 동작
	public void sendData(String name, int age, String jumin, String gender) {

		final String DRIVER = "com.mysql.jdbc.Driver";
		final String DBURL = "jdbc:mysql://localhost:3306/javadb";
		final String DBID = "root";
		final String DBPW = "1234";

		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			// 1. 드라이버 로드
			Class.forName(DRIVER);

			System.out.println("드라이버 로드 성공!");
			// 2. 디비 연결
			con = DriverManager.getConnection(DBURL, DBID, DBPW);

			System.out.println("디비 연결 성공!");
			// 3. SQL구문(insert) & pstmt
			String sql = "insert into itwill_member " + "values(null,?,?,?,?)";

			pstmt = con.prepareStatement(sql);

			// ?
			pstmt.setString(1, name);
			pstmt.setInt(2, age);
			pstmt.setString(3, jumin);
			pstmt.setString(4, gender);

			// 4. 실행
			pstmt.executeUpdate();

			System.out.println(" 회원가입 완료 ");

		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 로드 실패!");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("디비 연결 실패!");
			e.printStackTrace();
		} finally {
			// 자원해제
			try {
				if (pstmt != null) {	pstmt.close();	}
				if (con != null) {  con.close(); }
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}

	}

}// 클래스

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new FrameEx5();

	}

}
