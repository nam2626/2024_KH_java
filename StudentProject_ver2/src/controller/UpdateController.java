package controller;

import java.util.Scanner;

import dto.StudentDTO;
import service.StudentService;

public class UpdateController extends Controller {

	@Override
	public void execute() {
		System.out.println("학생정보 수정을 시작합니다....");
		Scanner sc = new Scanner(System.in);
		System.out.print("수정할 학번 입력 : ");
		String studentNo = sc.nextLine();

		StudentDTO dto = StudentService.getInstance().searchStudent(studentNo);

		if(dto == null) {
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
		
		dto.setStudentName(studentName);
		dto.setMajorName(majorName);
		dto.setScore(score);
	
	}
}
