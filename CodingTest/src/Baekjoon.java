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

	static int n, m, d[];
	static boolean[] v;
	static List<Integer> arr[];
	
	public static void main(String[] args) throws Exception {
		// 2188
		// -> 이분매칭(DFS 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		// 축사가 어느 소에 배정되있는지 저장하는 배열
		d = new int[m+1];
		v = new boolean[n+1];
		arr = new ArrayList[n+1];
		
		for (int i = 1; i <= n; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int expected = Integer.parseInt(st.nextToken());
			while(expected-->0)
			{
				arr[i].add(Integer.parseInt(st.nextToken()));
			}
		}

		int result = 0;
		for(int i = 1; i <= n; i++){
			v = new boolean[m+1];
			if(dfs(i)) result++;
		}
		
		System.out.println(result);
		
	}
	
	static boolean dfs(int x){
		
		for(int i = 0; i < arr[x].size(); i++){
			
			int w = arr[x].get(i);

			if(!v[w])
			{
				v[w] = true;
				
				if(d[w] == 0 || dfs(d[w])){
					d[w] = x;
					return true;
				}
			}
			
		}
		return false;
	}

}
