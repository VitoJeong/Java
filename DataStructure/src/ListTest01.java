import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		// Array index 위주
		// List 순서 위주
		int[] numbers1 = new int[4];
		numbers1[0] = 10;
		numbers1[1] = 20;
		numbers1[2] = 30;
		numbers1[3] = 40;
		System.out.println(Arrays.toString(numbers1));
		
		numbers1[3] = 50;
		System.out.println(Arrays.toString(numbers1));
		
		List list = new ArrayList();
		list.add(0);
		list.add(10);
		list.add(20);
		list.add(30);

		list.add(2, 2);
		
		System.out.println(list);
		
		// array는 길이가 불변, list는 길이가 가변적
		
	}

}
