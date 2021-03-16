package algorithm.basic;

import java.util.Stack;
import java.util.Vector;

public class StronglyConnectedComponent {

	static boolean map[][];
	static boolean finished[];
	static int n;
	static int node[];
	static Stack<Integer> s;
	static Vector<Vector<Integer>> scc;
	
	public static void main(String[] args) {
		// 강하게 결합된 정점 집합(Strongly Connected Component)
		// -> 같은 SCC에 속하는 두정점은서로 도달이 가능
		
		// 방향 그래프에서만 의미가 있음
		// 코사라주 알고리즘(구현이 쉬움)
		// 타잔 알고리즘(적용이 쉬움 - DFS응용)

		n = 11;
		map = new boolean[n+1][n+1];
		finished = new boolean[n+1];
		node = new int[n+1];
		s = new Stack<>();
		scc = new Vector<>();
		
		pushBack(1, 2);
		pushBack(2, 3);
		pushBack(3, 1);
		pushBack(4, 2);
		pushBack(4, 5);
		pushBack(5, 7);
		pushBack(6, 5);
		pushBack(7, 6);
		pushBack(8, 5);
		pushBack(8, 9);
		pushBack(9, 10);
		pushBack(10, 11);
		pushBack(11, 3);
		pushBack(11, 8);
		
		for (int i = 1; i <= 11; i++) {
			if(node[i]==0) dfs(i);
		}
		// 시간복잡도 O(v+e)
		System.out.println("SCC의 갯수 : " + scc.size());
		
		for (int i = 0; i < scc.size(); i++) {
			System.out.print((i+1) + "번째 SCC : ");
			scc.get(i).stream().forEach(el -> System.out.print(el+ " "));
			System.out.println();
		}
		
	}
	
	public static void pushBack(int a, int b){
		map[a][b] = true;
//		reverseMap[b][a] =true;
	}
	
	// DFS는 총 정점의 갯수만큼 실행
	public static int dfs(int x){
		node[x] = x; // 노드마다 고유한 번호를 할당
		s.push(x); // 스택에 자신을 삽입
		
		int parent = node[x];
		for (int i = 0; i < map[x].length; i++) {
			
			if(map[x][i]){
				
				if(node[i] == 0) parent = Math.min(parent, dfs(i)); // 방문하지 않은 이웃
				else if(!finished[i]) parent = Math.min(parent, node[i]); // 처리중인 이웃
				
			}
			
		}
		// 부모노드가 자신인 경우
		if(parent == node[x]) {
			
			Vector<Integer> vector = new Vector<>();
			while(!s.isEmpty()){
				int t = s.pop();
				vector.add(t);
				finished[t] = true;
				if(t == x) break;
			}
			scc.add(vector);
		}
		
		// 자신의 부모값을 반환
		return parent;
	}

}
