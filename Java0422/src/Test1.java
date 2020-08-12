import java.util.Arrays;

public class Test1 {
	
	public static boolean isNumber(String s){
		// *문자열이 null 이거나, 빈문자열("") 이면 false 값 리턴
		if(s == null || s.length() == 0)
			return false;

		for(int i=0;i<s.length();i++){
			char ch = s.charAt(i);
			//System.out.println(ch);
			if( !('0'<=ch && ch<='9') ){
				return false;
			}
		}
		return true;
	}
	//////////////////////////////////////////////////
	// {1,3,5,6,81,3,7,9}
	public static int max(int[] arr){
		
		if(arr == null || arr.length == 0)
			return -99999;
		
		int max = arr[0];
		for(int i=1;i<arr.length;i++){
			if(max < arr[i]){
				max = arr[i];
			}
		}
		
		return max;
	}
	/////////////////////////////////////////////////////////
	
	public static int[] shuffle(int[] arr){
		
		if(arr == null || arr.length == 0)
			return arr;
		
		for(int i=0;i<arr.length;i++){
			int r = (int)(Math.random() * arr.length);
			
			int tmp = arr[i];
			arr[i] = arr[r];
			arr[r] = tmp;			
		}		
		
		return arr;		
	}
	

	public static void main(String[] args) {
		// 메서드 명 : isNumber
		// public static 사용
		// 전달인자 : String , 리턴 : boolean
		
		// 문자열의 값이 숫자인지 아닌지 판별하는 메서드 
		// "12345" - ㅇ(true)  "123a4" - x (false)
		// *문자열이 null 이거나, 빈문자열("") 이면 false 값 리턴
		
		// => 결과 확인  (12345, 12a45)
		System.out.println("12345 : "+isNumber("12345"));
		System.out.println("12a45 : "+isNumber("12a45"));
		
		System.out.println("--------------------------------");
		
		// 메서드 명 : max
		// public static
		// 전달인자 : int[] , 리턴 : int
		
		// 5개 이상의 int 타입의 값을 가진 배열중에서 가장 
		// 큰값을 찾아서 출력 메서드
		// * 만약에 배열이 null 이거나, 배열의 크기가 0일때 
		//  에러코드의 의미로 -99999 리턴 
		
		// => 사용해서 출력 
		int[] arr = {1,3,5,6,81,3,7,9};
		System.out.println("arr 최대값 : "+max(arr));
		int[] arr2 = null;
		System.out.println("arr2 최대값 : "+max(arr2));
		int[] arr3 = new int[0];
		System.out.println("arr3 최대값 : "+max(arr3));
		
		System.out.println(Arrays.toString(arr));
		
		/////////////////////////////////////////////////
		// 메서드 명 : shuffle
		// public static
		// 전달인자 : int[] , 리턴 : int[]
		// 해당 배열을 전달 받아서 랜덤하게 배열의 요소를 정렬후 리턴 
		// * 배열이 null 이거나, 배열의 크기가 0일때 입력받은 배열을 그대로 리턴
		
		int[] start = {1,2,3,4,5,6,7,8,9};
		System.out.println("시작 : "+Arrays.toString(start));
		
		int[] result = shuffle(start);		
		System.out.println("결과 : "+Arrays.toString(result));
		
		
		
		
		
		
		

	}

}
