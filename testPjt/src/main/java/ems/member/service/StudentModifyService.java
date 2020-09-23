package ems.member.service;

import ems.member.Student;
import ems.member.dao.StudentDao;

public class StudentModifyService {

	private StudentDao studentDao;
	
	public StudentModifyService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	public void modify(Student student) {
		// 해당 학생번호의 학생객체가 존재하는지 확인
		if(verify(student.getsNum())) {
			studentDao.update(student);
		} else {
			System.out.println("Student information is not available.");
		}
	}
	
	// student 객체를 반환 받았는지 확인하는 메서드
	public boolean verify(String sNum){
		Student student = studentDao.select(sNum);
		return student != null ? true : false;
	}
}
