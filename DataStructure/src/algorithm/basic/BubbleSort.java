package algorithm.basic;

public class BubbleSort {
	
	public static void main(String[] args){
		
		// 버블정렬을 통해 오름차순으로 정렬하도록 하는 프로그램 작성
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		// 옆의 값과 비교하여 앞으로 보내면 어떨까?
//		for(int i=0;i<arr.length;i++){
//			
//			for(int j=0;j<arr.length-1-i;j++){
//				if(arr[j]>arr[j+1]){
//					int temp = arr[j];
//					arr[j] = arr[j+1];
//					arr[j+1] = temp;
//				}
//			}
//		}
		
		for(int i=arr.length-1;i>=0;i--){
			for(int j=0;j<i;j++){
				
				if(arr[j]>arr[j+1]){
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		// O(n^2) 시간복잡도
		// 더 비효율적 => 계속 위치를 이동하는 연산을 수행해야 하기 때문
	}
}
