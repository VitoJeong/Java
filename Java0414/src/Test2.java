
public class Test2 {

	public static void main(String[] args) {
		// 배열 : 동일한 타입의 데이터를 한번에 저장 할수 있는 공간(연속된 공간)
		// 1) new 연산자를 사용
		// 2) 배열을 직접 초기화

		// 데이터타입[] 변수명 = new 데이터타입[크기];
		// int a;
		// int a;
		// int a;
		// int a;
		// int a;

		// int array[] = new int[5];
		// int arr[5]; (x) C언어 배열사용

		// * 배열은 참조형 타입이다.
		// * 배열은 각각의 방 인덱스를 가지고 있다. (항상 0부터 시작)
		// * 배열의 한칸은 변수처럼 사용이 가능( 해당 배열타입의 값을 저장 가능 )
		// * 배열에 이름을 사용해서 접근(사용) array[위치]
		// * 배열 한칸의 정보를 요소라고 한다.

		int[] array = new int[5];
		// -> 5칸 짜리 배열을 생성한다. => 5개의 변수를 저장할수 있는 공간
		array[0] = 10;
		array[1] = 20;
		array[2] = 30;
		array[3] = 50;
		array[4] = 70;
		System.out.println(array[0]);
		System.out.println(array[1]);
		System.out.println(array[2]);
		System.out.println(array[3]);
		System.out.println(array[4]);
		System.out.println("----------------------");
		for (int i = 0; i < 5; i++) {
			System.out.println(array[i]);
		}
		System.out.println("----------------------");
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		System.out.println("array.length : " + array.length);
		// => 배열의 요소의 개수(길이)

		// "1번 0번 인덱스 데이터 : 00"
		// "2번 1번 인덱스 데이터 : 00"
		// ...
		// 배열의 모든 요소를 출력
		System.out.println("--------------------------------");
		for (int i = 0; i < array.length; i++)
			System.out.println((i + 1) + "번, " + i + "번 인덱스 데이터 : " + array[i]);

		// double형 타입의 배열 생성( 요소를 3개 저장 가능 )
		// 11.2, 5.5, 36.1
		// => "0번방 : 00"
		// => "1번방 : 00"
		// => "2번방 : 00"
		double[] dNum = new double[3];
		dNum[0] = 11.2;
		dNum[1] = 5.5;
		dNum[2] = 36.1;

		for (int i = 0; i < dNum.length; i++) {
			System.out.println(i + "번방 : " + dNum[i]);
		}
		// 2. 내용을 초기화 해서 배열 생성
		int[] arr2 = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		// 학생의 점수 score 5개를 저장 (정수형int)
		// 95, 70 ,80 ,75,100
		// => 이때 학생의 점수 총합, 평균 계산
		int[] score = { 95, 70, 80, 75, 100 };
		// System.out.println(score.length);
		int sum = 0;
		for (int i = 0; i < score.length; i++) {
			sum += score[i];
		}
		System.out.println("sum : " + sum);
		// System.out.println("Avg : "+(sum/5.0));
		System.out.println("Avg : " + (sum / (double) score.length));

		System.out.println("-------------------------------------");
		// 실수형데이터를 저장하는 배열 data를 생성한다.
		// 9.5,7.2,69.6,45.3,103.7
		// 이때 해당 배열의 값중에서 가장 큰값을 출력
		double[] data = { 9.5, 7.2, 69.6, 45.3, 103.7,45.9,999.6 };
		
		//double max = 0.0;
		double max = data[0];
		
		for(int i=1;i<data.length;i++){
			//System.out.println(data[i]);
			if(max < data[i]){
				max = data[i];
			}
		}
		System.out.println("최대값 : "+max);
		
		

	}

}
