import java.util.Enumeration;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

public class Test2 {

	public static void main(String[] args) {
		// Stack 클래스
		// : 하나 이상의 데이터를 저장 가능한 공간 (항상 데이터를 순차적으로 저장)
		// top을 통해서만 데이터를 입출력 가능하다.
		// => 처음 입력된 값이 가장 마지막에 나오는 구조 (FILO/LIFO)
		// => '자료구조' 개념 => Stack 클래스 
		// push() 데이터 저장 , pop() 데이터 사용
		
		
		Stack newStack = new Stack();
		newStack.push("1-자바");
		newStack.push("2-JSP");
		newStack.push("3-DB");
		newStack.push("4-WEB");
		newStack.push("5-직업기초");
		
		System.out.println(newStack);
		while(!newStack.isEmpty()){ // 스텍에 값이 들어 있는경우
			System.out.println(newStack.pop());
		}
		System.out.println(newStack);
		
		System.out.println("------------------------------");
		// Queue 인터페이스 
		// : 하나 이상의 데이터를 저장 가능한 공간
		//  FIFO 구조 데이터를 처리 가능
		// => 구현 클래스 : LinkedList 클래스
		// 데이터 입력 : offer(), 데이터 출력 : poll(),
		// peek() : 큐의 제일 위에 있는 객체 반환(이때 데이터는 삭제X), 큐가 비어있으면 null
		
		Queue que = new LinkedList();
		
		que.offer("1-자바");
		que.offer("2-JSP");
		que.offer("3-DB");
		que.offer("4-WEB");
		que.offer("5-직업기초");
		
		System.out.println(que);
		while(que.peek() != null){ //큐에 데이터가 있을때
			System.out.println(que.poll());
		}
		
		System.out.println(que);
		
		System.out.println("---------------------------------------");
		// Map 인터페이스 Hashtable 클래스
		// 데이터를 (키,객체) 한쌍으로 저장해서 사용
		// ~table,~map
		// 데이터 저장 put(), 데이터 출력  get()
		// => 리스트 계열보다 정보 검색을 쉽고 빠르게 처리

		//Map map = new Hashtable();
		Hashtable map = new Hashtable();
		
		map.put("사과", "Apple");
		map.put("딸기","Strawberry");
		map.put("포도", "Grapes"); // 저장시 업캐스팅 (Object)
		
		System.out.println(map);
		
		String str = (String)map.get("포도"); // 사용시 다운캐스팅(String)
		System.out.println("결과 : "+str);
		
		
		// Enumeration 인터페이스를 통한 반복 출력(사용)
		
		Enumeration Enum = map.keys();
		
		while(Enum.hasMoreElements()){
			Object k = Enum.nextElement();
			Object v = map.get(k);
			System.out.println(k+" / "+v);
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		

	}

}
