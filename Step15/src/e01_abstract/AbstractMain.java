package e01_abstract;

public class AbstractMain {

	public static void main(String[] args) {
//		Animal animal = new Animal();
		Person p = new Person();
		p.run();
		p.eat();
		
		Dog d = new Dog();
		d.eat();
		d.run();
		//추상클래스도 데이터 타입, 자식 클래스를 형변환 시켜서 저장
		Animal animal = p;
		animal.run();
	}

}





