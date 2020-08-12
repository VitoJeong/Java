
public class Test1 {

	public static void main(String[] args) {
		// Wrapper 클래스 
		// 기본형 데이터타입을 객체로 사용할수 있도록 하는 클래스 
		//=> 기본형 타입의 본질은 그대로두고,인터페이스만 제공해서 사용하는것 
		
		//   [기본형 => 참조형]
		// boolean => Boolean
		// char => Character
		// byte => Byte
		// short => Short
		// int => Integer
		// long => Long
		// float => Float
		// double => Double
		
		// * Character,Integer를 제외한 나머지 타입은 첫글자만 모두 대문자로 변경

		
		// 정수형타입 객체 
		Integer num = new Integer(1000);
		System.out.println("출력 num : "+num.toString());
		System.out.println("출력 num + 100 : "+(num.toString()+100));
		System.out.println("출력 num + 100 : "+(num.intValue()+100));
		
		System.out.println("2진수 : "+Integer.toBinaryString(num));
		System.out.println("8진수 : "+Integer.toOctalString(num));
		System.out.println("16진수 : "+Integer.toHexString(num));
		
		// 오토 박싱 & 오토 언박싱
		// => 박싱 : 값형태의 데이터(기본형타입)가 Wrapper 클래스(참조형타입) 변환하는것
		// => 언박싱 : Wrapper 클래스 데이터가 값 형태의 데이터로 변환하는것
		// => JDK6.0 이후에는 자동으로 박싱,언박싱이 처리된다.
		
		int num1 = 1000;		
		int sum = num + num1;
		
		System.out.println("출력 : "+sum);
		
		System.out.println("---------------------------------");
		
		int n1 = 100;
		int n2;
		
		Integer N1;
		Integer N2 = new Integer("300");
		
		N1 = n1; // 오토 박싱
		N1 = new Integer(n1); // 박싱
		
		n2 = N2; // 오토 언박싱
		n2 = N2.intValue(); // 언박싱
		
		
		System.out.println("--------------------------------");
		// Character 클래스 
		char[] data = {'A','a','4',' ','@','G'};
		
		for(int i=0;i<data.length;i++){
			
			//if('A'<=data[i] && data[i] <='Z')
			if(Character.isUpperCase(data[i])){
				System.out.println(data[i]+"값은 대문자입니다.");
			}
			// 소문자
			else if(Character.isLowerCase(data[i])){
				System.out.println(data[i]+"값은 소문자입니다.");
			}
			// 숫자
			else if(Character.isDigit(data[i])){
				System.out.println(data[i]+"값은 숫자입니다.");
			}
			// 공백
			else if(Character.isSpace(data[i])){
				System.out.println(data[i]+"값은 공백입니다.");
			}
			else if(Character.isSpaceChar(data[i])){
			}
			// 특수문자
			else{
				System.out.println(data[i]+"값은 특수문자 입니다.");
			}
		}
		
		// session.setAttribute("age",10);
		
		
		
		
		
		

	}

}
