import java.util.Scanner;

public class E02_LoopInInput {
	/*
	 * 숫자 0을 입력 할때까지 숫자 입력을 받는 반복문
	 * 마지막에 입력 받은 숫자들의 총합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		int total = 0;
//		while(n != 0) {
//			System.out.print("숫자 입력(0입력시 입력 종료) >");
//			n = sc.nextInt();
//		}
		do {
			System.out.print("숫자 입력(0입력시 입력 종료) >");
			n = sc.nextInt();
			total += n;
		}while(n != 0);
		
		System.out.println("입력하신 숫자들의 총합 : " + total);
		
				
	}

}



