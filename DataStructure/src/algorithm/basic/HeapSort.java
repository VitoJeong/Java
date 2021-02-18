package algorithm.basic;

public class HeapSort {

	public static void main(String[] args) {
		// 힙정렬을 통해 오름차순으로 정렬하도록 하는 프로그램 작성
		int[] arr = {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
		
		// 전체 트리구조를 최대 힙 구조로 바꾼다.
		for(int i=0; i< arr.length;i++){
			// 자식노드
			int c=i;
			do {
				int root=(c-1)/2;
				if(arr[root] < arr[c]) {
					int temp=arr[root];
					arr[root]=arr[c];
					arr[c]=temp;
				}
				c=root;
			}while(c!=0);
		}
		System.out.print("최대 힙 구조 : ");
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		// 크기를 줄여가며 반복적으로 힙을 구성
		for(int i=arr.length-1;i>=0;i--){
			int temp=arr[0];
			arr[0]=arr[i];
			System.out.println(arr[0]);
			arr[i]=temp;
			int root=0;
			int c=1;
			do {
				c=2*root+1;
				// 자식 중에 더 큰 값을 찾기
				if(c<i-1 && arr[c] < arr[c+1]){
					c++;
				}
				// 루트보다 자식이 더 크다면 교환
				if(c<i && arr[root] < arr[c]){
					int temp2=arr[root];
					arr[root]=arr[c];
					arr[c]=temp2;
				}
				root = c;
			} while(c<i);
		}
		
		for(int i=0; i<arr.length; i++){
			System.out.print(arr[i]+" ");
		}
		
		// Heap -> 최솟값이나 최댓값을 빠르게 찾아내기 위해 완전 이진 트리를 기반으로 하는 트리
		// 최대 힙 구조 -> 모든 부모노드가 자식노드보다 큰 구조
		// 병합정렬과 다르게 별도로 추가적인 배열이 필요하지 않음 -> 메모리 효율성 증가
		// 항상 O(NlogN)의 시간복잡도 
	}

}
