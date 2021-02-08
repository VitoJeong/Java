package algorithm.basic;

public class QuickSort {

	public static void main(String[] args) {
		// 퀵정렬을 통해 오름차순으로 정렬하도록 하는 프로그램 작성
		int[] arr = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
		int[] arr2 = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		// 특정한 값을 기준으로 큰 숫자와 작은 숫자르 나누면 어떨까?
		// Pivot(피벗) - 퀵정렬의 기준값
		quickSort(arr, 0, 9);
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}

	}
	
	public static void quickSort(int[] data, int start, int end){
		if(start >= end) {return;}
		
		int key = start; // key -> Pivot
		int i = start+1; // 왼쪽에서 이동하며 key 보다 큰 값을 찾기 위한 인덱스
		int j = end; // 오른쪽에서 이동하며 작은 값을 찾기 위한 인덱스
		int temp;
		
		// 엇갈릴때 까지 반복
		while(i <= j){
			while(i<= end && data[i] <= data[key]){ // 키 값보다 큰 값을 만날 때까지 오른쪽으로 이동
				i++;
			}
			while(data[j] >= data[key] && j > start){
				j--;
			}
			
			if(i > j){ // 엇갈린 상태라면
				// 키 값과 교체
				temp = data[j];
				data[j] = data[key];
				data[key] = temp;
			} else {
				temp = data[i];
				data[i] = data[j];
				data[j] = temp;
			}
		}
		
		quickSort(data, start, j-1);
		quickSort(data, j+1, end);
	}
	
	// 퀵 정렬의 평균 시간 복잡도는 O(nlogn)
	// 최악의 경우 -> 피벗을 잘못 설정할 경우 O(n^2)
}
