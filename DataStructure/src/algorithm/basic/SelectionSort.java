package algorithm.basic;

public class SelectionSort {

	public static void main(String[] args) {
		// 선택정렬을 통해 오름차순으로 정렬하도록 하는 프로그램 작성
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		// 가장 작은 것을 선택해서 제일 앞으 보내면 어떨까?
		// 선택정렬
//		for(int i=0; i<arr.length; i++){
//			int min = 100;
//			int index = 0; // 최솟값의 위치
//			
//			for(int j=i;j < arr.length;j++){
//				if(min> arr[j]){
//					min = arr[j];
//					index = j;
//				}
//			}
//			
//			int temp = arr[i];
//			arr[i] = arr[index];
//			arr[index] = temp;
//		}
//		
		
		for(int i=0;i<arr.length;i++){
			int min = 99999;
			int idx = 0; // 최솟값의 위치
			
			for(int j=i;j<arr.length;j++){
				if(min>arr[j]){
					min = arr[j];
					idx = j;
				}
			}
			
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
			
			
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.println(arr[i]);
		}
		// 최소한의 연산 횟수
		// 10 * (10 + 1) / 2 = 55
		// n * (n + 1) / 2 
		// => O(n^2) 효율적이지 않은 시간복잡도의 알고리즘
	}

}
