package e02_overriding;

public class DevelopEmployee extends Employee {
	@Override
	public void work() {
		System.out.println("직원이 코드를 짜고 있습니다.");
	}
}
