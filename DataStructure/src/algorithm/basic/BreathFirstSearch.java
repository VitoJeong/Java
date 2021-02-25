package algorithm.basic;

import java.util.LinkedList;
import java.util.Queue;

public class BreathFirstSearch {
	
	static int num = 7;
	static boolean[] visited = new boolean[num];
	static int[][] map = new int[num+1][num+1];

	public static void main(String[] args) {
		// BFS 너비를 우선으로 하여 탐색을 수행하는 탐색 알고리즘
		// 진행할때 Queue를 필요로 함
		map[1][2] = 1;
		map[1][3] = 1;
		map[2][4] = 1;
		map[3][6] = 1;
		map[4][5] = 1;
		map[5][6] = 1;
		
		System.out.println("bfs");
		bfs(1);
	}

	static void bfs(int start){
		Queue<Integer> q = new LinkedList<Integer>();
		q.offer(start);
		visited[start] = true;
		while(!q.isEmpty()){
			int x = q.poll();
			System.out.print(x+ " ");
			for (int i = 0; i <= num; i++) {
				if(map[x][i] == 1 && !(visited[i])){
					q.offer(i);
					visited[i] = true;
				}
			}
		}
	}
}
