package com.itwill.db;

public class ItwillDTO {
	// 자바빈 => 객체를 저장해서 사용
	// (테이블에 있는 정보를 한번에 저장하기위해서)
	
	private int idx;
	private String name;
	private String gender;
	private int age;
	private String jumin;
	
	// set/get
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJumin() {
		return jumin;
	}
	public void setJumin(String jumin) {
		this.jumin = jumin;
	}
	
	@Override
	public String toString() {
		return "ItwillDTO [idx=" + idx + ", name=" + name + ", gender=" + gender + ", age=" + age + ", jumin=" + jumin
				+ "]";
	}	

}
