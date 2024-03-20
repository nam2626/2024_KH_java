package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import controller.RegisterController;
import controller.SearchController;
import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = StudentService.getInstance();
		
		while (true) {
			System.out.println("1. 학생정보 등록");
			System.out.println("2. 학생정보 검색");
			System.out.println("3. 학생정보 삭제");
			System.out.println("4. 학생정보 수정");
			System.out.println("5. 전체 학생정보 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호를 입력 : ");
			
			int n = sc.nextInt();
			sc.nextLine();
			if(n == 0) break;
			
			Controller controller = HandlerMapping.getInstance().createController(n);
			
			if(controller != null)
				controller.execute();
		}
	}

}





