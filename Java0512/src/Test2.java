class Person {
}

class Student extends Person {
}

class Researcher extends Person {
}

class Professor extends Researcher {
}

public class Test2 {
	// result(new Person());
	public static void result(Person p){
		if (p instanceof Person)
			System.out.println("p는 Person 타입입니다.");
		if (p instanceof Student)
			System.out.println("p는 Student 타입입니다.");
		if (p instanceof Researcher)
			System.out.println("p는 Researcher 타입입니다.");
		if (p instanceof Professor)
			System.out.println("p는 Professor 타입입니다.");
		
		System.out.println("--------------------------------");
	}

	public static void main(String[] args) {

		// 객체간의 상속관계를 확인 (instanceof 연산자 사용)

		Person p = new Person();
		// p - Student
		if (p instanceof Student)
			System.out.println("p는 Student 타입입니다.");
		// p - Researcher
		if (p instanceof Researcher)
			System.out.println("p는 Researcher 타입입니다.");
		// p - Professor
		if (p instanceof Professor)
			System.out.println("p는 Professor 타입입니다.");

		System.out.println("p는 Student,Researcher,Professor 아무런 관계 없음");

		System.out.println("--------------------------------------");
		Student s = new Student();
		// s - Person
		if (s instanceof Person)
			System.out.println("s는 Person 타입입니다.");
		// s - Researcher
		// if (s instanceof Researcher)
		// System.out.println("s는 Researcher 타입입니다.");
		// s - Professor
		// if (s instanceof Professor)
		// System.out.println("s는 Professor 타입입니다.");

		System.out.println("--------------------------------------");
		Researcher r = new Researcher();
		// r - Person
		// r - Student
		// r - Professor
		System.out.println("--------------------------------------");
		Professor pro = new Professor();
		// pro - Person
		// pro - Student
		// pro - Researcher
		
		result(new Person());
		result(new Student()); //Person p = new Student();
		result(new Researcher()); // Person p = new Researcher();
		result(new Professor()); // Person p = new Professor();
		

	}

}
