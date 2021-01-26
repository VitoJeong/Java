
public class Array {
	public static void main(String[] args) {
		
		int[] numbers1 = new int[4];
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
//		numbers1[3] = 40;
		
		int[] numbers2 = {10,20,30,'a'};
		int[] numbers3 = new int[]{10,20,30,'A'};
		
		System.out.println(numbers1[3]);
		// 숫자형 배열의 기본값은 0, 문자열 배열의 기본값은 null
		System.out.println(numbers2[3]);
		System.out.println(numbers3[3]);
		
		System.out.println("numbers1의 길이 : "+numbers1.length);
		
		int i = 0;
		while(numbers1.length>i){
			System.out.println(numbers1[i]);
			i++;
		}
	}
}
