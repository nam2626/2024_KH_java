package controller;

import java.util.Scanner;

import service.StudentService;

//학생 정보 등록하는 컨트롤러
public class RegisterController {
	public void execute() {
		//1. 사용자로부터 데이터를 입력 받음
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보 등록을 시작합니다.....");
		System.out.print("학번 입력 : ");
		String studentNo = sc.nextLine();
		System.out.print("이름 입력 : ");
		String studentName = sc.nextLine();
		System.out.print("학과명 입력 : ");
		String majorName = sc.nextLine();
		System.out.print("평점 입력 : ");
		double score = sc.nextDouble();
		sc.nextLine();
		//2. StudentService로 보냄
		StudentService service = new StudentService();
		service.addStudent();
		
		//3. StudentService에서 보낸 결과값을 받음
		//4. 데이터 등록 성공 여부를 출력
	}
}
