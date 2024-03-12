package e02_method;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student();
		std1.init("20201111", "김철수", "컴퓨터공학과", 3.42, true);
		std1.printStudentInfo();
	}

}
