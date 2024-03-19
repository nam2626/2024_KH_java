package e01_object;

public class EmployeeMain {

	public static void main(String[] args) {
		Employee e1 = new Employee("20201111", "김철수", "과장", "회계", 3200);
		Employee e2 = new Employee("20201111", "김철수", "과장", "회계", 3200);
		
		System.out.println(e1.equals(e2));
	}

}
