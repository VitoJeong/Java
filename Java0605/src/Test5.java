import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.Date;

public class Test5 {

	public static void main(String[] args) {
          
		try {
			FileInputStream fis = new FileInputStream("Object2.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 일반적인 객체 단위로 입출력을 했을때도 (ObjectInput/Output)
			// DataInput/Output 처럼 넘겨주는 순서를 생각해서 사용해야한다.
			
			//=> 효율적인 객체 전달(IO)하기위해서는 객체 직렬화를 위해서 
			// 클래스를 설계 해야한다.
			// 해당 클래스를 생성시  Serializable/Externalizable (인터페이스)를 구현해야한다.
			
//			String str = (String) ois.readObject();
//			System.out.println(str);
//			
//			Date today = (Date)ois.readObject();
//			System.out.println(today);
			
			ItwillMember member = (ItwillMember) ois.readObject();
			System.out.println(member.getName());
			
			
			ois.close();
			fis.close();
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		

	}

}
