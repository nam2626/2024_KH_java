package controller;

import java.util.ArrayList;

import dto.StudentDTO;
import service.StudentService;

public class FilterController extends Controller {
	@Override
	public void execute() {
		System.out.println("평점이 3.0이상인 데이터를 조회합니다....");
		ArrayList<StudentDTO> list = StudentService.getInstance().filterStudent();
		
		if(list.isEmpty()) {
			System.out.println("평점이 3.0 이상인 데이터가 없습니다.");
		}else {
			for (StudentDTO studentDTO : list) {
				studentDTO.printInfo();
			}
		}
		
	}
}











