package e03_super;

public class Animal {
	protected int age;

	public Animal(int age) {
		this.age = age;
	}
	
	public void printAge() {
		System.out.println("이 동물의 나이 : " + age);
	}
	
	
}
