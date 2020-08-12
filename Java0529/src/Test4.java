import java.util.Vector;

public class Test4 {

	public static void main(String[] args) {
		// 백터에 데이터를 저장 
		// 한 학생의 2000 ~ 2009 년 사이의 키를 1년 단위로 저장 
		// 학생이 키가 가장 많이 자란 년도와 크기(cm) 계산하시오.
		// >> 120 122 125 130 139 160 169 173 175 177 
		
		Vector<Double> v = new Vector<Double>();
		v.add(120.0);
		v.add(122.0);
		v.add(125.0);
		v.add(130.0);
		v.add(139d);
		v.add(160d);
		v.add(169d);
		v.add(173d);
		v.add(175d);
		v.add(177d);
		System.out.println(v);
		
		// 키가 가장 많이 자란년도 계산하기 
		// 올해 - 작년 = 수치   가장 큰구간
		// >> 120 122 125 130 139 160 169 173 175 177 
		
		double max = v.get(1) - v.get(0);
		int year = 0;
		
		/*System.out.println(v.get(1) - v.get(0));
		System.out.println(v.get(2) - v.get(1));
		System.out.println(v.get(3) - v.get(2));
		System.out.println(" ....  ");
		System.out.println(v.get(9) - v.get(8));*/
		for(int i=0;i<9;i++){
			//System.out.println(v.get(i+1) - v.get(i));
			double tmp = v.get(i+1) - v.get(i);
			if(max < tmp){
				max = tmp;
				year = 2000 + i;
			}
		}
		
		System.out.println("키가 가장 많이 자란년도 : "+year+"년,"+max+"cm");
		
		
		
		
		
		
		

	}

}
