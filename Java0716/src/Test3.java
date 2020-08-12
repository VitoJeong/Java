import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Test3 {

	public static void main(String[] args) {
		// 소캣 프로그래밍 (서버)
		
		try {
			// 서버 소캣 객체를 생성( 포트번호를 지정 )
			ServerSocket server = new ServerSocket(5000);
			System.out.println("서버 실행중...");
			
			while(true){
				// 클라이언트의 접속을 대기 
				System.out.println("서버 요청 대기중.....");
				Socket socket = server.accept();
				
				System.out.println(socket.getInetAddress()+"님 입장~!");
			}
			
		} catch (IOException e) {
			//System.out.println("에러 : "+e);
			e.printStackTrace();
		}
		
		
		

	}

}
