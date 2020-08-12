// 사각형의 정보를 저장하는 객체 Rect
class Rect {
	// width,height 외부 접근 불가능
	private int width, height;

	// 객체 생성시 초기화 가능
	public Rect() {
	}

	public Rect(int w, int h) {
		width = w;
		height = h;
	}

	// 사각형의 넓이를 계산하는 동작(가로 * 세로)
	public int getArea() {
		return width * height;
	}
}

// 사각형(가로,세로)을 박스의 형태로 출력하는 객체 DrawBox
class DrawBox {
	// 가로,세로 길이, 사각형의 모양( 그림그림 모양 ) 정보
	private int width,height;
	private char ch;
	
	// 전달정보가 하나도 없을경우 (10*1 사각형을 그린다.)
	public DrawBox(){
		width = 10;
		height = 1;
	}
	// 객체 생성시 전달받은 크기로 초기화해서 그림을 그린다.
	public DrawBox(int width,int height){
		this.width = width;
		this.height = height;
	}
	
	// 모양의 정보를 지정하는 동작 (fill)
	public void fill(char c){
		ch = c;
	}	
	// 그림그리는 동작(draw) : 저장된 가로/세로길이를 바탕으로 해당 모양으로 그림그리기
	
	public void draw(){
		
		for(int i=0;i<height;i++){
			for(int j=0;j<width;j++){
				System.out.print(ch);
			}
			System.out.println();
		}	
	}

}

public class Test2 {

	public static void main(String[] args) {

		// 5개의 사각형을 생성해서 5개 사각형의 넓이의 합을 출력
		Rect r1 = new Rect(3, 5);
		Rect r2 = new Rect(2, 5);
		Rect r3 = new Rect(3, 4);
		Rect r4 = new Rect(7, 5);
		Rect r5 = new Rect(3, 2);

		System.out.println(r1.getArea() + r2.getArea() + r3.getArea() + r4.getArea() + r5.getArea());

		Rect[] recArr = new Rect[5];

		recArr[0] = new Rect(3, 5);
		recArr[1] = r2;
		recArr[2] = r3;
		recArr[3] = r4;
		recArr[4] = r5;

		int sum = 0;
		for (int i = 0; i < recArr.length; i++)
			sum += recArr[i].getArea();

		System.out.println(sum);

		// (10,1) - **********
		// (3,3)
		// @@@
		// @@@
		// @@@
		
		DrawBox d = new DrawBox();
		d.fill('@');
		d.draw();
		DrawBox d2 = new DrawBox(20, 30);
		d2.fill('&');
		d2.draw();
		

	}

}
