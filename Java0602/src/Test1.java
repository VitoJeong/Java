import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) throws IOException {
		// 자바 입/출력 (IO) => java.io 패키지 
		
		// 스트림(Stream) : 연속된 일련의 데이터, 모든 자바에서의 동작은 
		// 스트림 기반으로 처리가 됨.
		// 노드 (node) : 스트림의 목적지
		
		// 표준 입력 장치 -> 키보드 (in)
		Scanner s = new Scanner(System.in);
		// 표준 출력 장치 -> 모니터 (out)
		System.out.println();
		
		// 1) 바이트 스트림 : 숫자형태의 데이터가 전달, 바이트,바이트 배열,정수값
		//           InputStream, OutputStream
		
		// 2) 텍스트 스트림 : 문자 형태의 데이터가 전달, 문자,문자 배열,문자열
		//           Reader, Writer
		
		
		// InputStream 클래스
		//  1) 추상클래스 , 2)바이트 입력 스트림 중에서 최상위 클래스 
		
		//InputStream myInput = new InputStream();
		
		
		int data = 0;
		System.out.println("키보드 값 입력 하시오>");
//		
//		data = System.in.read();
//		
//		while(data != -1){  // -1 더이상 입력이 없는경우 
//			System.out.println("입력값 : "+(char)data);
//			data = System.in.read();
//		}
		
        // ctrl + z => 입력의 끝(-1)		
		while( (data = System.in.read()) != -1){  // -1 더이상 입력이 없는경우 
			System.out.println("입력값 : "+(char)data);
		}
		
		
		
		
		
		
		
		
		
		

	}

}
