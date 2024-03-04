import java.util.Scanner;

public class E03_Quest_While {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int sum = 0, i = 0;
		
		while ( i < 10 ) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
			sum += n;
			i++;
		}
		
		System.out.println("입력하신 숫자들의 평균 : " + (double)sum / i);
	}

}




