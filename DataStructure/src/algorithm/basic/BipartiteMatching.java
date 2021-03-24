package algorithm.basic;

import java.util.Arrays;

public class BipartiteMatching {

	private static int[][] a; 
	private static int[] d;
	private static boolean[] visited;
	
	public static void main(String[] args){
		
		int n = 3;
		a = new int[n+1][n+1];
		d = new int[n+1];
		visited = new boolean[n+1];
		
		a[1][1] = 1;
		a[1][2] = 1;
		a[1][3] = 1;
		a[2][1] = 1;
		a[3][2] = 1;
		int count = 0;
		for (int i = 1; i <= n; i++) {
			Arrays.fill(visited, false);
			if(dfs(i)) count++;
		}
		
		System.out.println(count);
		
		for (int i = 1; i < d.length; i++) {
			if(d[i] != 0){
//				System.out.println(d[i] + " -> " + i);
			}
			System.out.println(d[i] + " -> " + i);
		}
	}
	
	static boolean dfs(int x){
		
		// 연결된 모든 노드에 대해서 들어갈 수 있는지 시도
		for(int i = 1; i < a[x].length;i++){
			int t = 0;
			if(a[x][i] != 0) t = i;
			System.out.println(t);
			// 이미 처리한 노드는 더 이상 볼 필요가 없음
			if(visited[t]) continue;
			visited[t] = true;
			
			// 비어있거나 점유 노드에 더 들어갈 공간이 빈 경우
			if(visited[t] || dfs(d[t])){
				d[t] = x;
				return true;
			}
			
		}
		return false;
	}
}
