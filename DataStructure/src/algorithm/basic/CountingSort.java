package algorithm.basic;

public class CountingSort {

	public static void main(String[] args) {
		// 계수정렬을 통해 5이하 자연수들을 오름차순으로 정렬하도록 하는 프로그램 작성
		int[] arr = {1,3,2,4,3,2,5,3,1,2,
					3,4,4,3,5,1,2,3,5,2,
					3,1,4,3,5,1,2,1,1,1};
		int[] count = new int[5];
		
		// 크기를 기준으로 개수를 세면 어떨까?
		for(int i=0;i<count.length;i++){
			count[i]=0;
		}
		for(int i=0;i<arr.length;i++){
			count[arr[i]-1]++;
		}
		for(int i=0;i<count.length;i++){
			for(int j=0;j<count[i];j++){
				System.out.print(i+1);
			}
		}
		
		// 계수정렬의 시간 복잡도 -> O(N)
		// 범위 조건이 있는 경우 제일 빠름
	}

}
