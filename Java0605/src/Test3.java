import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Test3 {

	public static void main(String[] args) {
		// DataInputStream 클래스
		
		// * 자바의 기본형타입(+String)을 형태 그래도 사용가능하지만,
		// 사용하는 프로그램에 따라 다른 형태로 보여질수 있음.
		// * 항상 사용자가 전달한 데이터 순서대로 데이터를 읽어야 한다.

		// 파일 읽기
		FileInputStream fis = null;
		DataInputStream dis = null;

		try {
			fis = new FileInputStream("test.txt");
			dis = new DataInputStream(fis);

			boolean b = dis.readBoolean();
			System.out.println(b);
			char ch = dis.readChar();
			System.out.println(ch);
			byte by = dis.readByte();
			System.out.println(by);
			// String str = dis.readUTF();
			// System.out.println(str);
			// int i = dis.readInt();
			// System.out.println(i);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}

	}

}
