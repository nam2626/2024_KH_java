package service;

import java.util.ArrayList;
import java.util.Scanner;

import dto.StudentDTO;

public class StudentService {
	private ArrayList<StudentDTO> list;

	public StudentService() {
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
	public void searchStudent() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 검색을 시작합니다....");
		System.out.print("검색할 학번 입력 : ");
		String studentNo = sc.nextLine();

		int result = list.indexOf(new StudentDTO(studentNo, null, null, 0));
		
		if(result == -1)
			System.out.println("검색 결과가 없습니다.");
		else
			list.get(result).printInfo();
	}
	//학생 데이터 삭제
	public void deleteStudent() {
		System.out.println("학생정보 삭제를 시작합니다....");
		Scanner sc = new Scanner(System.in);
		//1. 삭제할 학번을 입력 받음
		System.out.print("삭제할 학번 입력 : ");
		String studentNo = sc.nextLine();
		//2. 삭제할 데이터를 list에서 찾음
//		int result = searchStudentList(studentNo);
		int result = list.indexOf(new StudentDTO(studentNo, null, null, 0));

		//3. 검색 결과에 따라서 삭제할 데이터가 있으면 삭제 후 삭제가 완료 되었습니다. 메세지를 출력
		//	 검색 결과가 없으면 삭제할 데이터가 없습니다.
		//	 list.remove(인덱스번호);   
		if(result == -1)
			System.out.println("삭제할 데이터가 없습니다.");
		else
			list.remove(result);
		
	}
	//학생 데이터 수정
	public void updateStudent() {
		System.out.println("학생정보 수정을 시작합니다....");
		Scanner sc = new Scanner(System.in);
		//1. 수정할 학생의 학번을 입력
		System.out.print("수정할 학번 입력 : ");
		String studentNo = sc.nextLine();
		//2. 수정할 학생 정보를 검색
//		int result = searchStudentList(studentNo);
		int result = list.indexOf(new StudentDTO(studentNo, null, null, 0));

		//3. 수정할 학생 정보가 있으면, 이름, 학과명, 평점을 입력받아서 수정
		//	 수정할 학생 정보가 없으면, '수정할 학생정보가 없습니다.' 메세지를 출력
		if(result == -1) {
			System.out.println("수정할 학생 정보가 없습니다.");
			return;
		}
		System.out.print("수정할 이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("수정할 학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("수정할 평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		
		StudentDTO dto = list.get(result);
		dto.setStudentName(studentName);
		dto.setMajorName(majorName);
		dto.setScore(score);
	}
	//전체 학생 데이터 출력
	public void printAllStudent() {
		System.out.println("전체 학생정보를 출력합니다........");
		for(int i=0;i<list.size();i++) {
			list.get(i).printInfo();
		}
		System.out.println();
	}
}









