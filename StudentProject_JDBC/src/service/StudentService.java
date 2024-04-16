package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import dao.StudentDAO;
import dto.StudentDTO;
import exception.StudentException;

public class StudentService {
	private static StudentService instance = new StudentService();
	

	private StudentService() {

	}
	
	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	public void addStudent(StudentDTO dto) throws StudentException {

	}
	
	//학생 데이터 검색
	public StudentDTO searchStudent(String studentNo) {
		return null;
	}
	//학생 데이터 삭제
	public boolean deleteStudent(String studentNo) {
		return true;
	}

	public ArrayList<StudentDTO> filterStudent(){
		ArrayList<StudentDTO> r = new ArrayList<StudentDTO>();
		
		return r;
	}

	public ArrayList<StudentDTO> searchNameStudent(String name) throws StudentException {
		ArrayList<StudentDTO> r = 
				StudentDAO.getInstance().selectNameStudent(name);
				
		if(r.isEmpty())
			throw new StudentException(name+"에 대한 검색 결과가 없습니다.");
		
		return r;
	}

	public ArrayList<StudentDTO> selectAllStudent() {
		return StudentDAO.getInstance().selectAllStudent();
	}
}









