package e04_interface;

public class TestMain {
	public static void eat(Eat e) {
		e.eat();
	}
	
	public static void main(String[] args) {
		HighSchoolStudent highSchoolStudent = new HighSchoolStudent();
		Dog dog = new Dog();
		Animal animal = new Animal();
		
		eat(animal);
		eat(dog);
		eat(highSchoolStudent);
	}

}




