package e04_interface;

public class HighSchoolStudent extends Student {

	@Override
	public void eat() {
		System.out.println("고등학생은 야자 중간에 저녁을 먹습니다.");
	}

	@Override
	public void study() {
		System.out.println("고등학생은 10시까지 야자를 합니다.");
	}

}
