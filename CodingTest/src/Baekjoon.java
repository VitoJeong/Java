import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Baekjoon {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// 10989 - 수 정렬하기3
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int a = Integer.parseInt(br.readLine());
		short[] cnt = new short[10001];
		
		for (int i = 0; i < a; i++) {
			cnt[Short.parseShort(br.readLine())]++;
		}
		
		br.close();
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < cnt.length; i++) {

			while(cnt[i]>0){
				sb.append(i).append("\n");
				cnt[i]--;
			}
		}
		System.out.println(sb);
	}


}
