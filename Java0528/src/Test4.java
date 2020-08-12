import java.util.Vector;


class Point{
	
	private int x;
	private int y;
	
	public Point(){}
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	/*
	 * public int getX() { return x; } public void setX(int x) { this.x = x; }
	 * public int getY() { return y; } public void setY(int y) { this.y = y; }
	 */
	@Override
	public String toString() {
		return "("+x+","+y+")";
	}
	
}


public class Test4 {

	public static void main(String[] args) {
		// Point 클래스 -> 생성
		
		// Vector 생성: (x,y) 좌표를 저장하는 클래스 Point를 저장하는 객체
		Vector<Point> vp = new Vector<Point>();
		
		// 좌표 3개 입력  (2,3) , (-5,20), (30,-8)
		// => 모든 요소의 정보 출력 (좌표 형태로 정보 출력)
		
		//Point p1 = new Point();
		//p1.setX(2);
		//p1.setY(3);
		////////////////////////////
		//Point p1 = new Point(2,3);
		//vp.add(p1);
		////////////////////////////
		vp.add(new Point(2, 3));
		vp.add(new Point(-5,20));
		vp.add(new Point(30, -8));

		System.out.println(vp);
		
		// 1번 인덱스에 들어있는 좌표 삭제 
		vp.remove(1);
		
		System.out.println(vp);
		
		// 1번 인덱스에 좌표값 입력(100,200)
		// => 모든 요소의 정보 출력 (좌표 형태로 정보 출력)
		vp.add(1, new Point(100, 200));
		System.out.println(vp);
		
		vp.clear();
		System.out.println(vp);
		

	}

}
