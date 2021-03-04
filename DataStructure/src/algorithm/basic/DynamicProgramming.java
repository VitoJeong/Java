package algorithm.basic;

public class DynamicProgramming {

	static int[] d = new int[100];

	public static void main(String[] args) {
		// 다이나믹 프로그래밍
		// -> 하나의 문제는 단 한번만 풀도록 하는 알고리즘
		// 단순 분할 정복으로 풀게 되면 비효율적인 계산이 발생 (피보나치 수열 등)
		// D[15] = D[14] + D[13]
		// D[14] = D[13] + D[12], D[13] = D[12] + D[11] ...
		// 연산횟수는 2^N

		// 다이나믹 프로그래밍을 사용할 수 있는 경우
		// 1. 큰 문제를 작은 문제로 나눌 수 있다.
		// 2. 작은 문제에서 구한 정답은 그것을 포함하는 큰 문제에서도 동일함
		System.out.println("피보나치 수열 30 : " + dp(30)); // 50을 넣게되면 int의 범위를 초과

		// 다이나믹 프로그래밍을 사용하면 
		// -> 메모이제이션 기법을 사용하여 n번의 연산만으로 결과를 구할 수 있다.
	}

	static int dp(int x) {

		if (x == 1 || x == 2)
			return 1;

		// 연산이 처리된 적이 있다면 전에 연산된 결과값을 반환
		if (d[x] != 0)
			return d[x];
		return d[x] = dp(x - 1) + dp(x - 2);
	}

}
