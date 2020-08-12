import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

import com.itwillbs.EX.PersonService;
import com.itwillbs.EX.PersonServiceImp;

public class Test1 {

	public static void main(String[] args) {

		// Test1는 HelloSpring 객체를 필요로한다.
		// => Test1은 HelloSpring 객체를 의존한다.
		
		//System.out.println("안녕하세요.");	
		
		// HelloSpring 객체생성 -> 사용 (직접구현-강한결합)
		HelloSpring hs = new HelloSpring();
		
		hs.hello();
		
		// => 강한 결합 
		
		System.out.println("--------------------------");
		
		// SpringHelloKrImp 객체를 생성
		// Test1는 SpringHelloKrImp를 필요로함.
		// => 의존 관계 존재한다.
		//SpringHelloKrImp sp = new SpringHelloKrImp();
		SpringHelloKr sp = new SpringHelloKrImp();
		
		sp.sayHello();
		
		// => 약한 결합
		
		System.out.println("--------------------------");
		
		// PersonServiceImp 객체를 필요함.(의존하는 상태)
		// 해당 객체 생성후, 정보 초기화, 정보 출력 
		
		PersonServiceImp psi = new PersonServiceImp();
		
		psi.setName("홍길동");
		//psi.setAge(20);
		
		psi.showPerson();
		
		
		System.out.println("--------------------------");
		// 스프링을 사용해서 의존관계를 주입 (이미 객체가 존재)
		
		BeanFactory bf
		= new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		// xml 파일안에 있는 객체의 정보만 가져오기 (의존 주입 - DI)
		PersonService ps = (PersonService)bf.getBean("personService");
		
		ps.showPerson();
		
	
		System.out.println("-------------------------------");
		BeanFactory bf2 =
				new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		PersonService ps2 = (PersonService) bf2.getBean("personService1");
		
		ps2.showPerson();
		
		// 생성자 (이름,나이) 주입 
		System.out.println("-------------------------------");
		BeanFactory bf3 =
				new XmlBeanFactory(new FileSystemResource("person.xml"));
		
		PersonService ps3 = (PersonService) bf3.getBean("personService2");
		
		ps3.showPerson();
		
		
		
		
	
		
		// 의존성 : 특정 객체가 다른 객체를 필요로 하거나, set(), 생성자를 사용해서 
		// 주입시켜서 사용할때  그 객체와의 관계를 의존 관계라고함
		// 의존 관계있는 객체를 주입할때 '의존 주입(Dependency Injection)' 이라함.
		// => 클래스간의 관계 약화
		
		// DI 사용 방법 
		// 1) set() 사용 : 선택적 의존관계 일때 사용(해당 객체 재주입)
		// 2) 생성자 사용 : 필수 의존과계 일때 사용
		
		
		
		

	}

}
