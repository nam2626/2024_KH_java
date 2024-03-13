package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.StudentDTO;

public class StudentService {
	private ArrayList<StudentDTO> list;

	public StudentService() {
		list = new ArrayList<StudentDTO>();
	}
	//학생 데이터 추가
	public void addStudent() {
		Scanner sc = new Scanner(System.in);
		//1. 학번, 이름, 학과명, 평점 입력
		//2. 학생 객체 생성
		//3. 생성한 객체를 list에 추가
	}
	
	
	//학생 데이터 검색
	
	//학생 데이터 삭제
	
	//학생 데이터 수정
	
	//전체 학생 데이터 출력
	
}
