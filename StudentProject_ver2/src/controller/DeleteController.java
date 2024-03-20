package controller;

import java.util.Scanner;

import service.StudentService;

public class DeleteController extends Controller {
	@Override
	public void execute() {
		System.out.println("학생정보 삭제를 시작합니다....");
		Scanner sc = new Scanner(System.in);
		//1. 삭제할 학번을 입력 받음
		System.out.print("삭제할 학번 입력 : ");
		String studentNo = sc.nextLine();
		
		boolean result = StudentService.getInstance().deleteStudent(studentNo);
		
		if(result)
			System.out.println("학생 데이터 삭제 완료");
		else
			System.out.println("학생 데이터 삭제 실패");
			
		
	}
}






