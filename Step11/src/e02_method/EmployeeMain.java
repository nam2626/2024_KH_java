package e02_method;

import java.lang.reflect.Array;

public class EmployeeMain {
	//평균 연봉 리턴하는 메서드
	public static int avgSalary(Employee[] empList) {
		int total = 0;
		for (int i = 0; i < empList.length; i++) {
			total += empList[i].salary;
		}
		return total / empList.length;
	}
	//전체 사원정보 출력
	public static void printAllEmployeeInfo(Employee[] empList) {
		for (int i = 0; i < empList.length; i++) {
			empList[i].printEmployeeInfo();
		}
	}
	//최고 연봉, 최저 연봉 출력
	public static void printMinMaxSalaryEmployeeInfo(Employee[] empList) {
		int max = 0, min = 0;
		for (int i = 1; i < empList.length; i++) {
			if(empList[i].salary > empList[max].salary)
				max = i;
			if(empList[i].salary < empList[max].salary)
				min = i;
		}
		System.out.print("최고 연봉자 : ");
		empList[max].printEmployeeInfo();
		System.out.print("최저 연봉자 : ");
		empList[min].printEmployeeInfo();
		
	}
	
	
	public static void main(String[] args) {
		Employee[] empList = new Employee[] {
			new Employee(),
			new Employee(),
			new Employee(),
			new Employee(),
			new Employee()
		};
		
		empList[0].init("11111", "김씨", "회계", "사원", 3200);
		empList[1].init("22222", "이씨", "개발", "대리", 4200);
		empList[2].init("33333", "박씨", "총무", "과장", 4800);
		empList[3].init("44444", "정씨", "시설", "부장", 5200);
		empList[4].init("55555", "황씨", "마케팅", "차장", 6800);
		
		System.out.println(avgSalary(empList));
		printAllEmployeeInfo(empList);
		printMinMaxSalaryEmployeeInfo(empList);
	}

}
