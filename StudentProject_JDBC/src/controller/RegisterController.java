package controller;

import java.util.Scanner;

import dto.StudentDTO;
import exception.StudentException;
import service.StudentService;

//학생 정보 등록하는 컨트롤러
public class RegisterController implements Controller{
	
	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		StudentService service = StudentService.getInstance();
		try {
			System.out.println("학생 정보 등록을 시작합니다.....");
			System.out.print("학번 입력 : ");
			String studentNo = sc.nextLine();
			
			if(service.searchStudent(studentNo) != null) {
				throw new StudentException("입력하신 학번은 이미 등록된 학번 입니다.");
			}
			
			System.out.print("이름 입력 : ");
			String studentName = sc.nextLine();
			System.out.print("학과명 입력 : ");
			String majorName = sc.nextLine();
			System.out.print("평점 입력 : ");
			double score = sc.nextDouble();
			sc.nextLine();
	
			service.addStudent(new StudentDTO(studentNo, studentName, majorName, score));
			
			System.out.println("학생 정보 등록 완료");
		}catch (StudentException e) {
			System.out.println(e.getMessage());
		}
	}
}








