package algorithm.basic;


public class DepthFirstSearch {
	
	static int num = 7;
	static boolean[] visited = new boolean[num+1];
	static int[][] map = new int[num+1][num+1];

	public static void main(String[] args) {
		// DFS 깊이를 우선으로 하여 탐색을 수행하는 탐색 알고리즘
		// 진행할때 Stack을 필요로 함
		map[1][2] = 1;
		map[1][3] = 1;
		map[2][3] = 1;
		map[2][4] = 1;
		map[2][5] = 1;
		map[3][6] = 1;
		map[3][7] = 1;
		map[4][5] = 1;
		map[6][7] = 1;
		
		System.out.println("dfs");
		dfs(1);
	}

	static void dfs(int x){
		if(visited[x]) return;
		visited[x] = true;
		System.out.print(x+" ");
		for (int i = 0; i < map[x].length; i++) {
			if(map[x][i] == 1 ){
				dfs(i);
			}
		}
//		Stack<Integer> stack = new Stack<>();
		
	}
}
