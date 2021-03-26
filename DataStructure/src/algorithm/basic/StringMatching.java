package algorithm.basic;

import java.util.ArrayList;
import java.util.List;

public class StringMatching {

	public static void main(String[] args) {
		
		// 단순 문자열 매칭
		String parent = "Hello World!";
		String pattern = "Wo";
		
		System.out.println("============= 단순 문자열 매칭 =============");
		System.out.println(findString(parent, pattern));

		
		// KMP 알고리즘
		String str = "abacaaba";
		List<Integer> list = makeTable(str);
		
		System.out.println("============= KMP 알고리즘 =============");
		System.out.println(list);
		
		String string = "ababacabacaabacaaba";
		pattern = "abacaaba";
		KMP(string, pattern);
	}

	static int findString(String parent, String pattern){
		
		int result = -1;
		for(int i = 0; i < parent.length() - pattern.length(); i++){
			boolean f = true;
			
			for(int j = 0; j < pattern.length(); j++) {
				if(parent.charAt(i+j) != pattern.charAt(j)) {
					f = false;
					break;
				}
			}
			
			if(f) result = i;
		}
		
		return result;
	} // end of findString()
	
	static ArrayList<Integer> makeTable(String pattern){
		
		int len = pattern.length();
		ArrayList<Integer> list = new ArrayList<>();
		int j = 0;
		list.add(j);
		for(int i = 1; i < len; i++){
			while(j > 0 && pattern.charAt(i) != pattern.charAt(j))
			{
				j--;
			}
			if(pattern.charAt(i) == pattern.charAt(j)) j++;
			list.add(j);
		}
		
		
		return list;
	}
	
	
	static void KMP(String parent, String pattern){
		
		List<Integer> list = makeTable(pattern);
		int parentSize = parent.length();
		int patternSize = pattern.length();
		int j = 0;
		for (int i = 0; i < parentSize; i++) {
			while(j > 0 && parent.charAt(i) != pattern.charAt(j))
			{
				j = list.get(j-1);
			}
			if(parent.charAt(i) == pattern.charAt(j)){
				if(j == patternSize -1){
					System.out.printf("%d 인덱스에서 찾았습니다!\n", i - patternSize + 1);
					j = list.get(j);
				} else {
					j++;
				}
			}
		}
	}
	
}
