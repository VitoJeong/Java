import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Test3 {

	public static void main(String[] args) {
		// 해쉬 맵에 데이터를 저장 (나라이름, 인구수)
		// => 5개 키보드 입력( 스캐너 사용 )
		// KOR, 5000
		// CHI, 10000
		// USA, 3000
		// SWI, 200
		// FRA, 2500
		// 인구수가 가장 많은 나라의 이름과 인구수를 출력

		HashMap<String, Integer> hm = new HashMap<String, Integer>();

		Scanner scan = new Scanner(System.in);

		// hm.put("KOR", 1000);
		for (int i = 0; i < 5; i++) {
			System.out.println((i + 1) + "번 입력 > ");
			hm.put(scan.next(), scan.nextInt());
		}
		System.out.println(hm);

		// 인구수가 가장 많은 나라의 이름,인구수를 출력
		int max = 0;
		String name = "";
		
		//System.out.println(hm.get("aaa"));
		Set<String> names = hm.keySet();
		// -> 해쉬 맵에 있는 키값만 Set 타입의 형태로 리턴 해주는 메서드
		System.out.println(names);
		
		Iterator<String> it = names.iterator();
		while(it.hasNext()){
			//System.out.println(it.next()); //names 값이 하나씩 사용
			//System.out.println(hm.get(it.next())); // 인구수 출력
			String maxName = it.next(); // 나라이름
			int size = hm.get(maxName); // 인구수
			
			if(max < size){
				max = size;
				name = maxName;
			}			
		}
		
		System.out.println("인구수가 가장많은 나라 : "+name+","+max+"명");
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
