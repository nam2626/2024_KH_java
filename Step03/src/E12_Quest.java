import java.util.Scanner;

public class E12_Quest {
	
	public static void main(String[] args) {
		//숫자 두개를 입력 받은 후
		//입력 두 숫자의 뺄셈 결과를 출력하세요.
		//단 뺄셈의 결과를 무조건 양수로 출력을 해야 합니다.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 입력 > ");
		int n1 = sc.nextInt();
		
		System.out.println("두번째 숫자 입력 > ");
		int n2 = sc.nextInt();
		
		//Case 1
		System.out.println(n1 > n2 ? n1 - n2 : n2 - n1);
		
		//Case 2
		int result = n1 - n2;
		System.out.println(result < 0 ? -result : result);
	}

}







