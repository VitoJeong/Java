package algorithm.basic;

public class RabinKarp {
	
	public static void main(String[] args){
		
		// 라빈 카프 알고리즘
		// 해시값을 이용하는 문자열 매칭 알고리즘
		// 시간복잡도 O(n)
		String str = "abacaaba";

		System.out.println(getHash(str));
		
		
		String parent = "ababacabacaabacaaba";
		findString(parent, str);
	}
	
	static int getHash(String str){
		int result = 0;
		int p = 1;
		for (int i = str.length()-1; i >= 0; i--) {
			System.out.printf("%d * %d ^ %d\n",(int)str.charAt(i), 2, i);
			// 자바에서 '^' 연산자는 XOR 연산에 사용
			result += (str.charAt(i) * p);
			p *= 2;
			System.out.println(result);
		}
		return result;
	}

	static void findString(String parent, String pattern){
		
		int parentSize = parent.length();
		int patternSize = pattern.length();
		int parentHash = 0, patternHash = 0, power = 1;
		
		for(int i =0; i<= parentSize - patternSize; i++){
			// 초기화
			if(i==0)
			{
				for(int j = patternSize-1; j >= 0; j--){
					System.out.println(j);
					parentHash += parent.charAt(j) * power;
					patternHash += pattern.charAt(j) * power;
					if(j > 0) power *= 2;
				}
			}
			else
			{
				// 긴 글 해시값  = 2 * (긴 글 해시 값 - 가장 앞에 있는 문자의 수치) + 새롭게 들어온 문자의 수치
				parentHash = 2 * (parentHash - parent.charAt(i-1) * power) + parent.charAt(patternSize - 1 + i);
			}
			if(parentHash == patternHash){
				boolean f = true;
				for(int j=0; j < patternSize; j++){
					if(parent.charAt(i+j) != pattern.charAt(j)){
						f = false;
						break;
					}
				}
				if(f) System.out.printf("%d인덱스에서 발견했습니다!\n", i);
				
			}
		}
		
	}
}