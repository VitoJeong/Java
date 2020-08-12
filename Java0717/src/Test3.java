import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

// 연결을 유지하면서 지속적으로 데이터 송수신을 하기위한 객체
class EchoServerThread implements Runnable {

	// 입력 스트림
	InputStream is;
	ObjectInputStream ois;

	// 출력 스트림
	OutputStream os;
	ObjectOutputStream oos;

	// 전달받은 메세지
	String receiveMSG;

	// 소켓
	Socket child;

	public EchoServerThread() {
	}

	public EchoServerThread(Socket s) {

		try {
			// 클라이언트와 통신가능한 소켓의 정보를 저장
			child = s;

			// 3. 접속한 클라이언트 IP주소를 출력
			System.out.println(child.getInetAddress() + " 연결 요청~! ");

			// 4. 클라이언트로 부터 정보를 입력받는 입력 스트림
			is = child.getInputStream();
			ois = new ObjectInputStream(is);

			// 5. 클라이언트로 정보를 돌려주는 출력스트림
			os = child.getOutputStream();
			oos = new ObjectOutputStream(os);

			System.out.println("쓰레드 생성완료! 입출력 스트림 생성완료!");

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // 생성자

	@Override
	public void run() {
		// 데이터 송수신
		try {
			while (true) {
				// 4-2. 클라이언트 요청 정보를 읽어옴.
				receiveMSG = (String) ois.readObject();
				// 4-3. 클라이언트 요청 정보를 출력
				System.out.println(
						child.getInetAddress()
						+"의  MSG :"
						+receiveMSG
						);
				// 5-2. 클라이언트 요청 정보를 다시 돌려서 보냄(에코)
				oos.writeObject(receiveMSG);
				oos.flush();
			}
		} catch (Exception e) {
			System.out.println(child+": 클라이언트 강제 종료");
		} finally {
			try {
				oos.close();
				os.close();
				ois.close();
				is.close();
				child.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

	}// run

}

public class Test3 {

	// 서버 소켓
	ServerSocket server;
	// 통신 소켓
	Socket child;

	public Test3() {

		try {
			// 1. 에코 서버(포트) 생성, 소켓 객체 생성
			server = new ServerSocket(5000);

			System.out.println("******멀티 에코 서버 실행중....*******");
			System.out.println("******클라이언트 요청 대기중....************");

			// 2. 클라이언트 요청을 계속해서 받아서 처리가능하도록 무한루프
			while (true) {
				// 클라이언트 요청을 받아서 소켓 생성
				// 클라이언트 요청X 무한 대기
				child = server.accept();

				//////////////////////////////////////////////////
				// 클라이언트 요청이 들어오면 발생하는 소켓 정보를 받아서
				// 데이터 송수신을 하기위한 객체 생성 (Thread)
				EchoServerThread esTh = new EchoServerThread(child);
				Thread th = new Thread(esTh);
				th.start();
				
				System.out.println(" 송수신 처리 쓰레드 작동중 ...");

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		// 멀티 에코 서버
		// -> 멀티쓰레딩 사용해서 처리
		// 1) main 쓰레드 : 클라이언트 요청을 대기
		// 2) 쓰레드 : 소켓의 정보를 전달 받아서 데이터 처리(입출력)
		new Test3();

	}

}
