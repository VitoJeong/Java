package algorithm.basic;

public class MergeSort {

//	static int[] sorted = new int[10];
	
	public static void main(String[] args) {
		// 병합정렬을 통해 오름차순으로 정렬하도록 하는 프로그램 작성
		int[] arr = {3, 7, 8, 1, 5, 9, 6, 10, 2, 4};
		
		
		// 일단 반으로 나누고 나중에 합치면 어떨까?
		// 합치는 순간에 정렬
		mergeSort(arr, 0, arr.length-1);
		System.out.println();
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		// 병합정렬O(nlogn)

	}
	
	static void merge(int[] arr, int[] sorted, int m, int middle, int n){
		int i = m;
		int j = middle+1;
		int k = m;
		
		// 작은 순서대로 배열에 삽입
		while(i <= middle && j <= n){
			if(arr[i] <= arr[j]){
				sorted[k] = arr[i];
				i++;
			}
			else{
				sorted[k] = arr[j];
				j++;
			}
			k++;
		}
		
		// 두 개의 배열 중 하나가 모두 정렬된 후, 다른 한 쪽의 남은 배열의 데이터도 삽입
		if(i>middle){
			while(j<=n){
				sorted[k]=arr[j];
				k++;
				j++;
			}
		} else {
			while(i<=middle){
				sorted[k]=arr[i];
				k++;
				i++;
			}
		}
		
		// 정렬된 배열을 삽입
		for(int t=m;t<=n;t++){
			arr[t] = sorted[t];
		}
	}
	
	static void mergeSort(int a[], int m, int n){
		int[] sorted = new int[10];
		// 크기가 1보다 큰 경우
		if(m<n){
			int middle = (m+n)/2;
			mergeSort(a, m, middle);
			mergeSort(a, middle+1, n);
			merge(a, sorted, m, middle, n);
		}
	}
}
