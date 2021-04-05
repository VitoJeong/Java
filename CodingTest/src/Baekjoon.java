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
	static boolean[] v;
	static Shark[] sharks;
	
	public static void main(String[] args) throws Exception {
		// 1671
		// -> 이분매칭(DFS 사용)
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());

		d = new int[n+1];
		v = new boolean[n+1];
		sharks = new Shark[n+1];
		
		for (int i = 1; i <= n; i++) {
			st = new StringTokenizer(br.readLine());
			int size = Integer.parseInt(st.nextToken());
			int velocity = Integer.parseInt(st.nextToken());
			int intelligence = Integer.parseInt(st.nextToken());
			sharks[i] = new Shark(size, velocity, intelligence);
		}

		int result = 0;
		for(int i = 1; i <= n; i++){
			for (int j = 0; j < 2; j++) {
				
				v = new boolean[n+1];
				System.out.println("ooo"+ i);
				if(dfs(i)) result++;
			}
		}
		System.out.println(n-result);
		for(int i = 1; i < d.length; i++){
			System.out.println(d[i]);
		}
	}

	
	static boolean dfs(int x){

		for (int i = 1; i < sharks.length; i++) {
			
			if(i != x){
				
				if(v[i]) continue;
				
				int compare = sharks[x].compareTo(sharks[i]);
				
				if((compare == 0 && x > i) || compare == 1){
					v[i] = true;
					if(d[i]==0 || dfs(d[i])){
						System.out.printf("x : %d\n",x);
						System.out.printf("i : %d\n",i);
						System.out.println();
						d[i] = x;
						return true;
					}
				}
			}
		}
		return false;
	}

}

class Shark implements Comparable<Shark>{
	int size, velocity, intelligence;
	
	public Shark(int size, int velocity, int intelligence){
		this.size = size;
		this.velocity = velocity;
		this.intelligence = intelligence;
	}

	@Override
	public int compareTo(Shark shark) {
		
		if(this.size == shark.size && this.velocity == shark.velocity && this.intelligence == shark.intelligence)
		{
			return 0;
		}
		else if(this.size >= shark.size && this.velocity >= shark.velocity && this.intelligence >= shark.intelligence)
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
}
