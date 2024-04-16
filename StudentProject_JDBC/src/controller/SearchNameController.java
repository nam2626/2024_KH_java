package controller;

import java.util.ArrayList;
import java.util.Scanner;

import dto.StudentDTO;
import exception.StudentException;
import service.StudentService;

public class SearchNameController implements Controller {

	@Override
	public void execute() {
		System.out.println("이름으로 검색을 시작합니다....");
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 이름 일부 입력 : ");
		String name = sc.nextLine();

		try {
			ArrayList<StudentDTO> list 
			= StudentService.getInstance().searchNameStudent(name);

			for (StudentDTO studentDTO : list) {
				studentDTO.printInfo();
			}
		
		} catch (StudentException e) {
			e.printStackTrace();
		}

	}

}
