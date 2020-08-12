import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test2 {

	// 소켓(서버에 접근하기위한 객체)
	Socket client;

	// 입력 스트림 객체
	InputStream is;
	ObjectInputStream ois;

	// 출력 스트림 객체
	OutputStream os;
	ObjectOutputStream oos;
	
	// 사용자 키보드 입력 스트림
	BufferedReader read;
	
	// 전송 메세지
	String sendMSG;
	// 서버로부터 전달받은 메세지
	String receiveMSG;
	

	public Test2() {

		try {
			// 1. 접속할 서버 IP,포트번호를 사용해서 접근가능한 소켓 객체를 생성
			System.out.println("********* 클라이언트 생성!! ************");
			//client = new Socket("192.168.6.200", 5000);
			client = new Socket("localhost", 5000);
			
			
			System.out.println("****** 에코 서버 접속 완료! ***************");
			// 2. 키보드 입력 준비
			read = new BufferedReader(new InputStreamReader(System.in));
			
			// 3. 서버로 데이터 전달하는 출력 스트림
			os = client.getOutputStream();
			// 3-1. ObjectOutputStream 으로 변환
			oos = new ObjectOutputStream(os);
			
			// 4. 서버로부터 다시 전달받을 입력스트림
			is = client.getInputStream();
			// 4-1 ObjectInputStream으로 변환
			ois = new ObjectInputStream(is);			
			
			// 2-1. 서버로 전달할 데이터 입력
			System.out.print(" 입력 -> ");
			// 2-2. 키보드 입력을 oos 사용해서 출력
			while( (sendMSG = read.readLine()) != null){
				
				// 3-2. oos 사용해서 서버로 데이터 전달 
				oos.writeObject(sendMSG);
				// 3-3. 버퍼의 빈공간을 채워서 전달
				oos.flush();
				
				// 4-2. 다시 데이터를 전달받음
				receiveMSG = (String)ois.readObject();
				// 4-3. 출력후 확인
				System.out.println(
						client.getInetAddress()
						+"에서 전달된 메세지(에코)"
						+receiveMSG
						);
				
				System.out.print(" 입력 -> ");
				
			}
				
			
			
			
			
			
			

		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// 에코서버에 접속하는 클라이언트
		new Test2();

	}

}
