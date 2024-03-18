package e02_overriding;

public class EmployeeMain {
	
	public static void work(Employee e) {
		e.work();
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee();
		SalaryEmployee e2 = new SalaryEmployee();
		DispatchEmployee e3 = new DispatchEmployee();
		
		work(e1);
		work(e2);
		work(e3);
		
	}

}
