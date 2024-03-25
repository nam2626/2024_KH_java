package e04_lamda;

public class LamdaEx1 {

	public static void main(String[] args) {
		//Calcurator 익명클래스로 만들어서 덧셈하는 기능을 작성
		Calcurator sum = new Calcurator() {
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(sum.calc(10, 20));
	}

}
