package e01_inheritance;

public class Person extends Animal {
	
	public Person() {
		System.out.println("Person 생성자");
	}

	public void printAge() {
		System.out.println("나이 : " + age);
	}
}
