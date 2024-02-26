import java.util.Scanner;

public class E06_InputNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n1 = 0;
		System.out.println("숫자 입력>");
		n1 = sc.nextInt(); // 실제 숫자가 입력된 후 n1에 저장
		System.out.println("n1 : " + n1);
		
		//실수하나 입력 받아서 출력
		System.out.println("실수 입력 > ");
		double d1 = sc.nextDouble();
		System.out.println("d1 : " + d1);
		
		System.out.println(n1 + d1);
	}

}







