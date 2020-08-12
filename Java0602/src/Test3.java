import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test3 {

	public static void main(String[] args) {
		// 키보드 입력을 바이트 스트림의 형태로 입력받아서
		// 화면에 출력하는 프로그램을 작성
		// * InputStream,OutputStream 객체를 사용
		// * 혹시나 키보드 입력값중에서 'x' 'X' 있을경우 프로그램 종료
		// * 총 입력된 글자수를 출력
		
		int data = 0;
		int cnt = 0;
		
		InputStream myIn = System.in;
		OutputStream myOut = System.out;
		
		try {
			while((data = myIn.read()) != -1){
				if(data =='x' || data=='X'){
					break;
				}
				cnt++;
				myOut.write(data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//System.out.println(" 총 입력된 글자 : "+cnt+"개");
		
		
		

	}

}
