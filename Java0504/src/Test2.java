class Point2{
	protected int x = 10;
	protected int y = 20;
}
class Point3 extends Point2{
	private int z = 30;	
	
	public void prn(){
		System.out.println("x="+x+", y= "+y+", z="+z);
	}
}


// 사원(EMP) - 이름(name),월급(salary)
// 해당 사원의 정보를 모두 출력하는 기능
// 객체(사원) 생성시 데이터를 초기화 ("홍길동",500)
class EMP{
	protected String name;
	protected int salary;
	
	public EMP(){}
	public EMP(String name,int salary){
		this.name = name;
		this.salary = salary;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void showEMP(){
		System.out.println("사원의 정보 : "+name+","+salary);
	}
}

// 관리자(MAN) - 이름(name),월급(salary),부서(depart)
// 관리자 정보를 출력하는 기능
// 객체 (관리자) 생성시 데이터 초기화 ("김팀장",600,"개발팀")
class MAN extends EMP{
	//private String name;
	//private int salary;
	private String depart;
	
	public MAN(){}
	public MAN(String name,int salary,String depart){
		this.name = name;
		this.salary = salary;
		this.depart = depart;		
	}
	
	public void showMan(){
		System.out.println("관리자 정보 : "+name+", "+salary+", "+depart);
	}
	
}





public class Test2 {

	public static void main(String[] args) {
		// protected 접근지정자
		// : 상속이 적용되는 클래스에서 서브클래스가 슈퍼클래스 필드에 접근 가능하도록 하는것
		//  클래스 외부에서는 접근 불가능하게 하는 접근 지정자
		// => 상속관계(서브클래스) : public , 외부클래스(상속x) : private
		
	    Point3 p3 = new Point3();
	    p3.prn();
	    
	    //System.out.println(x);
	    System.out.println(p3.x);
		
		
		EMP emp = new EMP("홍길동", 500);
		emp.showEMP();
		System.out.println(emp.getName());
		System.out.println(emp.getSalary());
		
		
		MAN man = new MAN("김팀장",600,"개발팀");
		man.showMan();
		man.showEMP();
		
		
		
		
		
		

	}

}
