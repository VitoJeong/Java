import java.util.Calendar;
import java.util.Random;
import java.util.StringTokenizer;

public class Test2 {

	public static void main(String[] args) {
		// 문자열 클래스들 
		
		// String 클래스
		// 1 "문자열상수"
		// 2 new 문자열객체()
		
		String str1 = new String("Hello");
		String str2 = new String("Hello");
		
		if(str1 == str2)
			System.out.println("같다");
		else 
			System.out.println("다르다");
		
		String str3 = "Hello";
		String str4 = "Hello";

		if(str3 == str4)
			System.out.println("같다");
		else 
			System.out.println("다르다");
		
		
		System.out.println(str1.length());
		System.out.println(str1.substring(2));
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		System.out.println(str1.charAt(0));
		System.out.println(str1.indexOf('o'));
		System.out.println(str1.lastIndexOf('o'));
		
		System.out.println(str1.trim());
		// => 문자열 앞뒤 공백제거
		
		System.out.println("----------------------------");
		str4 = "Hello Java";
		
		str4.toUpperCase(); // 대문자 변경 메서드
		
		System.out.println(str4);
		//=> 해당 메서드의 처리결과를 String 타입의 변수에 다시 저장하지 않음
		
		String str = str4.toUpperCase();
		System.out.println("str :"+str);
		
		// * String 타입 메서드처리시 정보를 저장하지 않을경우 
		// 기존의 값이 유지된다.
		
		System.out.println("-------------------------------");
		
		//StringBuffer 클래스
		// Buffer : 메모리 저장공간 (임시)
		
		StringBuffer sb = new StringBuffer();
		sb.append("Hello");
		
		System.out.println(sb);
		System.out.println(sb.toString());
		
		String s = sb.substring(3);
		System.out.println(s);
		
		sb.replace(0, 2, "ABC");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		
		
		// String,StringBuffer 클래스는 둘다 문자열을 
		// 저장,처리 클래스입니다. 
		// String 클래스는 연산의 결과를 따로 저장하지 않으면
		// 결과를 유지할수 없음.(자체 메모리에 저장 X)
		// StringBuffer 클래스는 연산의 결과를 따로저장 하지 않아도
		// 결과를 유지할수 있음.(자체 메모리(버퍼) 저장O)
		
		
		// StringTokenizer 클래스 
		// => 하나의 문자열을 여러개의 문자열로 나누는 작업하는 클래스
		// 파싱(Parsing) - 토큰(Token) 문자열을 나누는 기준
		
		
		StringTokenizer stk
		= new StringTokenizer("홍길동@갑돌이@김학생@박학생@정학생", "@");
		
		// 파싱된 문자열의 개수
		System.out.println(stk.countTokens());
		
		while(stk.hasMoreTokens()){
			System.out.println(stk.nextToken());			
		}
		
		Math m;
		Random r = new Random();
		System.out.println(r.nextInt(100));
		// r.nextInt(범위) : 0~범위 까지 랜덤값
		
		System.out.println("------------------------------");
		
		//Calendar cal = new Calendar();
		// 추상클래스는 객체 생성 불가능하다.
		Calendar cal = Calendar.getInstance();
		//=> 시스템의 날짜정보(객체)를 가져와서 사용  (싱글턴 패턴)
		
		System.out.println(cal.get(Calendar.YEAR)+"년");
		System.out.println((cal.get(Calendar.MONTH)+1)+"월");
		System.out.println(cal.get(Calendar.DATE)+"일");
		
		System.out.println("----------------------------------");
		// AM/PM 05:19:00 출력 (현재 시간정보를 출력)
		
		int ampm = Calendar.AM_PM;
		
		if(ampm == Calendar.AM)
			System.out.print("AM : ");
		else
			System.out.print("PM : ");
		
		System.out.print(cal.get(Calendar.HOUR)+"시 ");
		System.out.print(cal.get(Calendar.MINUTE)+"분 ");
		System.out.println(cal.get(Calendar.SECOND)+"초");
		
		
		
		
		
		

	}

}
