import java.io.Externalizable;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.Date;


// 객체 직렬화 위한 클래스 설계 
class ItwillMember implements Serializable,Externalizable{
	private String name;
	int age;
	
	public ItwillMember(){}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "ItwillMember [name=" + name + ", age=" + age + "]";
	}

	@Override
	public void writeExternal(ObjectOutput out) throws IOException {
		out.writeObject(name);
		out.writeObject(age);		
	}

	@Override
	public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
         name =(String) in.readObject();
         age = (int) in.readObject();		
	}
	
}





public class Test4 {

	public static void main(String[] args) throws Exception {
		// 스트림은 문자단위 출력 기반의 형태 
		// -> 텍스트 전체출력 기반의 형태 : PrintStream 클래스
		// print(), println()
		
		/*PrintStream ps = new PrintStream("ps.txt");
		
		ps.println(10);
		ps.println(10.123);
		ps.println("1234");
		ps.println(true);
		
		System.out.println();
		
		ps.close();	*/
		
		// * 객체 직렬화 : 데이터를 한줄로 만들어서 스트림을 통해서 전달
		//  객체를 파일,네트워크상으로 출력하면 객체를 연속된 바이트의 형태로 변경
		
		// 객체 입출력 스트림 : 객체 전체를 저장해서  객체 단위로 전달하는 입출력 스트림
		// ObjectInputStream/ObjectOutputStream
		
		String name = new String("홍길동");
		Date today = new Date();
		
		ItwillMember member = new ItwillMember();
		member.setName("itwill");
		member.setAge(20);
		
		FileOutputStream fos = new FileOutputStream("Object2.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		//oos.writeObject(name);
		//oos.writeObject(today);
		oos.writeObject(member);
		
		oos.flush();
		
		oos.close();
		fos.close();
		
		System.out.println("객체 전달 성공!");
		
		
		
		
		
		
		
		
		
		

	}

}
