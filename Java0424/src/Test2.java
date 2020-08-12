// 오늘 날짜정보를 저장하는 객체 Today
// 년,월,일
class Today {
	int year = 2020;
	int month = 4;
	int day = 24;
}

public class Test2 {

	public static void main(String[] args) {

		Today t;
		// System.out.println(t.year + "/"+t.month+"/"+t.day);

		new Today();
		// System.out.println(t.year + "/"+t.month+"/"+t.day);

		t = new Today();
		System.out.println(t.year + "/" + t.month + "/" + t.day);

		System.out.println(new Today().year + "/" + new Today().month + "/" + new Today().day);
        // -> 객체의 직접 접근이 가능은 하나 비효율적인 방법
		
		System.out.println("-------------------------------------------");
		
		System.out.println("기본형 타입 변수");
		int x = 7 ;
		int y = x;
		
		System.out.println("x -> "+x+",y-> "+y);
		
		System.out.println("y값 10으로 변경");
		y = 10;
		
		System.out.println("x -> "+x+",y-> "+y);
		
		System.out.println(" 참조형 데이터 타입 ");
		
		Today d = new Today(); // 2020/4/24
		Today tt = d;
		
		System.out.println("d ");
		System.out.println(d.year+"/"+d.month+"/"+d.day);
		System.out.println("tt ");
		System.out.println(tt.year+"/"+tt.month+"/"+tt.day);
		
		tt.year = 2000; tt.month=1; tt.day=1;
		
		System.out.println("d ");
		System.out.println(d.year+"/"+d.month+"/"+d.day);
		System.out.println("tt ");
		System.out.println(tt.year+"/"+tt.month+"/"+tt.day);
		
		System.out.println("------------------------------");
		
		tt = new Today();
		
		System.out.println("d ");
		System.out.println(d.year+"/"+d.month+"/"+d.day);
		System.out.println("tt ");
		System.out.println(tt.year+"/"+tt.month+"/"+tt.day);
		
		
		
		System.out.println("--------------------------------------");
		
		Today dd;
		//System.out.println(dd.year);
		// -> 컴파일에러 : 객체가 없음
		// * 컴파일러는 실행전 코드의 문제가 있음을 인지하고 에러발생 
		Today ddd = null;
		//System.out.println(ddd.year);
		// -> 실행시 예외 : 객체가 null 이다.
		// * 컴파일러가 실행시 문제가 발생했음을 인지함.
		
		
		
		
		
		
		
		
		
	}
}

