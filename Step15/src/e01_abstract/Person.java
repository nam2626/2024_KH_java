package e01_abstract;

public class Person extends Animal {

	public Person() {
		System.out.println("Person 생성자");
	}

	//추상 메서드는 반드시 오버라이딩 해줘야됨
	//오버라이딩을 안할경우에는 해당 클래스도 추상 클래스로 작성
	@Override
	public void run() {
		System.out.println("사람이 달립니다.");
	}

}
