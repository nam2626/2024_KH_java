package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class PrintAllController implements Controller {

	@Override
	public void execute(Scanner sc) {
		ArrayList<EmployeeVO> list = EmployeeService.getInstance().getList();
		System.out.println("전체 사원 정보를 출력합니다..........");
		
		if(list.isEmpty())
			System.out.println("데이터가 없습니다.");
		
		for(int i=0;i<list.size();i++)
			list.get(i).printEmployeeInfo();
	}

}
