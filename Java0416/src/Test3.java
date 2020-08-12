
public class Test3 {

	public static void main(String[] args) {
		// 암호화 프로그램을 작성하시오.
		// * 암호화 표를 참고해서 처리
		
		// 암호화 표 저장
		char[] abcCode ={
			'`','~','!','@','#',
			'$','%','^','&','*',
			'(',')','-','_','+',
			'=','|','[',']','{',
			'}',';',':',',','.',
			'/'				
		};
		
		char[] numCode = {
				'q','w','e','r','t',
				'y','u','i','o','p'
		};
		
		// 사용자 입력
		String input = "hello1234";
		String result = "";
		
		// System.out.println(12345+""); toString();
		
		// 암호화 처리 
		for(int i=0;i<input.length();i++){
			char ch = input.charAt(i);
			System.out.println("ch : "+ch);
			
			// 영문자
			if('a' <= ch && ch <='z' ){
				// 해당 문자에 맞는 암호화된 코드값을 저장한다.
				result += abcCode[ch-'a'];
			}			
			// 숫자
			else if('0' <= ch && ch <='9'){
				result += numCode[ch - '0'];
			}		
		}
		// 암호화 결과 출력
		System.out.println("암호화 전 : "+input);
		System.out.println("암호화 후 : "+result);
		
		
		// * 구구단 가로 출력
		
		
		

	}

}
