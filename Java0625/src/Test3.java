import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Test3 extends Frame {
	
	public Test3(){
		// ~ Listener : 리스너 인터페이스
		// ~ Adapter : 어댑터 클래스 
		// => 리스너 인터페이스의 단점을 보완하기 위해서 생성된 객체 => 어댑터 클래스
		
		// 단점 : 인터페이스이기 때문에 가지고있는 모든(사용유무 상관없음)추상메소드를
		// 구현해야함.
		// => 어댑터 클래스(추상클래스) 리스너 인터페이스를 상속해서 모든 추상메서드를
		// 동작없이 구현한 상태 => 사용자의 필요에 따라서 직접 구현해서 사용 가능
		
		// * 추상클래스, 인터페이스 => 익명클래스로 구현 가능
		
		
		
		
	   this.addWindowListener(new WindowListener() {
		
		@Override
		public void windowOpened(WindowEvent e) {
		}
		
		@Override
		public void windowIconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeiconified(WindowEvent e) {
		}
		
		@Override
		public void windowDeactivated(WindowEvent e) {
		}
		
		@Override
		public void windowClosing(WindowEvent e) {
		}
		
		@Override
		public void windowClosed(WindowEvent e) {
		}
		
		@Override
		public void windowActivated(WindowEvent e) {
		}
	});
	   
	   this.addWindowListener(new WindowAdapter() {

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO Auto-generated method stub
			super.windowClosing(e);
		}
		   
	});
		
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
