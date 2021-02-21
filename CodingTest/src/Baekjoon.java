import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baekjoon {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 1181 - 단어정렬
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		String[] arr = new String[a];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = br.readLine();
		}
		
		arr = sort(arr);

		
	}

	private static String[] sort(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			
		}
		
		return null;
	}
	

}
