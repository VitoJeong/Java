import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Test6 {

	public static void main(String[] args) {
		// 파일 복사 프로그램 생성(COPY)
		// 특정 파일을 선택해서 바탕화면에 이름_copy 복사본 파일을 생성
		// * 복사한 파일의 크기 출력(콘솔창)
		
		// 파일 읽어서 다른 파일로 출력
		
		int data = 0;
		int size = 0;
		
		//String InPath = "D:\\workspace_java6\\Java0602\\src\\Test1.java";
		String InPath = "C:\\Users\\ITWILL\\Desktop\\duke.png";
		String OutPath = "C:\\Users\\ITWILL\\Desktop\\duke_COPY.png";
		InputStream fis = null;
		OutputStream fos = null;
		
		try {
			fis = new FileInputStream(InPath);
			fos = new FileOutputStream(OutPath);
			
			while( (data = fis.read()) != -1){
				fos.write(data);
				size++;
			}
			System.out.println("복사된 파일의 크기 : "+size+"byte");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		
		

	}

}
