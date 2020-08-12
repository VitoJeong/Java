// 일반좌표(x,y), 컬러좌표(x,y,color)
// 파란색(10,10) 좌표 생성 => 출력
class Point{

	private int x,y;
//	protected int x,y;
	
	public Point(){
		//this.x = 0;
		//this.y = 0;
	}
	public Point(int x,int y){
		this.x =x;
		this.y =y;
	}
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void showPoint(){
		System.out.println("좌표 ("+x+","+y+")");
	}
	
}//Point

class ColorPoint extends Point{
	
	private String color;
	
	public ColorPoint(){}
	public ColorPoint(int x,int y,String color){
		super(x,y);
		this.color = color;
//		super.x = x;
//		super.y = y;
	}
	// color(set/get)
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	// 컬러좌표 출력 메서드
	@Override
	public void showPoint() {
		System.out.println("색상 : "+color);
		super.showPoint();
	}
}//ColorPoint


// 좌표 x,y,z => Point3D객체
// => 좌표 (10,10,10) 사용(출력)
class Point3D extends Point{
	private int z;
	
	Point3D(){}
	Point3D(int x,int y, int z){
		super(x,y);
		this.z = z;
	}
	@Override
	public void showPoint() {
		System.out.println("3D : ("+super.getX()+","+super.getY()+","+z+")");
	}
}

class SuperClass{
	public SuperClass(){}
	// -> 생성자가 없을경우 자동으로 컴파일러가 
	// 기본생성자를 생성한다.(오버로딩된 생성자가 없을경우)
	// => 가능하면 클래스 설계시 기본생성자는 사용유무와 상관없이 그냥 생성 추천
	public SuperClass(int a){}
}
class SubClass extends SuperClass{
	public SubClass(){
		//super();
		super(10);
		// -> 레퍼런스를 사용해서 슈퍼클래스의 생성자를 명시적 호출
	}
	public SubClass(int a){
		//super();
		super(10);
	}	
}





public class Test2 {

	public static void main(String[] args) {

		Point p = new Point();
		System.out.println(p.getX()+","+p.getY());
		p.showPoint();
		
		System.out.println("-----------------");
		// 파란색(10,10)
		ColorPoint cp = new ColorPoint(10,10,"파란색");
		cp.showPoint();
		// 노란색(100,100)
		ColorPoint cp2 = new ColorPoint();
		cp2.setX(100);
		cp2.setY(100);
		cp2.setColor("노란색");
		
		System.out.println(cp2.getColor());
		System.out.println("x="+cp2.getX());
		System.out.println("y="+cp2.getY());
		System.out.println("----------------------------------");
		
		Point3D p3 = new Point3D(10, 20, 30);
		p3.showPoint();
		
		
	}

}
