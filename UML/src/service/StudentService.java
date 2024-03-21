package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

import dto.StudentDTO;

public class StudentService {
	private static StudentService instance = new StudentService();
	
	private ArrayList<StudentDTO> list;

	private StudentService() {
		list = new ArrayList<StudentDTO>();
		list.add(new StudentDTO("20201111", "김철수", "컴퓨터공학과", 3.4));
		list.add(new StudentDTO("20201222", "이영희", "경영학과", 3.8));
		list.add(new StudentDTO("20201333", "박민수", "수학과", 3.2));
		list.add(new StudentDTO("20201444", "최유리", "영어영문학과", 3.6));
		list.add(new StudentDTO("20201555", "강민준", "물리학과", 3.0));
		list.add(new StudentDTO("20201666", "김지민", "화학공학과", 3.5));
		list.add(new StudentDTO("20201777", "이예린", "생명과학과", 3.7));
		list.add(new StudentDTO("20201888", "박찬호", "기계공학과", 3.9));
		list.add(new StudentDTO("20201999", "이승엽", "전자공학과", 3.3));
		list.add(new StudentDTO("20202000", "류현진", "컴퓨터소프트웨어학과", 3.1));
	}
	
	public static StudentService getInstance() {
		if(instance == null)
			instance = new StudentService();
		return instance;
	}
	
	//학생 데이터 추가
	public boolean addStudent(StudentDTO dto) {
		if(!list.contains(dto)) {
			list.add(dto);
			return true;//데이터 등록에 성공 했을때 결과값
		}else {
			return false;//데이터 등록에 실패 했을때 결과값
		}
	}
	
	//학생 데이터 검색
	public StudentDTO searchStudent(String studentNo) {
		int result = list.indexOf(new StudentDTO(studentNo, null, null, 0));
		
		if(result == -1)
			return null;
		else
			return list.get(result);
	}
	//학생 데이터 삭제
	public boolean deleteStudent(String studentNo) {
		int result = list.indexOf(new StudentDTO(studentNo, null, null, 0));

		if(result == -1)
			return false;
		
		list.remove(result);
		return true;
	}

	public ArrayList<StudentDTO> getList() {
		return list;
	}
	
	public ArrayList<StudentDTO> filterStudent(){
		ArrayList<StudentDTO> r = new ArrayList<StudentDTO>();
		
		for (StudentDTO dto : list) {
			if(dto.getScore() >= 3.0)
				r.add(dto);
		}
		
		return r;
	}

	public ArrayList<StudentDTO> searchNameStudent(String name) {
		ArrayList<StudentDTO> r = new ArrayList<StudentDTO>();
		
		for(int i=0;i<list.size();i++) {
			//문자열 검색시 해당 문자열이 없으면 인덱스번호 -1을 리턴
			if(list.get(i).getStudentName().indexOf(name) != -1)
				r.add(list.get(i));
		}
		
		return r;
	}
}









