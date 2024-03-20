package e03_interface;

public class InterMain {

	public static void main(String[] args) {
		InterClass inter = new InterClass();
		inter.interA();
		
		//인터페이스도 변수 타입으로 선언이 가능
		InterA interA =	inter;
		interA.interA();
		
		System.out.println(interA.circleArea(3));
	}

}




