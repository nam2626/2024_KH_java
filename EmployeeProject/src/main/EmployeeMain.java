package main;

import java.util.Scanner;

import controller.Controller;
import controller.HandlerMapping;
import service.EmployeeService;

public class EmployeeMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while(true) {
			System.out.println("----사원관리 프로그램----");
			System.out.println("1. 사원정보 삭제");
			System.out.println("2. 전체 사원정보 조회");
			System.out.println("3. 연봉 3000이상 사원정보 조회");
			System.out.println("0. 프로그램 종료");
			System.out.print("원하시는 메뉴 번호를 입력하세요 : ");
			int no = sc.nextInt();
			sc.nextLine();
			if(no == 0) break;
			Controller controller = HandlerMapping.getInstance().createController(no);
			if(controller != null)
				controller.execute(sc);
		}		
	}

}
