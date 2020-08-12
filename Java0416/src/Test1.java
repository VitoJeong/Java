
public class Test1 {

	public static void main(String[] args) {
		// 2차원 배열 (다차원 배열) : 행렬표시 가능(표)
		// => 반복문의 개수 증가 : 이중for문
		// 1. new 연산자
		// 2. 직접 초기화

		// 5 X 3 행렬을 표현하기위한 2차원 배열 생성(정수형)
		// int[][] arr = new int[5][3];
		int[] arr[] = new int[5][3];

		arr[0][0] = 10;
		arr[0][1] = 90;
		arr[0][2] = 70; // 0행
		arr[1][0] = 60;
		arr[1][1] = 80;
		arr[1][2] = 65; // 1행
		arr[2][0] = 55;
		arr[2][1] = 60;
		arr[2][2] = 85; // 2행
		arr[3][0] = 90;
		arr[3][1] = 75;
		arr[3][2] = 95; // 3행
		arr[4][0] = 60;
		arr[4][1] = 30;
		arr[4][2] = 80; // 4행

		// 2차원 배열의 모양 그대로 출력
		for (int row = 0; row < 5; row++) { // row : 0~4
			for (int col = 0; col < 3; col++) { // col : 0~2
				// 총 실행 횟수? 15
				System.out.print(arr[row][col] + "\t");
			}
			System.out.println();
		}

		System.out.println("---------------------------------");

		int[][] score = { 
				{ 85, 60, 70 }, // 0행
				{ 90, 95, 80 }, // 1행
				{ 75, 80, 100 }, // 2행
				{ 80, 70, 95 }, // 3행
				{ 100, 65, 80 } // 4행
		};
		// int[][] score = { { 85, 60, 70 }, { 90, 95, 80 }, { 75, 80, 100 }, { 80, 70, 95 }, { 100, 65, 80 } };
		
		// 학생별 점수 계산
		int sum;
		for(int row=0;row<5;row++){
			sum = 0;
			for(int col=0;col<3;col++){
				sum += score[row][col];
			}
			System.out.println((row+1)+"번 학생 sum : "+sum);
		}
		System.out.println("---------------------------------");
		// 과목별 점수 출력
		int[] subject = new int[3];
		
		for(int col=0;col<3;col++){ // col 0~2
			for(int row=0;row<5;row++){
				// 열별로 정보를 저장 
				subject[col] += score[row][col];
			}
			System.out.println("과목 총합 : "+subject[col]);
		}
		
		System.out.println("2번 과목의 총합 : "+subject[2]);
		
		System.out.println("---------------------------------");
		/* 배열의 선언,초기화 모습 (o,x)
		1. int[] arr[];
		2. int[] arr = {1,2,4,};
		3. int[] arr = new int[5];
		4. int[] arr = new int[4]{1,2,3,4}; (x)
		4-1.  int[] arr = new int[]{1,2,3,4}; (o)
		5. int arr[5];
		6. int[] arr[] = new int[3][]; (o)
		6-1. int[] arr[] = new int[][3]; (x)
		*/
		
		int[][] arr2 ={
				{5,5,5,5},
				{10,10,10},
				{20,20,20,20},
				{30,30}
		};
		// System.out.println(arr2[3][2]);
		System.out.println(arr2[3].length);
		// -> 배열이름[위치].length : (2차원배열)해당 행의 길이를 측정
	    System.out.println(arr2.length);
	    // -> 배열이름.length : (2차원배열) 행의 개수를 측정
	    
	   System.out.println("------------------------------");
	   // 2차원 배열의 모든 요소의 합, 평균
	   int[][] arr3 ={
			   {5, 5, 5, 5},
			   {10,10,10,10},
			   {20,20,20,20},
			   {30,30,30,30}			   
	   };
	   
	   int total = 0;
	   double avg = 0;
	   
	   for(int r=0;r<4;r++){
		   for(int c=0;c<4;c++){
			   total += arr3[r][c];
		   }
	   }
	   
	   
	   
	   System.out.println("총합 : "+total);
	   System.out.println("평균 : "+total/(double)(arr3.length*arr3[0].length));
	   
	   // * int보다 크기가 작은 데이터타입의 경우 연산시 int(기본형)변경후 연산
	   // * 데이터 크기가 큰쪽에 따라 연산이 처리됨
	   //   int / double => double
	   
	   
	   int[] arr4 = {10,20,30,40,50};
	   // 합 출력
	   sum = 0;
	   for(int i=0;i<arr4.length;i++){
		   sum += arr4[i];
	   }
	   System.out.println("sum : "+sum);
	   
	   
		
		
		
		
		
		

	}

}
