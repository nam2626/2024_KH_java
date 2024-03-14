package e07_static;

public class Number {
	private static int count = 0;
	//static 영역을 잡아서 객체 생성 하나 함
	private static Number instance = new Number();
	//private 생성자는 외부에서 생성을 못하게 막음
	private Number() {
		System.out.println("Number 객체 생성 완료");
		count++;
	}

	public static Number getInstance() {
		return instance;
	}
	
	public static int getCount() {
		return count;
	}
	
}
