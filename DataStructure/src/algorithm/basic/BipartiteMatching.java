package algorithm.basic;

import java.util.ArrayList;
import java.util.Arrays;

public class BipartiteMatching {

	static int n=3, result;
	static boolean v[];
	static int b[];
	static ArrayList<Integer> a[] = new ArrayList[n+1];
	
	public static void main(String[] args){
		
		v = new boolean[n+1];
		b = new int[n+1];
		
		for (int i = 0; i < a.length; i++) {
			a[i] = new ArrayList<>();
		}
		pushBack(1,1);
		pushBack(1,2);
		pushBack(1,3);
		pushBack(2,1);
		pushBack(3,2);
		
		
		result = 0;
		for(int i = 1; i <= n; i++){
			
			Arrays.fill(v, false);
			if(dfs(i)) result++;
		}
		
		for (int i = 1; i < b.length; i++) {
			System.out.println(b[i] + " -> "+ i);
		}
		
		
	}
	
	static boolean dfs( int x){
		
		if(v[x]) return false;
		
		v[x] = true;
		
		for(int i:a[x]){
			if(b[i] == 0 || dfs(b[i])){
				b[i] = x;
				return true;
			}
		}
		
		return false;
	}
	
	static void pushBack(int x, int y){
		a[x].add(y);
	}
}
