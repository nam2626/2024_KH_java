import java.util.Scanner;

public class E04_Quest {
	/*
	 * 	1. 정수 하나 입력
	 *  2. 입력받은 정수 만큼 정수를 입력 받아서
	 *  3. 입력 받은 정수들 중 짝수의 개수를 출력
	 *  
	 *  실행 예시>
	 *  입력받을 정수 개수 입력 > 5
	 *  숫자 입력 > 1
	 *  숫자 입력 > 2
	 *  숫자 입력 > 3
	 *  숫자 입력 > 4
	 *  숫자 입력 > 5
	 *  입력하신 숫자들 중 짝수의 개수 : 2
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입력받을 정수 개수 입력 >");
		int ea = sc.nextInt();
		int count = 0;
		/*
		for(int i=0;i<ea;i++) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();

			if(n != 0 && n % 2 == 0)
				count++;
		}
		*/
		while(ea-- > 0) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();

			if(n != 0 && n % 2 == 0)
				count++;
		}
		System.out.println("입력하신 숫자들 중 짝수의 개수 : " + count);
	}

}













