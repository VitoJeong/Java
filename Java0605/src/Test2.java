import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test2 {

	public static void main(String[] args) {
		// Data 입출력 스트림 : 자바에서 제공하는 기본형타입 (8가지)를 사용해서
		// 입출력 사용가능
		
		boolean b = true;
		char ch = 'A';
		byte by = 10;
		short s = 1000;
		int i = 12312313;
		long l = 123123123123L;
		float f = 3.1234f;
		double d = 3.1231231231231;
		String str = "Hello";
		
		// 파일로 해당 자료형의 데이터를 전달 
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		try {
			fos = new FileOutputStream("test2.dat");
			dos = new DataOutputStream(fos);
			
			// 전달되는 타입에 따라서 출력형태가 변경 
			dos.writeBoolean(b);
			dos.writeChar(ch);
			dos.writeByte(by);
			dos.writeShort(s);
			dos.writeInt(i);
			dos.writeLong(l);
			dos.writeFloat(f);
			dos.writeDouble(d);
			dos.writeUTF(str);
			
			System.out.println(" DataOutStream 객체 사용 출력 완료 ");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dos.close();
				fos.close();
				System.out.println(" 자원 해제 성공 ");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		
		
		
		

	}

}
