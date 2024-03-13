package e04_constructor;

public class PersonMain {
	public static void main(String[] args) {
		Person p1 = new Person();
		p1.printPersonInfo();
		
		Person p2 = new Person("홍길동");
		p2.printPersonInfo();
		
		Person p3 = new Person("김철수", 22);
		p3.printPersonInfo();
	}
}
