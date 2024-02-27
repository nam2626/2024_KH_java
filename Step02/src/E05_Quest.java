import java.util.Scanner;

public class E05_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//정수형 변수 두개 선언하여 정수 두개를 입력 받은 후에
		//사칙연산 결과를 출력
		int n1 = 0, n2 = 0;
		System.out.println("첫번째 숫자 입력 >");
		n1 = sc.nextInt();
		System.out.println("두번째 숫자 입력 >");
		n2 = sc.nextInt();
		
		System.out.println(n1 + n2);
		System.out.println(n1 - n2);
		System.out.println(n1 * n2);
		System.out.println(n1 / n2);
		System.out.println(n1 % n2);
		
	}

}
