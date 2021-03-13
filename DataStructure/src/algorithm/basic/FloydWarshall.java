package algorithm.basic;

public class FloydWarshall {

	static int num;
	static final int INF = Integer.MAX_VALUE;
	
	static int[][] arr = {
			{0, 0, 0, 0, 0},
			{0, 0, 5, INF, 8},
			{0, 7, 0, 9, INF},
			{0, 2, INF, 0, 4},
			{0, INF, INF, 3, 0}
	};
	
	public static void main(String[] args) {
		// 플로이드 와샹 알고리즘(Floyd Warshall Algorithm)
		// -> 모든 정점에서 모든정점으로의 최단경로
		// 시간복잡도 : O(n^3)
		num = 4;
		int[][] d = new int[num+1][num+1];
		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d.length; j++) {
				d[i][j] = arr[i][j];
			}
		}
		
		// k = 거쳐가는 노드
		for(int k=1; k < arr.length;k++){
			// i = 출발 노드
			for(int i=1; i < arr.length;i++){
				// j = 도착 노드
				for(int j=1; j < arr.length;j++){
					int temp = d[i][k]+d[k][j];
					if(temp > 0 && temp < d[i][j]){
						d[i][j] = d[i][k]+d[k][j];
					}
				}
			}
		}
		
		for (int i = 1; i < d.length; i++) {
			for (int j = 1; j < d.length; j++) {
				System.out.print(d[i][j]+" ");
			}
			System.out.println();
		}
	}

}
