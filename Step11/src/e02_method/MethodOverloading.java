package e02_method;

public class MethodOverloading {
	// 메서드명이 중복일 때 처리하는 방법
	// 1. 리턴 타입과는 상관 없음
	// 2. 매개변수 개수가 다르면 됨
	// 3. 매개변수 개수가 같다면 매개변수들의 변수타입이 서로 다르거나, 순서가 다르면 됨
	public static int sum(int n1, int n2) {
		return n1 + n2;
	}
	public static int sum(int n1, int n2, int n3) {
		return n1 + n2 + n3;
	}
	public static double sum(double d1, double d2) {
		return d1 + d2;
	}
	public static short sum(short s1, short s2) {
		return (short) (s1 + s2);
	}
	public static void main(String[] args) {
		System.out.println(sum(1,2));
		System.out.println(sum(1,2,3));
		System.out.println(sum(1.1,2.2));
	}


}



