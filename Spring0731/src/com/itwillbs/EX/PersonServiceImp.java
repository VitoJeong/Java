package com.itwillbs.EX;

public class PersonServiceImp implements PersonService {

	private String name;
	private int age;
	
	public PersonServiceImp() {
	}
	
	public PersonServiceImp(String name) {
		this.name=name;
	}
	
	public PersonServiceImp(String name,int age) {
		this.name = name;
		this.age = age;
	}	

	// alt + shift + s + r
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void showPerson() {
		// 인터페이스를 구현
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
	}
	
	
	
	
	
	

}
