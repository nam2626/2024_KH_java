package e02_anonyumous;
/*
 * 	익명 클래스(Anonymous Class)
 * 		일회성으로 사용되는 클래스를 정의할 때 사용
 * 		추상크래스나 인터페이스를 확장하는 용도로 사용
 * 
 * 		편의성, 일회성으로 사용할 때, 콜백 함수, 가독형 향상
 * 
 */
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







