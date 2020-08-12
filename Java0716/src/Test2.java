import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.net.URLEncoder;

public class Test2 {

	public static void main(String[] args) {
		
		try {
//			URL url = new URL("https://www.naver.com/index.html");
			//URL url = new URL("http://www.itwillbs.co.kr");
			URL url = new URL("http://www.google.com");
			
			System.out.println(" URL 프로토콜 : "+url.getProtocol());
			System.out.println(" URL 포트 : "+url.getPort());
			System.out.println(" URL 호스트명 : "+url.getHost());
			System.out.println(" URL 파일위치 : "+url.getFile());
			
			
			
			System.out.println("----------------------------------");
			
			InputStream in = url.openStream();
			
			InputStreamReader reader = new InputStreamReader(in);
			
			BufferedReader buffer = new BufferedReader(reader); 
			
			String str="";
			
//			while( (str = buffer.readLine()) != null ){
//				
//				System.out.println(str);
//				
//			}
			System.out.println("----------------------------------");
			
			// 인코딩 - 디코딩
			
			String testData = "Java 안녕하세요 12345";
			
			String encodeStr = URLEncoder.encode(testData, "UTF-8");
			String decodeStr = URLDecoder.decode(encodeStr, "MS949");
			// -> 디코딩시 반드시 인코딩했던 형태로 사용해야함.
			
			System.out.println("원본 : "+testData);
			System.out.println("인코딩 : "+encodeStr);
			System.out.println("디코딩 : "+decodeStr);
			
			
			
			
			
			
			
			
			
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
