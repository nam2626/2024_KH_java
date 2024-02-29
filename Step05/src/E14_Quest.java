import java.util.Scanner;

public class E14_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 : ");
		int n = sc.nextInt();

		int fac = 1;

		for (int i = 1; i <= n; i++)
			fac *= i;

		System.out.println(fac);

	}

}




