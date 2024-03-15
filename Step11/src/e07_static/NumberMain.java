package e07_static;

public class NumberMain {
	public static void main(String[] args) {
//		Number n1 = new Number();
		Number n1 = Number.getInstance();
		Number n2 = Number.getInstance();
		Number n3 = Number.getInstance();
		Number n4 = Number.getInstance();
		Number n5 = Number.getInstance();
		Number n6 = Number.getInstance();
		Number n7 = Number.getInstance();
		
		System.out.println(n1.getCount());
		System.out.println(Number.getCount());
	}
}
