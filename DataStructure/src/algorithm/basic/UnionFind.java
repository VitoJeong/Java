package algorithm.basic;

public class UnionFind {

	public static void main(String[] args) {
		// Union Find(합집합 찾기) -> 서로소 집합(Disjoin-Set) 알고리즘과 동일
		// 여러 개의 노드가 존재할 때 두 개의 노드를 선택해서, 현재 이 두 노드가 서로 같은 그래프에 속하는지 판별
		int arr[] = new int[11];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = i;
		}
		
		unionParent(arr, 1, 2);
		unionParent(arr, 2, 3);
		unionParent(arr, 3, 4);
		unionParent(arr, 5, 6);
		unionParent(arr, 6, 7);
		unionParent(arr, 7, 8);
		System.out.println("1과 5는 연결되어 있나요?");
		System.out.println(findParent(arr, 1, 5));
		unionParent(arr, 1, 5);
		System.out.println("1과 5는 연결되어 있나요?");
		System.out.println(findParent(arr, 1, 5));
		System.out.println("1과 6는 연결되어 있나요?");
		System.out.println(findParent(arr, 1, 6));
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
