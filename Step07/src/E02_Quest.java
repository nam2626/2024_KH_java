import java.util.Scanner;

public class E02_Quest {
	/*
	 * 	숫자 0을 입력할 때까지 숫자를 입력 받아서
	 *  0을 입력하면 입력을 멈추고
	 *  그동안 입력한 숫자들의 총합과 평균을 출력 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		int ea = 0;
		while(true) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
			total += n;
			if(n == 0)
				break;
			ea++;
		}

		System.out.println("입력하신 숫자들의 평균 : " + (double)total / ea);
	}

}











