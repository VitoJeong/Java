
public class Test2 {

	public static void main(String[] args) {

		int[] stars = { 1, 6, 7, 9, 5, 3, 4, 6, 2, 8 };

		// 1 *
		// 6 ******
		// 7 *******
		// ...
		// 8 ********

		for (int i = 0; i < stars.length; i++) {
			System.out.print(stars[i] + "  ");
			for (int j = 0; j < stars[i]; j++) {
				// 별그리기
				System.out.print(" * ");
			}
			System.out.println();
		}

		System.out.println("--------------------------------");

		// 1~9 사이의 숫자중에서 숫자를 하나씩 뽑아서 (랜덤값)
		// 3자리 숫자를 만들려 한다. (단, 각자리의 숫자는 중복이 없음)
		// 358 (o) 332(x) 313(x)
		// => 1~9 중에서 중복지 않는 3자리 숫자 출력 하시오.

		// for(;;){
		// int a = (int)(Math.random()*9)+1;
		// int b = (int)(Math.random()*9)+1;
		// int c = (int)(Math.random()*9)+1;
		// if(a != b && b != c && c != a){
		// System.out.println("a : "+a);
		// System.out.println("b : "+b);
		// System.out.println("c : "+c);
		// break;
		// }
		// }
		
		// 1~9 사이의 숫자중에서 숫자를 하나씩 뽑아서 (랜덤값)
		// 3자리 숫자를 만들려 한다. (단, 각자리의 숫자는 중복이 없음)
		
		// 1~9까지의 숫자가 랜덤하게 정렬된 수를 3개 뽑는다.
		// ->
		int[] ballArr = {1,2,3,4,5,6,7,8,9,
				10,11,12,13,14,15,16,17,18,19,20,
				20,21,22,23,24,25,26,27,28,29,30,
				30,31,32,33,34,35,36,37,38,39,40,
				40,41,42
		};

		System.out.println("정렬전 배열 : ");
		for(int i=0;i<ballArr.length;i++){
			System.out.print(ballArr[i]+" ");
		}
		System.out.println();
		// 위치교환 -> 임시변수를 사용한 스왑
		
		for(int i=0;i<ballArr.length;i++){
			// 배열의 모든 요소를 랜덤하게 정렬 (0~8) 배열 인덱스
			int r = (int)(Math.random()*ballArr.length);
			int tmp =0; // 임시저장 공간
			//System.out.println("i :"+i+", r : "+r);
			
			tmp = ballArr[i];
			ballArr[i] = ballArr[r];
			ballArr[r] = tmp;			
		}
		
		System.out.println("정렬후 배열 : ");
		for(int i=0;i<ballArr.length;i++){
			System.out.print(ballArr[i]+" ");
		}
		System.out.println();
		System.out.println();
		for(int i=0;i<6;i++){
			System.out.print(ballArr[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
