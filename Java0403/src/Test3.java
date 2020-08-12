
public class Test3 {

	public static void main(String[] args) {

		String msg = "Hello";
		// System.out.println(msg.charAt(5));

		// * charAt(위치)
		// => 문자열변수에 있는 값중에 해당 위치에 있는 문자형 데이터를 가져온다.

		msg = "abcOe";
		// 해당변수 3번방에있는(index:3) 값에 따라서 각각 다른 메세지를 출력
		// A/a => "Apple"
		// B/b => "Banana"
		// G/g => "Grape"
		// O/o => "Orange"
		// 그외 문자 => "처리 불가능한 문자 입니다."
		System.out.println("3번방의 값 : " + msg.charAt(3));
		char ch = msg.charAt(3);

		switch (ch) {
		case 'A':
		case 'a':
			System.out.println("Apple");
			break;
		case 'B':
		case 'b':
			System.out.println("Banana");
			break;
		case 'G':
		case 'g':
			System.out.println("Grape");
			break;
		case 'O':
		case 'o':
			System.out.println("Orange");
			break;

		default:
			System.out.println("처리 불가능한 문자 입니다.");
			break;
		}

	}

}
