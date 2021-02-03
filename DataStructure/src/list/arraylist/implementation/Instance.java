package list.arraylist.implementation;


public class Instance {

	public static void main(String[] args) {

		ArrayList numbers = new ArrayList();
		numbers.addLast(10);
		numbers.addLast(20);
		numbers.addLast(30);
		numbers.addLast(40);
		numbers.add(1, 15);
		numbers.addFirst(5);
		System.out.println(numbers.toString());
		System.out.println(numbers.get(1));
		System.out.println(numbers.get(2));
		System.out.println(numbers.get(3));
		System.out.println(numbers.size());
		System.out.println(numbers.indexOf(70));
	}

}
