package e02_anonyumous;

public class AnimalMain {

	public static void main(String[] args) {
		Animal animal = new Animal() {
			
			@Override
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};
		
		animal.eat();
	}

}







