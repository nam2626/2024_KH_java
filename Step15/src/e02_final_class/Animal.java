package e02_final_class;

public class Animal {
	//클래스에 final 키워드가 붙어 있으면 해당 클래스를 상속 받을 수가 없다.
//	public final class Animal {

	private final int age;

	public Animal(int age) {
		this.age = age;
	}
	
	//final이 붙은 메서드는 오버라이딩을 금지 시킨다.
	public final void eat() {
		System.out.println("동물이 먹이를 먹습니다.");
	}
}






