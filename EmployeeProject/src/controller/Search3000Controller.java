package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class Search3000Controller implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("연봉 3000이상의 사원 정보 조회를 시작합니다..........");
		ArrayList<EmployeeVO> list = EmployeeService.getInstance().selectSearchEmployee();
		
		if(list.isEmpty()) {
			System.out.println("해당 사원정보가 없습니다.");
			return;
		}
		
		for(EmployeeVO vo : list) {
			vo.printEmployeeInfo();
		}
	}

}
