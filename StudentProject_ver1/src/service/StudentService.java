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
		System.out.println("학생 정보 등록을 시작합니다.....");
		//1. 학번, 이름, 학과명, 평점 입력
		System.out.print("학번 입력 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		//2. 학생 객체 생성
//		StudentDTO dto = new StudentDTO(studentNo, studentName, majorName, score);
		//3. 생성한 객체를 list에 추가
//		list.add(dto);
		list.add(new StudentDTO(studentNo, studentName, majorName, score));
	}
	
	
	//학생 데이터 검색
	
	//학생 데이터 삭제
	
	//학생 데이터 수정
	
	//전체 학생 데이터 출력
	
}
