import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test3C {

	public static void main(String[] args) {
		// 소캣프로그래밍 (클라이언트)

		try {
			// 서버의 주소, 포트번호를 가지고있는 소캣 
			Socket client = new Socket("localhost",5000);
//			Socket client = new Socket("192.168.6.200",5000);
			System.out.println("클라이언트 생성");			
			
			
			
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
