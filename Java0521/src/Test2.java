import java.io.IOException;

// 사용자 정의 예외 객체
class UserException extends Exception{
	
	public UserException(){}
	public UserException(String msg){
		//super(msg);	
		// Exception(msg);
		System.err.println(msg);
	}
}



public class Test2 {
	
	public static void exp(int num){
		System.out.println("static 메서드 실행 ");
		System.out.println("전달 값 : "+num);
		// 만약 전달값 0일경우 예외를 발생 (NullPoint)
		if(num == 0){
			System.out.println("예외발생 num : "+num);
			throw new NullPointerException();
		}
	}
	
	public static void exp2(int num) throws NullPointerException{
		
		if(num == 0)
			throw new NullPointerException();
		
	}
	

	public static void main(String[] args) {
		// 예외가 발생시 JVM(컴파일러)에서 자동으로 해당되는 예외를 객체로 생성해서 처리
		
		// 사용자 정의 예외(예외의 인위적 발생)
		// : 개발자가 의도를 가지고 예외를 발생 시킨다.
		// * 예외 객체를 생성해서 던진다.
		
		// throw 예외객체; 
		// throw new 예외 클래스();
		
		exp(100);
		
		//exp(0);
		
//		try {
//			exp2(0);
//		} catch (Exception e) {
//			System.out.println("main에서 출력된 예외");
//			e.printStackTrace();			
//		}
		try {
			exp2(0);
		} catch (NullPointerException e) {
			// TODO Auto-generated catch block
			System.out.println("main에서 출력된 예외");
			e.printStackTrace();
		}
		
		
		// * throw 키워드
		// - 예외를 일부러 발생시키는 키워드
		//   throw new 예외클래스();		
		
		// * throws 키워드
		// - 예외를 직접 처리하는게 아니라, 자신을 호출한 곳(객체)에 
		//   예외처리를 떠넘기는 동작(키워드)
		//   public void 메서드() throws 예외객체 {   }
		
		
		// * 사용자 정의 예외 객체
		
		try {
			int a = -100;
			
			if(a < 0){
				throw new UserException("음수라서 예외가 발생함");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		
		
		
		
		
		

	}

}
