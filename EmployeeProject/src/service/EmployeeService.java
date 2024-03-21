package service;

import java.util.ArrayList;
import java.util.Scanner;

import vo.EmployeeVO;

public class EmployeeService {
	private ArrayList<EmployeeVO> list;
	private static EmployeeService instance = new EmployeeService();
	
	private EmployeeService() {
		list = new ArrayList<EmployeeVO>();
		list.add(new EmployeeVO("20001111", "김철수", "과장", "회계부", 3200));
		list.add(new EmployeeVO("20002112", "박지민", "대리", "마케팅부", 2800));
		list.add(new EmployeeVO("20001113", "이태영", "사원", "인사부", 2500));
		list.add(new EmployeeVO("20002114", "정하늘", "과장", "개발부", 3300));
		list.add(new EmployeeVO("20001115", "최봉준", "차장", "영업부", 3500));
		list.add(new EmployeeVO("20002116", "김유나", "사원", "회계부", 2600));
		list.add(new EmployeeVO("20002117", "한아름", "대리", "개발부", 2900));
		list.add(new EmployeeVO("20001118", "오진우", "과장", "인사부", 3200));
		list.add(new EmployeeVO("20002119", "유세아", "차장", "마케팅부", 3600));
		list.add(new EmployeeVO("20001120", "송태석", "사원", "영업부", 2700));
		list.add(new EmployeeVO("20001121", "강하늘", "대리", "회계부", 2850));
	}

	public static EmployeeService getInstance() {
		if(instance == null)
			instance = new EmployeeService();
		return instance;
	}
	
	public ArrayList<EmployeeVO> getList() {
		return list;
	}

	
	public ArrayList<EmployeeVO> selectSearchEmployee() {
		ArrayList<EmployeeVO> r= new ArrayList<EmployeeVO>();
		
		for(int i=0;i<list.size();i++) {
			if(list.get(i).getSalary()>=3000)
				r.add(list.get(i));
		}
		
		return r;
	}
	
}








