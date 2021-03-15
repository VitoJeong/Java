package algorithm.basic;

import java.util.Stack;

public class StronglyConnectedComponent {

	static boolean map[][];
	static boolean reverseMap[][];
	static boolean check[], check2[];
	static int n;
	static int order_len = 1;
	static int order[];
	
	public static void main(String[] args) {
		// 강하게 결합된 정점 집합(Strongly Connected Component)
		// -> 같은 SCC에 속하는 두정점은서로 도달이 가능
		
		// 방향 그래프에서만 의미가 있음
		// 코사라주 알고리즘(구현이 쉬움)
		// 타잔 알고리즘(적용이 쉬움 - DFS응용)

		n = 11;
		map = new boolean[n+1][n+1];
		reverseMap = new boolean[n+1][n+1];
		check = new boolean[n+1];
		check2 = new boolean[n+1];
		order = new int[n+1];
		
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
		
		// 시간복잡도 O(v+e)
		
	}
	
	public static void pushBack(int a, int b){
		map[a][b] = true;
		reverseMap[b][a] =true;
	}

}
