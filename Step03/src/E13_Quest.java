import java.util.Scanner;

public class E13_Quest {

	public static void main(String[] args) {
		//숫자 3개를 입력 받은 후
		//입력 받은 숫자들 중 제일 큰 숫자를 출력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("숫자 입력 > ");
		int n1 = sc.nextInt();
		
		System.out.println("숫자 입력 > ");
		int n2 = sc.nextInt();
		
		System.out.println("숫자 입력 > ");
		int n3 = sc.nextInt();
		
		//숫자 두개 비교해서 큰숫자 구함
		int max = n1 > n2 ? n1 : n2;
//		System.out.println(max);
		max = max > n3 ? max : n3;
		System.out.println(max);
		
		max = n1 > n2 ? (n1 > n3 ? n1 : n3) : (n2 > n3 ? n2 : n3);
		System.out.println(max);
	}

}












