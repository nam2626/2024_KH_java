package e04_constructor;

public class StudentMain {

	public static void main(String[] args) {
		Student std1 = new Student();
		Student std2 = new Student("20201111", "김철수", "컴퓨터공학과", 3.4);
		
		System.out.println(std1.toString());
		System.out.println(std2.toString());
	}

}
