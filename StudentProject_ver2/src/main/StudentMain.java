package main;

import java.util.Scanner;

import controller.RegisterController;
import service.StudentService;

public class StudentMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StudentService service = new StudentService();
		
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
			
			switch(n) {
			case 1:
				RegisterController register = new RegisterController();
				register.execute();
				break;
			case 2:
				service.searchStudent();
				break;
			case 3:
				service.deleteStudent();
				break;
			case 4:
				service.updateStudent();
				break;
			case 5:
				service.printAllStudent();
				break;
			}
		}
	}

}





