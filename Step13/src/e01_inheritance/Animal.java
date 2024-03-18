package e01_inheritance;

public class Animal {
	protected int age;

	public Animal() {
		age = 20;
		System.out.println("Animal 생성자");
	}
	
	public void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}
