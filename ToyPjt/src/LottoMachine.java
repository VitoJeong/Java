import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class LottoMachine {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("최근 5회중 3회 이상 나온 번호를 입력해주세요 >> ");

		int[] nums = new int[5];

		int a = 0;
		// 입력받는 부분
		while (a < nums.length) {
			String temp = br.readLine();
			if (temp.equals("") || temp == null) {
				break;
			} else if (temp.matches("[+-]?\\d*(\\.\\d+)?")) {

				if (!(0 < Integer.parseInt(temp) && Integer.parseInt(temp) <= 45)) {
					System.out.println("알맞은 숫자를 입력해주세요.");
				} else {
					nums[a] = Integer.parseInt(temp);
				}
			}
			a++;
		}
		
		List<Byte> result = new ArrayList<>();

		// 45개 공 만들기
		byte[] numbers = new byte[45];
		for (byte i = 0; i < numbers.length; i++) {
			numbers[i] = (byte) (i + 1);
		}

		// 결과 담기(추첨)
		while (result.size() < 7) {
			byte ball = (byte) (Math.random() * 45 + 1);
			if (!result.contains(ball) && !(IntStream.of(nums).anyMatch(x -> x == ball))) {
				result.add(ball);
			} else {
				System.out.println("중복>,.<");
			}
		}

		result.sort(null); // 오름차순 정렬
		
		// 결과 출력		
		System.out.println("로또번호 추첨 고고링 !!");
		for (byte i = 0; i < result.size(); i++) {
			try {
				Thread.sleep(1000);
				if (!(i == result.size() - 1)) {

					System.out.println(i + 1 + "번 번호 : " + result.get(i));
				} else {

					System.out.println("보너스! :" + result.get(i));
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	} // main()

}
