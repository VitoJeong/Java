package com.itwillbs.View;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.plaf.synth.SynthScrollPaneUI;
import javax.swing.table.DefaultTableModel;

import com.itwillbs.Model.CustomerDAO;
import com.itwillbs.Model.CustomerDTO;

/**
 * 
 * @author ITWILL
 * @제목 : 아이티윌 회원관리 프로그램
 * @기간 : 00 ~ 00 (0개월)
 * @참여인원 : 00명
 *  
 */
 

public class CustomerGUI extends JFrame {
	
	JPanel panWest,panSouth;
	// 정보입력 변수
	JPanel pIdx,pName,pId,pPasswd,pJumin;
	JLabel laIdx,laName,laId,laPasswd,laJumin;
	JTextField tfIdx,tfName,tfId,tfPasswd,tfJumin;
	
	// 동작 처리 변수
	JButton btnInsert, btnSelect,btnDelete;
	
	// 결과(회원 목록) 처리 변수
	JTable table;
	JScrollPane scrollPane;
	DefaultTableModel dtm; // Jtable에 정보를 담을수 있는 형태
	

	public CustomerGUI(){
		setTitle("아이티윌 회원관리 프로그램 v1.0");
		
		// 버튼 부착 패널
		panSouth = new JPanel();
		panSouth.setBackground(Color.CYAN);
		
		btnInsert = new JButton("회원 추가");
		panSouth.add(btnInsert);
		btnInsert.addActionListener(btnListener);
		
		
		btnSelect = new JButton("회원 검색");
		panSouth.add(btnSelect);
		btnSelect.addActionListener(btnListener);
		
		
		btnDelete = new JButton("회원 삭제");
		panSouth.add(btnDelete);
		btnDelete.addActionListener(btnListener);
		
		
		add(panSouth,BorderLayout.SOUTH);
		
		
		// 정보 입력 패널 (왼쪽)
		panWest = new JPanel();
		panWest.setLayout(new GridLayout(5, 1));
		panWest.setBackground(Color.ORANGE);
		add(panWest,BorderLayout.WEST);
		
		// 정보입력창 구현 (번호)
		pIdx = new JPanel(new FlowLayout(FlowLayout.RIGHT));// 패널 우측정렬
		//pIdx.setBackground(Color.RED);
		
		laIdx = new JLabel("번   호");
		tfIdx = new JTextField(12);
		
		pIdx.add(laIdx); pIdx.add(tfIdx);
		tfIdx.setEditable(false);
		
		
		panWest.add(pIdx);
		
		// 정보입력창 구현 (이름)
		pName = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		laName = new JLabel("이   름");
		tfName = new JTextField(12);
		
		pName.add(laName); pName.add(tfName);
		
		panWest.add(pName);
		
		// 정보입력창 구현 (아이디)
		pId = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		laId = new JLabel("아 이 디");
		tfId = new JTextField(12);
		
		pId.add(laId); pId.add(tfId);
		
		panWest.add(pId);
		
		
		// 정보입력창 구현 (비밀번호)
		pPasswd = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		laPasswd = new JLabel("비 밀 번 호");
		tfPasswd = new JTextField(12);
		
		pPasswd.add(laPasswd); pPasswd.add(tfPasswd);
		
		panWest.add(pPasswd);
		
		// 정보입력창 구현 (주민번호)
		pJumin = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		laJumin = new JLabel("주 민 번 호");
		tfJumin = new JTextField(12);
		
		pJumin.add(laJumin); pJumin.add(tfJumin);
		
		panWest.add(pJumin);
		
		select();
		
		setBounds(100,100,800,300);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	} // 생성자
	
	// 이벤트 처리 객체 리스너
	ActionListener btnListener = new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getSource() == btnInsert){
				System.out.println("회원 추가 버튼!");
				insert();				
			}else if(e.getSource() == btnSelect){
				System.out.println("회원 검색 버튼");
				// 회원 목록호출
				select();
			}else if(e.getSource() == btnDelete){
				System.out.println("회원 삭제 버튼");
				// 회원 삭제
				delete();
			}else{
				System.out.println("해당사항없음!");
			}
		}
	}; // 익명클래스 
	
	// 회원 가입(insert)
	public void insert(){
		String name = tfName.getText();
		String id = tfId.getText();
		String passwd = tfPasswd.getText();
		String jumin = tfJumin.getText();
		
		System.out.println(name+"/"+id+"/"+passwd+"/"+jumin);
		// 각각의 요소가 입력이 안된경우
		// 해당 요소의 값을 입력하도록 유도
		// JOptionPane 사용 메세지창
		// 해당 요소 포커싱
		if(name.length() == 0){
			JOptionPane.showMessageDialog(this, "이름을 입력하시오!");
			tfName.requestFocus();
		}else if(id.length() == 0){
			JOptionPane.showMessageDialog(this, "아이디를 입력하시오!");
			tfId.requestFocus();
		}else if(passwd.length() == 0){
			JOptionPane.showMessageDialog(this, "비밀번호를 입력하시오!");
			tfPasswd.requestFocus();
		}
		else if(jumin.length() == 0){
			JOptionPane.showMessageDialog(this, "주민번호를 입력하시오!");
			tfJumin.requestFocus();
		}else{
			// 모두 입력했을때
			// 해당정보를 저장 -> DB 이동/저장 
			// -> 처리결과에 따른 동작 처리
			
			CustomerDTO dto = new CustomerDTO();
			dto.setId(id);
			dto.setJumin(jumin);
			dto.setName(name);
			dto.setPasswd(passwd);
			
			CustomerDAO dao = new CustomerDAO();
			int result = dao.insertCustomer(dto);
			
			System.out.println("결과 : "+result);
			
			if(result == 1){
				// 회원가입 성공
				
				tfName.setText("");
				tfId.setText("");
				tfJumin.setText("");
				tfPasswd.setText("");
				
				JOptionPane.showMessageDialog(this, "회원 추가 완료!");	
				
				// 회원 목록 갱신 
				select();
				
			}else{
				// 회원가입 실패
				JOptionPane.showMessageDialog(this, "회원 추가 실패!\n관리자에게 문의하세요.");
			}
			
		}//insert 버튼
	}
	// 회원 가입(insert)
	
	// select() - 회원검색 버튼클릭
	public void select(){
		// Db에서 정보를 가져온다
		CustomerDAO dao = new CustomerDAO();
		dtm = dao.selectCustomer();
		
		// Jtable 객체 생성 -> 정보 전달
		table = new JTable(dtm);
		// 테이블의 셀 고정
		table.getTableHeader().setReorderingAllowed(false);
		
		// 스크롤팬 추가
		scrollPane = new JScrollPane(table);
		
		// 프레임에 추가
		add(scrollPane,BorderLayout.CENTER);
		setVisible(true); //화면 새로고침
		
	}
	// select() - 회원검색 버튼클릭
	
	// delete() - 회원 삭제 버튼 클릭
	public void delete(){
	   String idx =
		JOptionPane.showInputDialog(this,"삭제할 회원 번호를 입력하시오");
	   
	   // DAO 객체 생성
	   CustomerDAO dao = new CustomerDAO();
	   int result 
	     = dao.deleteCustomer(Integer.parseInt(idx));
	   
	   if(result == 1){
		  JOptionPane.showMessageDialog(this, "회원 삭제 완료!");  
	   }else{
		  JOptionPane.showMessageDialog(this, "회원 삭제 실패");
	   }
	   
	   // 화면 갱신(새로고침)
	   select();
		
		
	}
	// delete() - 회원 삭제 버튼 클릭
	
	
	

	public static void main(String[] args) {
        new CustomerGUI();
	}

}
