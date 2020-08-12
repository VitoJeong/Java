import java.util.Scanner;

interface AddInterface{
	public abstract void add(int n);
	void add(int n,int m);
}

class SubAdd implements AddInterface{
	@Override
	public void add(int n) {
		int sum = 0;
		for(int i=1;i<=n;i++){
			sum += i;
		}
		System.out.println(" 1~"+n+"까지의 합 : "+sum);
	}
	@Override
	public void add(int n, int m) {
		System.out.println(n+"+"+m+"="+(n+m));
	}
}

// 계산기 객체
abstract class Calculator{
	protected int a,b;
	
	// 계산하는 메서드 선언 (계산의 결과를 리턴) calc()
	public abstract int calc();
	
	// 사용자로부터 정수값 2개를 입력받는 메서드  input()
	public void input(){
		Scanner s = new Scanner(System.in);
		System.out.println("정수값 2개를 입력하시오 >> ");
		this.a = s.nextInt();
		this.b = s.nextInt();		
	}
	// 계산기를 작동하는 메서드 run() => 입력, 계산, 결과 출력
	public void run(){
		
		input();
		int result = calc();
		System.out.println("연산 결과 : "+result);	
		
	}
}
// + , - 처리하는 객체 
// => 각각의 동작을 처리할수 있도록 진행

class Add extends Calculator{
	@Override
	public int calc() {
		// 더하기
		return a+b;
	}
}

class Sub extends Calculator{
	@Override
	public int calc() {
        // 빼기
		return a-b;
	}	
}

// 좌표를 표시하는 Point객체 
// x,y 좌표를 저장, 객체 생성시 해당좌표 초기화
// 직접접근이 불가능하기때문에 좌표의 값을 가져오는 메서드가 있음
// 좌표의 값을 수정하는 메서드(한번에 2개의 좌표를 받아서 이동) move()
class Point{
	private int x,y;
	public Point(){}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public void move(int x, int y){
		System.out.println(this.x+","+this.y+"(이전좌표)");
		this.x = x;
		this.y = y;
		System.out.println(this.x+","+this.y+"(이후좌표)");
	}	
	
}
// + 색상의 정보를 추가적으로 사용하는 좌표객체를 생성 ColorPoint
class ColorPoint extends Point{
	private String color;
	
	public ColorPoint(){}
	public ColorPoint(int x, int y,String color){
		// super();
		super(x,y);
		this.color =color;
	}
	public void NowPoint(){
		System.out.println(super.getX()+","+super.getY()+"/ "+color);
	}
	public void move(int x, int y){
		System.out.println(super.getX()+","+super.getY()+"(이전좌표)"+color);
		super.move(x, y);
		System.out.println(super.getX()+","+super.getY()+"(이후좌표)"+color);
	}
}

// (10,20) 좌표 확인   / (100,200) 파란색 좌표 확인 / (1,2) -> (3,5) 좌표 이동







public class Test1 {

	public static void main(String[] args) {
		// AddInterface 인터페이스 생성
		// 정수값 2개의 합을 계산하는 동작
		// 정수값 1개를 받아서 1~정수값까지 합을 출력(계산) 동작
		// => 두개의 메서드는 동일한 이름의 형태로 선언
		
		// 인터페이스 구현 => 결과확인
		SubAdd sa = new SubAdd();
		sa.add(10);
		sa.add(30, 30);
		
		
		// 더하기 기능
		Add a = new Add();
		//a.input();
		a.run();
		
		// 빼기 기능
		
		
		Point p = new Point(10,20);
		System.out.println("좌표 : ("+p.getX()+","+p.getY()+")");
		// (1,2) -> (3,5) 좌표 이동
		
		Point p2 = new Point(1, 2);
		System.out.println("좌표 : ("+p2.getX()+","+p2.getY()+")");
		p2.move(3, 5);
		System.out.println("좌표 : ("+p2.getX()+","+p2.getY()+")");
		
		
		ColorPoint cp = new ColorPoint(100, 200, "파란색");
		cp.NowPoint();
		
		
		
		

	}

}
