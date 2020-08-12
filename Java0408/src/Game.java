
public class Game {

	public static void main(String[] args) {

		System.out.println("준비");

		for (int i = 10; i >= 0; i--) {
			for (long j = 0; j < 10000000000L; j++);
			System.out.println(i);
		}

		System.out.println(" 시작 ");

	}

}
