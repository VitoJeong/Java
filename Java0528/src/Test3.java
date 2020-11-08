import java.util.ArrayList;
import java.util.Scanner;
import java.util.Vector;
//class Test{
//
//	public static void showVector(Vector<Integer> input){
//		 // 모든 요소 출력
//		System.out.println("showVector() 호출");
//		 System.out.println(input);
//		 System.out.println("요소의 개수 : "+input.size());
//		 System.out.println("백터의 용량 : "+input.capacity());		
//	}	
//} static method는 오버라이딩할 수 없음 -> static method는 상속이 되지 않기 때문이다. 
// 왜냐면 static 메서드는 클래스가 컴파일 되는 시점에 결정이 되지만 Override에 경우에는 런타임 시점에 사용될 메서드가 결정이 된다. 
//	- static 메서드는 다형성이 적용되지 않음


public class Test3 /*extends Test*/{
	
	public void showVector(Vector<Integer> input){
		 // 모든 요소 출력
		System.out.println("showVector() 호출");
		 System.out.println(input);
		 System.out.println("요소의 개수 : "+input.size());
		 System.out.println("백터의 용량 : "+input.capacity());		
	}

	public static void main(String[] args) {
		// 백터 생성 ( 정수형 ) 
		Vector<Integer> v = new Vector<Integer>();
		// 5,4,-1  순서대로 입력
		v.add(5);  		v.add(4); 		v.add(-1);
		// 요소의 정보 확인 - showVector() : 모든 요소의 정보,백터의 크기,용량 출력
		//showVector(v); //static
		//Test.showVector(v);
		Test3 t3 = new Test3();
		t3.showVector(v);
		
		// 4,-1 사이에 100 값을 추가 입력
		// 요소의 정보확인
		v.add(2,100);
		t3.showVector(v);
		
		// 백터의 모든 요소의 합을 계산해서 출력
		int sum = 0;
		for(int s:v){
			sum += s;
		}
		System.out.println("sum ="+sum);
		sum=0;
		for(int i=0;i<v.size();i++){
			sum += v.get(i);
			//sum += v.elementAt(i);
		}
		System.out.println("Sum = "+sum);
		
		////////////////////////////////////////////////////////
		// ArrayList 사용자의 이름을 입력 (4개) aaa, aaaa, aaaaa, aaaaaaaa
		// 해당 이름의 정보를 모두 출력
		// 저장된 이름중에 가장 길이가 긴 이름을 출력
		ArrayList<String> names = new ArrayList<String>();
		
		Scanner scan = new Scanner(System.in);
		
		for(int i=0;i<4;i++){
			System.out.print(" 사용자 이름을 입력하시오 > ");
			String str = scan.next();
			names.add(str);
			//names.add(scan.next());
		}
		System.out.println(names);
		
//		String s = names.get(0);
//		System.out.println(s.length());
//		System.out.println(names.get(0).length());
		
		int longIdx = 0;
		// 이름이 가장 긴값을 출력
		for(int i=1;i<names.size();i++){
			if(names.get(longIdx).length() < names.get(i).length()){
				longIdx = i;
			}			
		}
		System.out.println("가장 긴 이름 : "+names.get(longIdx));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
