import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Baekjoon {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 10989 - 수 정렬하기3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		short[] cnt = new short[10001];
		
		for (int i = 0; i < a; i++) {
			short num = Short.parseShort(br.readLine());
			cnt[num]++;
		}
		
		
		for (int i = 0; i < cnt.length; i++) {

			while(cnt[i]!=0){
				System.out.println(i);
				cnt[i]--;
			}
		}
		
	}


}
