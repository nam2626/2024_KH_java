import java.util.Scanner;

public class E05_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수하나를 입력 받은 후에
		//해당 숫자가 짝수면 true, 홀수면 false가 출력되게끔 처리
		//숫자 0은 짝수로 취급
		System.out.println("숫자 하나 입력 >");
		int n = sc.nextInt();
		System.out.println(n % 2 == 0); 
		
	}

}
