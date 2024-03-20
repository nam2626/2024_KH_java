package controller;

import java.util.ArrayList;

import dto.StudentDTO;
import service.StudentService;

public class PrintAllController extends Controller {

	@Override
	public void execute() {
		System.out.println("전체 학생정보를 출력합니다........");
		ArrayList<StudentDTO> list = StudentService.getInstance().getList();
		for(int i=0;i<list.size();i++) {
			list.get(i).printInfo();
		}
		System.out.println();
	}
}
