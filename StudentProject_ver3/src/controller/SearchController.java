package controller;

import java.util.Scanner;

import dto.StudentDTO;
import service.StudentService;

public class SearchController implements Controller {
	
	@Override
	public void execute() {
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 검색을 시작합니다....");
		System.out.print("검색할 학번 입력 : ");
		String studentNo = sc.nextLine();
		
		StudentDTO dto = StudentService.getInstance().searchStudent(studentNo);
		
		if(dto == null) {
			System.out.println("학번에 해당하는 검색 결과가 없습니다.");
		}else {
			dto.printInfo();
		}
		
	}
}









