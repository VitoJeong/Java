// HandPhone - 모델명(model), 전화번호 (tel)
// => 해당 객체를 생성시 모델명, 전화번호를 초기화 가능
// => 핸드폰 정보를 출력하는 동작
class HandPhone{
	private String model;
	private String tel;
	
	public HandPhone(){}
	public HandPhone(String model,String tel){
		this.model = model;
		this.tel = tel;
	}	 
	public String getModel() {	return model;	}
	public void setModel(String model) { this.model = model;	}
	public String getTel() {	return tel;	}
	public void setTel(String tel) {	this.tel = tel;	}
	
	public void showHandPhone(){
		System.out.println("HandPhone 기능!!");
		System.out.println("model : "+model);
		System.out.println("tel : "+tel);
	}
	
}

// DicaPhone - 모델명(model), 전화번호(tel), 화소(pixel)
// => 해당 객체 생성시 모델명, 전화번호, 화소를 초기화 가능하다.
// => 디카폰의 정보를 출력하는 동작 
class DicaPhone extends HandPhone{
	private String pixel;
	
	public DicaPhone(){}
	public DicaPhone(String model,String tel,String pixel){
		//super();// 상속시 부모의 디폴트 생성자를 자동으로 호출
		super(model,tel);		
		this.pixel = pixel;		
	}

	public String getPixel() { 		return pixel;	}
	public void setPixel(String pixel) {	this.pixel = pixel;	}
	
	public void showDicaPhone(){
		System.out.println("DicaPhone 기능!! ");
		System.out.println("model : "+super.getModel());
		System.out.println("tel : "+super.getTel());
		System.out.println("pixel : "+pixel);
	}
}

class Parent{
	public void pprn(){
		System.out.println("pprn()");
	}
}
class Child extends Parent{
	public void pprn(){
		System.out.println("pprn(오버라이딩)");
	}
	public void cprn(){
		System.out.println("cprn()");
	}
}




public class Test1 {

	public static void main(String[] args) {

		// 클래스간의 관계가 is - a 관계일때 상속한다.
		// => 객체 상호관계를 표현방법으로 체크한다.
		// => is-a관계를 확인하는 연산자  : instanceof
		
		// 레퍼런스 변수  instanceof 클래스 타입 => T/F
		// args instanceof type
		
		HandPhone hp = new HandPhone("삼성S20", "010-1234-1234");
		hp.showHandPhone();
		
		DicaPhone dp = new DicaPhone("삼성S20+","010-456-7894","1800만");
		dp.showDicaPhone();
		dp.showHandPhone();
		
		System.out.println("------------------------------------");
		if(dp instanceof DicaPhone){
			// dp가 DicaPhone타입입니까?
			System.out.println("dp객체는 DicaPhone 입니다.");
		}
		
		// dp가 HandPhone 타입 입니까?
		if(dp instanceof HandPhone){
			System.out.println("dp객체는 HandPhone 입니다.");
			System.out.println(" 그래서 HandPhone으로 형변환 가능하다 (업캐스팅)");
			System.out.println(" HandPhone의 기능을 모두 사용 가능하다.");
		}
		
		System.out.println("--------------------------------------");
		// hp객체가 DicaPhone객체 인가?
		// - ㅇ : hp객체는 DicaPhone입니다.
		// - X : hp객체는 DicaPhone이 아닙니다.(형변환 불가능)
		if(hp instanceof DicaPhone){
			System.out.println("hp객체는 DicaPhone입니다.");
		}else{
			System.out.println("hp객체는 DicaPhone이 아닙니다.(형변환 불가능)");
		}
		
		System.out.println("-----------------------------------------------");
		
		Parent p = new Parent();
		p.pprn();

		Child c = new Child();
		c.cprn();
		c.pprn();
		
		System.out.println("--------------------------------");
		// 업캐스팅
		Parent p1 = c;
		p1.pprn();
		// => 오버라이딩된 메서드 호출
		// => 업 캐스팅이후에도 상관없이 항상 오버라이딩된 메서드만 사용
		//    (부모의 메서드는 은닉된다.)
		//   * 메서드 오버라이딩의 우선순위가 높다.
		// p1.cprn(); // => 업캐스팅시 상속받은 부분만 사용가능
		
		
		
		
		
		
		
		
		
		
		
	}

}
