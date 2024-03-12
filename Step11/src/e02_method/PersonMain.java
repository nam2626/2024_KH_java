package e02_method;


public class PersonMain {

	public static void main(String[] args) {
		Person p1 = new Person();
		p1.name = "홍길동";
		p1.age = 20;
		p1.printPersonInfo();
		
		Person p2 = new Person();
		p2.init("김철수", 30);
		p2.printPersonInfo();

		Person p3 = new Person();
		p3.init("", -10);
		p3.printPersonInfo();
	}

}



