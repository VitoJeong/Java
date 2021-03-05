import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Tiling {

	static int[] d = new int[1001];

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		
		System.out.println(dp(n));
		
	}

	static int dp(int n) {

		if (n == 0 || n == 1)
			return 1;
		if (d[n] > 0)
			return d[n];
		
		return d[n] = (dp(n-1) + dp(n-2)*2) % 10007;
	}

}
