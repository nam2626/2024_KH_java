package e01_object;

import java.util.Objects;

public class Employee {
	// 사번
	private String employeeNo;
	// 사원명
	private String employeeName;
	// 직급명
	private String positionName;
	// 부서명
	private String departmentName;
	// 급여
	private int salary;

	// 모든 필드 초기화하는 생성자
	public Employee(String employeeNo, String employeeName, String positionName, String departmentName, int salary) {
		super();
		this.employeeNo = employeeNo;
		this.employeeName = employeeName;
		this.positionName = positionName;
		this.departmentName = departmentName;
		this.salary = salary;
	}

	// set/get
	public String getEmployeeNo() {
		return employeeNo;
	}

	public void setEmployeeNo(String employeeNo) {
		this.employeeNo = employeeNo;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getPositionName() {
		return positionName;
	}

	public void setPositionName(String positionName) {
		this.positionName = positionName;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	// toString
	@Override
	public String toString() {
		return "Employee [employeeNo=" + employeeNo + ", employeeName=" + employeeName + ", positionName="
				+ positionName + ", departmentName=" + departmentName + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(employeeNo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Employee))
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(employeeNo, other.employeeNo);
	}




	
	
	
}






