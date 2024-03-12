package e02_method;

public class EmployeeMain {
	//평균 연봉 리턴하는 메서드
	public static int avgSalary(Employee[] empList) {
		return 0;
	}
	//전체 사원정보 출력
	public static void printAllEmployeeInfo(Employee[] empList) {
		
	}
	//최고 연봉, 최저 연봉 출력
	public static void printMinMaxSalaryEmployeeInfo(Employee[] empList) {
		
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
		
	}

}
