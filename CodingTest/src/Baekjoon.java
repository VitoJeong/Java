import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;

public class Baekjoon {

	static int n, d[];
	static long stat[];
	static boolean[] v;
	static List<Integer> arr[];
	
	public static void main(String[] args) throws Exception {
		// 1671
		// -> 이분매칭(DFS 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());

		// 일에 처리할 수 있는 직원을 배정
		d = new int[n+1];
		stat = new long[n+1];
		v = new boolean[n+1];
		arr = new ArrayList[n+1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < 3; j++) {
				stat[i] += Integer.parseInt(st.nextToken());
			}
		}

		int result = 0;
		for(int i = 1; i <= n; i++){
			v = new boolean[n+1];
			if(dfs(i)) result++;
//			if(k-->0)
//			{
//				v = new boolean[m+1];
//				if(dfs(i)) result++;
//			}
		}
		System.out.println(result);
	}

	
	static boolean dfs(int x){
		
		for(int i = 1; i <= n; i++){
			
			long w = stat[i];
			
			if(i>1 && (stat[i]>=stat[i])){
				
			}

//			if(!v[w])
//			{
//				v[w] = true;
//				
//				if(d[w] == 0 || dfs(d[w])){
//					d[w] = x;
//					return true;
//				}
//			}
			
		}
		return false;
	}

}
