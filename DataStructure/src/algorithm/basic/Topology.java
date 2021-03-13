package algorithm.basic;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Topology {
	public static int[][] graph; // 그래프를 표현
	public static int[] indegree; // 차수를 저장
	public static ArrayList<Integer> sortedGraph; // 결과

	public static void main(String[] args) {
		// 위상정렬(Topology Sort)
		// -> 순서가 정해져있는 작업을 차례로 수행할때 순서를 결정해주는 알고리즘
		// DAG(Directed Acyclic Graph)
		int num = 7;
		graph = new int[num+1][num+1];
		indegree = new int[num+1];
		graph[1][2]++;
		graph[1][5]++;
		graph[2][3]++;
		graph[3][4]++;
		graph[4][6]++;
		graph[5][6]++;
		graph[6][7]++;
		topologicalSortBFS();
		
		sortedGraph = new ArrayList<>();
		bfs();

		// 위상정렬의 결과
		// 1. 그래프가 위상 정렬이 가능한지
		// 2. 위상 정렬이 가능하다면 그 결과는 무엇인지
		sortedGraph.forEach(i -> System.out.print(i+" "));

	}

	public static void bfs() {

		Queue<Integer> q = new LinkedList<Integer>();

		for (int i = 1; i < indegree.length; i++) {
			System.out.println(indegree[i]);
			if (indegree[i] == 0) {
				// -1로 만들어 큐에 다시 들어 가지않도록 만듬
				indegree[i]--;
				sortedGraph.add(i);
				q.add(i);
			}
			if(q.isEmpty() && i == indegree.length-1) {
				System.out.println("사이클이 생성된 그래프입니다.");
			}
			else if(i == indegree.length-1){
				System.out.println("사이클이 없는 그래프입니다.");
			}
		}

		while (!q.isEmpty()) {
			// 큐에 있는 노드는 차수 0인노드, 따라서, 해당 노드가 없어졌다고 보고,
			// 해당 노드와 연결된 간선과, 연결된 노드의 차수를 줄여줌.
			int node = q.poll();

			for (int n = 1; n < graph.length; n++) {
				if (graph[node][n] == 1) { // 연결된 노드면
					graph[node][n] = 0; // 연결을 제거 
					indegree[n]--; // 노드의 차수를 제거
				}
				
				if(indegree[n]==0){
					indegree[n]--;
					sortedGraph.add(n);
					q.add(n);
				}
			}
		}
	} // End of bfs()
	
	public static void topologicalSortBFS(){
		// cerate indegree, 차수 만들기
		for (int i = 1; i < graph.length; i++) {
			for (int j = 1; j < graph.length; j++) {
				if(graph[i][j] == 1){ // j로 가는 위상이 하나 존재한다면
					indegree[j]++; // 차수를 증가
				}
			}
		}
	}
}
