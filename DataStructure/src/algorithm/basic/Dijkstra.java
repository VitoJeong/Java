package algorithm.basic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {

	final static int INF = 1000000000;
	final static int[][] ARR = { 
			{ 0, 2, 5, 1, INF, INF }, 
			{ 2, 0, 3, 2, INF, INF }, 
			{ 5, 3, 0, 3, 1, 5 },
			{ 1, 2, 3, 0, 1, INF }, 
			{ INF, INF, 1, 1, 0, 2 }, 
			{ INF, INF, 5, INF, 2, 0 } 
			};
	
	// 인접리스트 사용
	static int v,e,k;
	static List<List<Node>> graph;
	static int[] distance, prev;
	static boolean[] visited;
	
	static class Node implements Comparable<Node>{
		private int idx;
		private int weight;
		
		public Node(int idx, int weight) {
			super();
			this.idx = idx;
			this.weight = weight;
		}

		@Override
		public int compareTo(Node o) {
			return this.weight - o.weight;
		}
		
	}

	public static void main(String[] args) {
		// 다익스트라 알고리즘(Dijkstra algorithm)
		// -> 최단 경로(Shortest path) 탐색 알고리즘(인공위성, GPS에서 많이 사용)
		// -> 특정한 하나의 정점에서 다른 모든 정점으로 가는 최단 경로를 알려줌(음의 간선 포함할 수 없음)

		// 다익스트라 알고리즘의 동작 과정
		// 1. 출발 노드 설정
		// 2. 출발 노드를 기준으로 각 노드의 최소비용 저장
		// 3. 방문하지 않은 노드 중에서 가장 비용이 적게드는 노드 선택
		// 4. 해당 노드를 거쳐 특정한 노드로 가는 경우를 고려하여 최소비용 갱신
		// 5. 3번 4번 과정 반복

		int num = 6;

		// 방문한노드
		boolean[] v = new boolean[num];
		// 최단거리
		int[] d = new int[num];

//		dijkstra(num, 0, d, v);
//		for (int i = 0; i < d.length; i++) {
//			System.out.println((i+1)+"노드까지의 최단거리"+d[i]);
//		}

		
		// 인접리스트를 이용
		Dijkstra.v = 8; k = 1;
		graph = new ArrayList<List<Node>>();
		distance = new int[Dijkstra.v+1];
		prev = new int[Dijkstra.v+1];
		visited = new boolean[Dijkstra.v+1];
		input(Dijkstra.v);
		dijkstra(k);
		
		for (int i = 1; i < distance.length; i++) {
			System.out.print(distance[i]+ " ");
		}
		System.out.println();
		for (int i = 1; i < distance.length; i++) {
			System.out.print(prev[i]+ " ");
		}
	}

	// 가장 최소거리를 가지는 정점을 반환
	static int getSmallIndex(boolean[] v, int[] d) {
		int min = INF;
		int index = 0;
		for (int i = 0; i < d.length; i++) {
			if (d[i] < min && !v[i]) {
				min = d[i];
				index = i;
			}
		}

		return index;
	}

	// 다익스트라를 수행하는 함수
	// 선형 탐색 이용 -> 시간복잡도 O(N^2)
	static void dijkstra(int num, int start, int[] d, boolean[] v) {
		for (int i = 0; i < num; i++) {
			d[i] = ARR[start][i];
		}
		v[start] = true;

		for (int i = 0; i < num - 2; i++) { // 첫 노드, 마지막 노드 제외(-2)
			int current = getSmallIndex(v, d);
			System.out.println(current+1);
			v[current] = true;
			for (int j = 0; j < 6; j++) {
				if (!v[j]) {
					if (d[current] + ARR[current][j] < d[j]) {
						d[j] = d[current] + ARR[current][j];
						System.out.println("to"+(j+1)+"node change : "+ d[j]);
					}
				}
			}
		}
	} // End of dijkstra 
	
	
	// 인접리스트를 이용하는 다익스트라 -> 시간복잡도O(NlogN)
	static void dijkstra(int start){
		PriorityQueue<Node> pq = new PriorityQueue<>();
		
		Arrays.fill(distance, Integer.MAX_VALUE);
		
		distance[k] = 0;
		pq.add(new Node(k,0));
		
		while(!pq.isEmpty()){
			int cur = pq.poll().idx;
			
			if(visited[cur]) continue;
			visited[cur] = true;
			
			for(Node node : graph.get(cur)){
				if(distance[node.idx] > distance[cur] + node.weight) {
					distance[node.idx] = distance[cur] + node.weight;
					prev[node.idx] = cur;
					pq.add(new Node(node.idx, distance[node.idx]));
				}
			}
		}
	} // End of dijkstra()
	
	static void input(int v){
		for (int i = 0; i <= v; i++) {
			graph.add(new ArrayList<>());
		}
		graph.get(1).add(new Node(2,3));
        graph.get(1).add(new Node(5,4));
        graph.get(1).add(new Node(4,4));
        graph.get(2).add(new Node(3,2));
        graph.get(3).add(new Node(4,1));
        graph.get(4).add(new Node(5,2));
        graph.get(5).add(new Node(6,4));
        graph.get(4).add(new Node(7,6));
        graph.get(7).add(new Node(6,3));
        graph.get(3).add(new Node(8,3));
        graph.get(6).add(new Node(8,2));
	}
}
