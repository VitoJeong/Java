
public class Test2 {

	public static void main(String[] args) {
		// 숫자 판독프로그램 생성
		// => 숫자로만 이루어진 문자열의 경우만 숫자로 판단.
		// 문자열(String) 데이터가 각각의 방에 따로 저장. 각방의 번호는 0번부터 시작
		// charAt(위치) => 해당위치의 문자 데이터를 가져올수 있음.
		String str = "12g45";
		char ch = ' ';
		boolean isNumber = true;
		
		for(int i=0;i<5;i++){
			ch = str.charAt(i);
			//System.out.println(ch);
			if( !('0'<=ch && ch<='9') ){
				isNumber = false;//!isNumber;
				break;				
			}
		}
		
		if(isNumber)
			System.out.println(str+"은 숫자 입니다.");
		else
		    System.out.println(str+"은 숫자가 아닙니다.");
		
		
		
		
		
		

	}

}
