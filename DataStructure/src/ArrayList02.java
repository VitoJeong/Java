import java.util.ArrayList;
import java.util.Iterator;

public class ArrayList02 {

	public static void main(String[] args) {
		
		ArrayList<Integer> numbers = new ArrayList();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		
		numbers.add(1,100);
		System.out.println("numbers : " + numbers);
		
		numbers.remove(2);
		System.out.println("numbers : " + numbers);
		System.out.println("numbers(index2) : " + numbers.get(2));
		
		Iterator<Integer> it = numbers.iterator();
		while(it.hasNext()){
			int value = (int) it.next();
			if(value == 30)it.remove();
			
			System.out.println(value);
		}
		
		System.out.println("numbers : " + numbers);
		for(int number : numbers){
			System.out.println(number);
		}
		
	}

}
