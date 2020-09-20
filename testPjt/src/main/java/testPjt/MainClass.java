package testPjt;

import org.springframework.context.support.GenericXmlApplicationContext;

public class MainClass {
	public static void main(String[] args) {
		// TransportationWalk transpotationWalk = new TransportationWalk();
		// transpotationWalk.move();
		// 스프링은 new 로 인스턴스 생성안해도 됨 
		// -> src.main.resources의 xml파일에서 설정 -> bean객체 생성(id사용) -> Spring Container에 로드
		
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:applicationContext.xml");
		// applicationContext.xml의 컨테이너를 생성
		
		TransportationWalk transpotationWalk = ctx.getBean("tWalk", TransportationWalk.class);
		// id를 통해 객체를 컨테이너로 로드(bean객체 사용)
		transpotationWalk.move();
		
		ctx.close();
	}
}
