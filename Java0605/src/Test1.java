import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {

	public static final int BUFFER_SIZE=512;
	
	public static void main(String[] args) {
		// 필터 입출력 스트림 : 기존의 스트림을 새로운 스트림으로 변경해주는 필터를 사용하는 스트림
		// (보조 스트림,프로세싱 스트림)
		// 입력 ->  원하는 부분만 입력
		// 출력 -> 원하는 부분만 출력
		
		// 입력
		// 파일 -> FileInputStream -> FilterInputStream -> 프로그램
		// 출력
		// 프로그램 -> FilterOutputStream -> FileOutputStream -> 파일
		
		// 버퍼 입출력 스트림
		// -> 버퍼 : 데이터를 저장하는 메모리 공간 (내부 버퍼의 크기 512byte)
		//  파일/데이터를 한바이트씩 가져오는게 아니라 버퍼를 사용해서 한덩어리(버퍼)씩
		// 정보를 가져오는 방법 
		
		int len = 0;
		
		int data = 0;
		byte[] buffer = new byte[BUFFER_SIZE];
		
		// 버퍼스트림을 사용해서 파일 입출력
		
		String path ="C:\\Users\\ITWILL\\Desktop\\image.zip";
		String path2 ="C:\\Users\\ITWILL\\Desktop\\image_copy.zip";
		
		try {
			FileInputStream fis = new FileInputStream(path);			
			// 필터스트림(보조 스트림)
			BufferedInputStream bis = new BufferedInputStream(fis);
			
			FileOutputStream fos = new FileOutputStream(path2);
			BufferedOutputStream bos = new BufferedOutputStream(fos);
			
			// 파일 입출력(버퍼를 사용)
			while( (data = bis.read(buffer)) != -1 ){
				bos.write(buffer,0,data);
				
				// 버퍼가 꽉차지 않을경우 공백을 채워서 전달 
				bos.flush();		
				
				len += data;
				
				System.out.println("처리중: read["+data+","+len+"]");
				System.out.println("사용 가능 : "+bis.available());
				
				
			}			
			
			System.out.println(" 파일 복사 완료 ! ");
			
			// 파일 복사 끝 
			bos.close();
			fos.close();
			bis.close();
			fis.close();		
			
			System.out.println(" 자원 해제 완료! ");
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
