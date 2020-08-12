import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test5 {

	public static void main(String[] args) {
		// 파일 출력
		// FileOutputStream 클래스 (파일 생성)
		
		int data = 0;
		
		// 파일 생성 (출력결과)
		//File result = new File("test.txt");
		File result = new File("C:\\Users\\ITWILL\\Desktop\\NEWHELLO.jpg");
		
		try {
			FileOutputStream fos = new FileOutputStream(result);
			while((data = System.in.read()) != -1){
				//System.out.print((char)data);
				fos.write(data);				
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		

	}

}
