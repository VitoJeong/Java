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
		
		// 퀵 정렬의 평균 시간 복잡도는 O(nlogn)
		// 최악의 경우 -> 피벗을 잘못 설정할 경우 O(n^2)

	}
	
	public static void quickSort(int[] arr, int start, int end){
		System.out.println(start + "Reset");
		if(start>=end) return; // 원소가 1개인 경우
		
		int pivot = start;
		int i = start+1; // 오른쪽으로 이동하며 pivot보다 큰 값을 찾기 위한 인덱스
		int j = end; // 왼쪽으로 이동하며 pivot보다 작은 값을 찾기 위한 인덱스
		int temp;
		
		while(i <= j){ // 엇갈릴 때 까지 반복
			while(i <= end && arr[i] <= arr[pivot]){
			// pivot보다 큰 값의 인덱스를 구할 때까지
				i++;
			}
			while(arr[j] >= arr[pivot] && j > start){
			// pivot보다 작은 값의 인덱스를 구할 때까지
				j--;
			}
			if(i > j){ // 엇갈렷다면 pivot과 교체
				System.out.println("i : " + i);
				System.out.println("j : " + j);
				temp = arr[j];
				arr[j] = arr[pivot];
				arr[pivot] = temp;
			}else{
				System.out.println("i : " + i);
				System.out.println("j : " + j);
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
			for(int a=0;a<arr.length;a++){
				System.out.print(arr[a]+" ");
			}
			System.out.println();
		}
		quickSort(arr, start, j-1);
		quickSort(arr, j+1, end);
	}
}
