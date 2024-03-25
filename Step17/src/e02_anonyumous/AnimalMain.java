package e02_anonyumous;

public class AnimalMain {
	public static void eat(Animal animal) {
		animal.eat();
	}
	public static void main(String[] args) {
		Animal animal = new Animal() {
			@Override
			public void eat() {
				System.out.println("동물이 먹이를 먹습니다.");
			}
		};
		
		animal.eat();
		
		Animal person = new Animal() {
			@Override
			public void eat() {
				System.out.println("사람이 밥을 먹습니다.");
			}
		};
		person.eat();
		
		eat(animal);
		eat(person);
		eat(new Animal() {
			
			@Override
			public void eat() {
				System.out.println("고양이가 츄르를 먹습니다.");
			}
		});
	}

}







