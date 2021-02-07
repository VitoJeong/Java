package algorithm.basic;

public class InsectionSort {

	public static void main(String[] args) {
		// 삽입정렬을 통해 오름차순으로 정렬하도록 하는 프로그램 작성
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		for(int i=0;i<arr.length-1;i++){
			int j =i;
			while(arr[j] > arr[j+1]){
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp; 
				j--;
			}
		}
		
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		
		// O(n^2)의 시간복잡도
		// 앞의 데이터는 이미 정렬 되어있다고 판단 -> 필요할 때만 삽입
		// -> 데이터가 이미 거의 정렬된 상태에 한해서는 어떤 알고리즘보다 빠름!
	}

}
