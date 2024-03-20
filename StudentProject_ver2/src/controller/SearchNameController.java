package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.StudentDTO;
import service.StudentService;

public class SearchNameController implements Controller {

	@Override
	public void execute() {
		System.out.println("이름으로 검색을 시작합니다....");
		Scanner sc = new Scanner(System.in);
		//1. 이름으로 검색 수행하기 위해 이름일부를 입력
		System.out.print("검색할 이름 일부 입력 : ");
		String name = sc.nextLine();
		
		//2. 검색어를 service로 전달
		//3. 검색결과를 ArrayList로 받음
		ArrayList<StudentDTO> list = StudentService.getInstance().searchNameStudent(name);
		//4. 결과를 출력, 단 검색 결과가 없으면 검색 결과가 없음 메세지 출력
		if(list.isEmpty()) {
			System.out.println("검색 결과가 없습니다.");
		}else {
			for (StudentDTO studentDTO : list) {
				studentDTO.printInfo();
			}
		}
	}

}







