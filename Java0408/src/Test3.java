
public class Test3 {

	public static void main(String[] args) {
		// 보조 제어문
		// 1) break; 2) continue;

		for (int i = 1; i < 11; i++)
			System.out.print(i + " ");

		System.out.println();

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0)
				break;
			System.out.print(i + " ");
		}
		// * break문 가장 가까운 반복문을 탈출

		System.out.println("\n--------------------");

		for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if (j % 3 == 0)
					break;
				System.out.println("i : " + i + ", j : " + j);
			}
			System.out.println("--------------------");
		}

		// '레이블'을 사용하여 원하는 위치의 반복문을 탈출
		System.out.println("\n--------------------");

		exit_for: for (int i = 1; i < 5; i++) {
			for (int j = 1; j < 10; j++) {
				if (j % 3 == 0)
					break exit_for;
				System.out.println("i : " + i + ", j : " + j);
			}
			System.out.println("--------------------");
		}

		// 해당 반복문을 실행할때 continue문을 만나면 다음 반복문으로 이동

		for (int i = 1; i < 11; i++) {
			if (i % 3 == 0)
				continue;
			System.out.print(i + " ");
		}

		// 무한 루프(무한 반복문)
		// for(;;){
		// System.out.println("안녕하세요");
		// }
		// for(;true;){
		// System.out.println("안녕하세요");
		// }

		// while(true){ }
		// do{} while(true);

	}

}
