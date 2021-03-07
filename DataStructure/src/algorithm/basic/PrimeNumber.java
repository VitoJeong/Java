package algorithm.basic;

public class PrimeNumber {

	public static void main(String[] args) {
		// 소수 : 양의 약수를 두 개만 가지는 자연수 (2,3,5,7,11 ...)

		// 에라토스테네스의 체 -> 대표적인 소수(Prime Number) 판별 알고리즘
		// 소수를 대량으로 빠르고 정확하게 구하는 방법

		System.out.println(isPrimeNumber(4));
		System.out.println(isPrimeNumber(5));

		System.out.println(isPrimeNumberWithSqrt(97));
		System.out.println(isPrimeNumberWithSqrt(100));
		
		primeNuberSieve(10000);
	}

	static boolean isPrimeNumber(int x) {

		for (int i = 2; i < x; i++) {
			if (x % i == 0)
				return false;
		}

		return true;
	}
	// 기본적인 소수 판별 알고리즘
	// 시간복잡도 -> O(n)
	
	static boolean isPrimeNumberWithSqrt(int x) {

		int end = (int) Math.sqrt(x);
		
		for (int i = 2; i <= end; i++) {
			if (x % i == 0)
				return false;
		}

		return true;
	}
	// 제곱근을 사용한 소수판별
	// 시간복잡도 -> O(n^(1/2))

	static void primeNuberSieve(int x){
		
		int[] arr = new int[x+1];
		int num = arr.length;
		
		for (int i = 2; i < num; i++) {
			arr[i] = i;
		}
		
		for (int i = 2; i < num; i++) {
			if(arr[i]==0) continue;
			for(int j=i+i;j<num;j+=i){
				arr[j] =0;
			}
		}
		System.out.println("x이하의 소수 목록");
		for (int i = 2; i < num; i++) {
			if(arr[i]!=0) System.out.print(i+" ");
		}
	}
	//

}
