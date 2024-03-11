import java.util.Scanner;

public class E01_MethodEx {
	/*
	 * 		메서드(method)
	 * 			특정 기능에 해당하는 코드를 묶어서 나타내는 것을 메서드라고함
	 * 			특정 기능 1개를 묶어서 표현을 함
	 * 
	 * 	접근제어자 [static] 반환형 메서드명(매개변수){
	 * 		실행할 코드....
	 * 		....
	 * 		....
	 * 		[return 값;]
	 * 	}
	 */
	//매개변수 : X, 반환 : O
	public static int inputNumber() {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자입력 > ");
		int n = sc.nextInt();
		return n;
	}
	//매개변수 : X, 반환 : X
	public static void printMenu() {
		System.out.println("원하시는 메뉴를 선택하세요");
		System.out.println("1. 덧셈");
		System.out.println("2. 뺄셈");
		System.out.println("3. 곱셈");
		System.out.println("4. 나눗셈");
	}
	//매개변수 : O, 반환 : O
	public static int sum(int n1, int n2) {
		System.out.println(n1 + " " + n2);
		return n1 + n2;
	}
	//매개변수 : O, 반환 : X
	public static void printResult(int result) {
		System.out.println("연산 결과 : " + result);
	}
	public static void main(String[] args) {
//		printMenu();
//		int n = inputNumber();
//		System.out.println(n);
		int result = sum(10,30);
		printResult(result);
	}

}













