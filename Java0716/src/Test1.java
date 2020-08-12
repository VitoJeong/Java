import java.net.InetAddress;
import java.net.UnknownHostException;

public class Test1 {

	public static void main(String[] args) {
		// 네트워크 프로그래밍 -> JSP/Servlet
		// 멀리 떨어져있는 호스트끼리 데이터를 주고 받을때 처리할수 있는 프로그래밍
		// => IO 입출력

		// 소켓(Socket) : 통신을 하기위해서 필요한 TCP 포트,
		//     하부 네트워크를 신경쓰지 않고 통신하기위한 소프트웨어적인 메커니즘
		// => Socket 클래스 사용 처리 
		
		// 통신 프로토콜 : http,https 컴퓨터 사이에서 데이터를 주고받을때,
		// 어떻게 접속을하고, 어떤속도로, 어떤형태로 데이터를 주고 받을지에대한 약속
		
		// TCP/IP : 통신 프로토콜중 한가지
		/*
		
           	애플리케이션 층 : 사용자 사용(인터넷 응용프로그램)
           	=> 가상의 데이터 송수신
           	
           	트랜스포트 층(TCP/UDP) : 데이터 전송, 에러검출& 수정
           	
           	네트워크(인터넷) 층(IP) : 패킷 단위로 데이터가 변경후 원하는 위치로 이동
           	
           	데이터링크 층 : 랜 카드 제어 및 데이터 통신을 위한 하드웨어 제어
   		    => 실제 데이터 송수신
		
		*/
		
		// 소켓 ? TCP 사용한 프로그램을 작성할수 있도록 제공되는 인터페이스
		// => 해당 클래스를 사용해서 처리(애플리케이션 계층)
		// - 호스트(사용자) 끼리의 통신을 위한 도구
		
		// 서버 ? 정보/서비스를 제공하는 쪽
		// 클라이언트 ? 정보/서비스를 제공 받는쪽
		
		// IP ? 인터넷 환경에서 컴퓨터를 구분하는 고유한 값(전화번호)
		// => xxx.xxx.xxx.xxx  0~255 (IPv4)
		//    localhost(127.0.0.1)
		
		// 포트번호 ? 인터넷 환경에서 컴퓨터 안에 있는 여러 응용프로그램을 구분하기위한 값
		//  tomcat : 8080 / mysql : 3306 / FTP : 21
		// * 1024 작은 포트번호는 거의 상용 프로램에 사용중
		
		
		// IP 정보를 알수있는 클래스
		try {
			//InetAddress inet = InetAddress.getByName("localhost");
			//InetAddress inet = InetAddress.getByName("www.naver.com");
			InetAddress inet = InetAddress.getByName("www.google.com");
			
			// 호스트명
			System.out.println(inet.getHostName());
			// 호스트 IP주소
			System.out.println(inet.getHostAddress());
			
			// ip(IPv4) : 각 필드 8bit씩 4개의 필드로 구성 (0~255)
			// byte (-128~127)
			// 0~127 그냥 사용,-1~-128  (+256)
			System.out.println(inet.getAddress());
			
			byte[] b = inet.getAddress();
			
			for(int i=0;i<b.length;i++){
				
				System.out.print( b[i]<0? b[i]+256 : b[i] );
				
				if(i != b.length-1){
					System.out.print(".");
				}				
			}
			System.out.println();
			
			InetAddress inet2 = InetAddress.getLocalHost();
			
			System.out.println("호스트명 : "+inet2.getHostName());
			System.out.println("호스트 주소 : "+inet2.getHostAddress());
			
			
			
			
			
			
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
