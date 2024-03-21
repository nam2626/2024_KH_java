package controller;

import java.util.ArrayList;
import java.util.Scanner;

import service.EmployeeService;
import vo.EmployeeVO;

public class DeleteController implements Controller {

	@Override
	public void execute(Scanner sc) {
		System.out.println("사원정보 삭제를 시작합니다..........");
		System.out.print("삭제할 사원번호 입력 : ");
		String no = sc.nextLine();
		
		ArrayList<EmployeeVO> list = EmployeeService.getInstance().getList();
		
		boolean result = list.remove(new EmployeeVO(no, null, null, null, 0));
		
		if(result)
			System.out.println("사원 정보 삭제 완료");
		else
			System.out.println("사원 정보 삭제 실패");
			
	}

}
