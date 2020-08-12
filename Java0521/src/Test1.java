import java.sql.Connection;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
		// Throwable(예외/에러의 최상위객체)
		// / \
		// Exception(실행시 예외) Error (컴파일에러)
		//
		// ArithmeticException
		// * 예외는 객체로 처리한다

		// 예외 처리 try ~ catch (+ finally) / try ~ with
		try {
			// 예외가 발생할수 있는 코드 작성
		} catch (Exception e) {
			// 예외 처리 코드 작성
		}

		int a = 10, b1 = 0, b2 = 2, c = 10;

		System.out.println("c : " + c);
		try {
			c = a / b2;
			System.out.println("c : " + c);

			c = a / b1;
			// 0으로 나누기 할때 예외 발생
			System.out.println("c : " + c);
		} catch (Exception itwill) {
			itwill.printStackTrace();
			System.out.println("예외 정보 : " + itwill);
			System.out.println("예외 메세지 : " + itwill.getMessage());

			System.out.println("코드 예외 발생!! ");
			System.out.println(" 예외 처리 동작 실행! ");

			c = a / b2;
			System.out.println("예외처리로 발생한 c : " + c);
		}

		System.out.println("여기까지 도착시 정상 종료됨 c : " + c);

		System.out.println("----------------------------------");

		// 중복 catch

		try {
			System.out.println("try 구문실행");

			// int aa = 5 / 0;

			String str = null;
			System.out.println(str.length());

		} catch (ArithmeticException e) {
			System.out.println("수학적 예외 발생 :" + e);
		} catch (Exception e) {
			System.out.println("Exception 예외발생"+e);
			// 모든 예외상황에 대한 처리가 가능하다
			// => 모든 예외 객체는 Exception객체를 상속하고있다.
			// => 그러므로 모든타입의 예외는 Exception 타입으로 업캐스팅 가능하다.

			// * 구체적인예외를 먼저 처리하고, 그다음 Exception을 처리한다.

			e.printStackTrace();
		}

		System.out.println("-----------------------------------");

		Scanner s = null;
		try {
			// 예외가 발생할수도 있는 코드
			System.out.println("try !!");
			s = new Scanner(System.in);
			// int aa = 5 / 0;
			//s.next();

		} catch (Exception e) {
			// 예외처러
			System.out.println("Exception !!");
		} finally {
			// 예외발생 유무와 상관없이 반드시 실행해야하는 문장을 작성
			System.out.println("finally !!");
			s.close();
		}

		/*
		 * try ~ catch ~ finally 실행 1 - try 구문 진입 2 - try 예외 발생시 예외정보를 객체로 생성해서
		 * 던짐. 3 - catch 구문에서 받아서 처리 (순차적으로 체크하면서 해당예외를 찾아감) 4 - 해당 예외에 맞는
		 * 예외/에러처리 실행 5 - finally 구문을 실행
		 */

		// try ~ with구문 ( jdk7.0 이후 사용 가능 )
		// try(/*AutoCloseable 객체*/){
		//
		// }catch(Exception e){
		//
		// }
		// => try 구문 발생시 정상처리/예외발생후 자동으로 자원해제 처리 
		
		// NullPointerException : 객체의 참조값이 null이다.
		// ArrayIndexOutOfBoundsException : 배열 범위 참조 에러
		
		
		try{
			int[] arr = new int[3];
			
			arr[3] = 100;
			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println(" 에러 발생 "+e);
		}
		
		
		
		
		

	}

}
