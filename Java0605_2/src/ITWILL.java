import java.util.ArrayList;
import java.util.Scanner;

import com.itwill.db.ItwillDAO;
import com.itwill.db.ItwillDTO;

public class ITWILL {

	public static ItwillDTO inputData() {
		// 사용자 이름,성별,나이,주민번호 입력 (키보드 입력)
		// -> ItwillDTO 객체에 저장해서 리턴
		System.out.println(" 사용자 정보 입력창 입니다. (inputData()) ");

		Scanner scan = new Scanner(System.in);

		ItwillDTO dto = new ItwillDTO();

		System.out.println(" 이름 >> ");
		String name = scan.next();
		dto.setName(name);

		System.out.println(" 성별 >> ");
		String gender = scan.next();
		dto.setGender(gender);

		System.out.println(" 나이 >> ");
		int age = scan.nextInt();
		dto.setAge(age);

		System.out.println(" 주민번호 >> ");
		String jumin = scan.next();
		dto.setJumin(jumin);

		// 객체의 정보 출력
		System.out.println(dto);

		return dto;
	}

	// showMemberList()
	public static void showMemberList(ArrayList arr) {
		System.out.println(" 회원 정보 목록을 출력합니다. ");

		// System.out.println(arr);
		// 확장for 사용 출력
		// for(ItwillDTO dto : (ItwillDTO)arr ){
		// }
		
		// for
		for(int i=0;i<arr.size();i++){
			ItwillDTO dto = (ItwillDTO) arr.get(i);
			
			System.out.println("------------------------------------------------------------------");
			
			System.out.println(dto);
			//System.out.println(dto.getName()+"\t"+dto.getJumin());
			
			System.out.println("------------------------------------------------------------------");
		}
	}
	// showMemberList()

	public static void main(String[] args) {

		// ITWILL 회사의 사원 관리 프로그램

		// 1. 회원 등록 -> 이름,성별,나이,주민번호를 등록
		// 2. 회원 조회 -> 이름/주민번호를 사용해서 검색 가능, 전체 목록보기 가능
		// 3. 회원 수정 -> 이름/주민번호를 제외한 나머지 정보만 수정 가능
		// 4. 회원 삭제 -> 이름/주민번호 입력시 회원 삭제 가능
		// * 프로그램 종료
		Scanner scan = new Scanner(System.in);

		System.out.println("(주) ITWILL 회원 관리 프로그램 ----------------------");

		do {
			System.out.println("[1.회원 등록   2.회원 조회   3.회원 수정   4.회원 삭제   5.종료] ");
			System.out.println("실행할 동작(번호)을 입력하시오 >> ");
			int action = scan.nextInt();

			// DAO 객체를 생성
			ItwillDAO dao = new ItwillDAO();

			switch (action) {
			case 1:
				System.out.println("등록(switch-case)");
				// 사용자 입력후 정보 저장
				ItwillDTO dto = inputData();
				// DB에 저장
				dao.memberJoin(dto);
				break;
			case 2:
				System.out.println("조회");

				// DAO로 이동해서 memberList() 메서드 사용
				// -> 회원 정보 모두를 가져온다.
				ArrayList memberList = dao.memberList();
				// 정보를 출력하는 showMemberList() 메서드로 전달
				showMemberList(memberList);

				break;
			case 3:
				System.out.println("수정");
				
				// 수정하고하는 사람의 정보를 입력(idx)
				System.out.println(" 수정하고 싶은 회원 번호를 입력하시오 >> ");
				int num = scan.nextInt();
				// 내가 수정할 정보를 보여줌.
				dao.getMember(num);
				// 수정할 데이터를 입력 (이름,성별,나이,주민번호)
				System.out.println(" 수정할 정보를 입력해주세요. ");
				ItwillDTO updateDto = inputData();
				updateDto.setIdx(num);
				
				// DAO 객체 생성->updateMember();
				dao.updateMember(updateDto);
				// 수정된 정보 출력
				System.out.println("[수정된 데이터]");
				dao.getMember(num);
				break;
			case 4:
				System.out.println("삭제");
				// 삭제하고자하는 idx,name을 입력
				// 두개의 정보가 일치하는 경우에만 삭제
				System.out.println("삭제할 사람의 idx번호,이름을 입력하시오 >> ");
				int delNum = scan.nextInt();
				String delName = scan.next();
				
				dao.deleteMember(delNum,delName);
				
				break;
			default:
				System.out.println("종료");
				System.exit(0); // 프로그램 종료
				break;
			}

		} while (true);

	}

}
