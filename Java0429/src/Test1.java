import java.util.Scanner;

class Student {
	private String name;

	public Student() {
	}

	public Student(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

// 이름(name),전화번호(tel)을 필드로 가지고있는 클래스 Phone
// 정보를 외부 접근시 불가능
// 객체 생성을 통해서 정보 초기화, 수정, 확인 (이름,전화번호 동시에 출력)
// 스캐너 입력을 통해서 정보 저장 사용
class Phone {
	private String name;
	private String tel;

	public Phone() {
	}

	public Phone(String name, String tel) {
		// alt + shift + s -> o
		super();
		this.name = name;
		this.tel = tel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public void address() {
		System.out.println("전화번호 :" + name + " - " + tel);
	}

}// class Phone

public class Test1 {

	public static void main(String[] args) {
		// 학생 객체 2개 생성
		// 학생의 이름을 저장할수 있는 객체
		// 객체 생성시 초기화 가능
		// 이름정보는 외부에서 직접 접근이 불가능.
		// set/get() 해당 정보를 출력/수정

		Student kim = new Student("김학생");
		System.out.println(kim.getName());

		Student jung = new Student("정학생");
		System.out.println(jung.getName());

		//////////////////////////////////////////////////////////////

		Phone s = new Phone("홍길동", "010-1234-5678");
		s.address();

		Scanner scan = new Scanner(System.in);

		System.out.println("저장할 인원수를 입력해주세요.");

		int cnt = scan.nextInt();

		for (int i = 0; i < cnt; i++) {
			System.out.println("전화기에 등록할 사용자정보를 입력해주세요.(이름,전화번호)");

			String inputName = scan.nextLine();
			String inputTel = scan.nextLine();

			Phone s1 = new Phone(inputName, inputTel);
			s1.address();
		}

	}

}
