package algorithm.basic;

import java.util.ArrayList;
import java.util.List;

public class Kruskal {

	public static void main(String[] args) {
		// 크루스칼 알고리즘(Kruskal Algorithm) 
		// -> 가장 적은 비용으로 모든 노드를 연결하기 위해 사용(최소 비용 신장 트리)
		// 노드 = 정점 / 간선 = 거리
		// 간선의 수 = 노드의 수 - 1
		// 간선을 거리가 짧은 순서대로 그래프에 포함시키면 어떨까?
		// * 최소 비용 신장트리에서는 사이클이 발생하지 않는다.
		// 1. 정렬된 순서에 맞게 그래프에 포함시킨다.
		// 2. 사이클 테이블을 확인한 후, 사이클이 형성되지 않으면 포함시킨다.
		List<Edge> edgeList = new ArrayList();
		edgeList.add(new Edge(1, 7, 12));
		edgeList.add(new Edge(1, 4, 28));
		edgeList.add(new Edge(1, 2, 67));
		edgeList.add(new Edge(1, 5, 17));
		edgeList.add(new Edge(2, 4, 24));
		edgeList.add(new Edge(2, 5, 62));
		edgeList.add(new Edge(3, 5, 20));
		edgeList.add(new Edge(3, 6, 37));
		edgeList.add(new Edge(4, 7, 13));
		edgeList.add(new Edge(5, 6, 45));
		edgeList.add(new Edge(5, 7, 73));
		
		// 간선의 비용을 기준으로 오름차순 정렬
		edgeList.sort(null);
		
		// 각 정점이 포함된 그래프가 어디인지 저장
		int[] parent = new int[7];
		for (int i = 0; i < parent.length; i++) {
			parent[i] = i;
		}
		
		int sum = 0;
		for (int i = 0; i < edgeList.size(); i++) {
			// 사이클이 발생하지 않는 경우 그래프에 포함
			if(!findParent(parent, edgeList.get(i).node[0] -1, edgeList.get(i).node[1] -1)){
				sum+=edgeList.get(i).distance;
				unionParent(parent, edgeList.get(i).node[0] -1, edgeList.get(i).node[1] -1);
			}
		}

		System.out.println(sum);
	}

	// 부모 노드를 찾는 함수
	static int getParent(int[] parent, int x) {
		System.out.println("부모노드 : " + parent[x] + " x : " + x);
		if (parent[x] == x)
			return x;
		return parent[x] = getParent(parent, parent[x]);
	}

	// 두 부모 노드를 합치는 함수
	static void unionParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		// 더 작은 노드를 부모 노드로 저장
		if (a < b)
			parent[b] = a;
		else
			parent[a] = b;

	}

	// 같은 부모를 가지는지 확인
	static boolean findParent(int[] parent, int a, int b) {
		a = getParent(parent, a);
		b = getParent(parent, b);
		if (a == b)
			return true;
		else
			return false;

	}
	
}

class Edge {
	int[] node = new int[2];
	int distance;
	public Edge(int a, int b, int distance){
		this.node[0] = a;
		this.node[1] = b;
		this.distance = distance;
	}
	
	boolean operator(Edge edge){
		return this.distance < edge.distance;
	}
	
}
