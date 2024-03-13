package e02_method;

public class Employee {
	//사번, 이름, 부서명, 직급명, 연봉
	String employeeNo;
	String employeeName;
	String departmentName;
	String positionName;
	int salary;
	
	//사원데이터 초기화하는 메서드
	void init(String no, String name, String department, String position, int s) {
		employeeNo = no;
		employeeName = name;
		departmentName = department;
		positionName = position;
		salary = s;
	}
	//사원 정보 출력하는 메서드
	//	출력 형태 : 사번 직급 부서명 이름 연봉
	void printEmployeeInfo() {
		System.out.printf("%10s %10s %10s %10s %6d\n",employeeNo,positionName,
				departmentName,employeeName,salary);
	}
}





