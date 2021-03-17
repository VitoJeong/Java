package algorithm.basic;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NetworkFlow {

	private static int n,result;
	private final static int INF = Integer.MAX_VALUE;
	private static int[][] c,f; 
	// capacity용량, flow유량
	private static boolean[][] a; // 간선의 연결 정보
	private static int[] visited; // 방문을 했는지 확인
	private static Queue<Integer> q;
	
	public static void main(String[] args) {
		// 네트워크 플로우
		// 유량/용량
		// 에드몬드 카프 알고리즘(Edmonds-Karp Algorithm)
		// -> BFS를 통해 최대 유량(Max Flow) 문제를 해결
		n = 6;
		c = new int[n+1][n+1];
		f = new int[n+1][n+1];
		a = new boolean[n+1][n+1];
		visited = new int[n+1];
		q= new LinkedList<Integer>();
		result = 0;
		
		pushBack(1, 2, 12);
		pushBack(1, 4, 11);
		pushBack(2, 3, 6);
		pushBack(2, 4, 3);
		pushBack(2, 5, 5);
		pushBack(2, 6, 9);
		pushBack(3, 6, 8);
		pushBack(4, 5, 9);
		pushBack(5, 3, 3);
		pushBack(5, 6, 4);
		
		maxFlow(1, 6);
		System.out.println(result);
		
		// 에드몬드 카프 시간복잡도 O(ve^2)
		
	}

	static void maxFlow(int start, int end){
		while(true){
			Arrays.fill(visited, -1);
			q.offer(start);
			while(!q.isEmpty()){
				int x = q.poll();
				for (int i = 0; i < a[x].length; i++) {
					// 방문하지 않은 노드 중에 용량이 남은 경우
					if(a[x][i] && c[x][i] - f[x][i] > 0 && visited[i] == -1){
						q.offer(i);
						visited[i] = x; // 경로를 기억
						if(i == end) break;
					}
				}
			}
			if(visited[end] == -1) break;
			int flow = INF;
			// 거꾸로 최소 유량 탐색
			for (int i = end; i > start; i = visited[i]) {
				flow = Math.min(flow, c[visited[i]][i] - f[visited[i]][i]);
			}
			for (int i = end; i > start; i = visited[i]) {
				f[visited[i]][i] += flow;
				f[i][visited[i]] -= flow;
			}
			result += flow;
		}
		
		
	} // end of maxFlow()
	
	static void pushBack(int x, int y, int z){
		a[x][y] = true;
		a[y][x] = true;
		c[x][y] = z;
	}
}
