import java.util.Scanner;

public class E05_Quest {
	/*
	 * 	숫자 0을 입력 할때까지 숫자를 입력 받은 후
	 *  입력한 숫자들 중 홀수만 출력
	 *  반드시 String 타입의 변수를 사용
	 *  
	 *  실행 예시>
	 *  숫자 입력 > 11
	 *  숫자 입력 > 4
	 *  숫자 입력 > 3
	 *  숫자 입력 > 2
	 *  숫자 입력 > 0
	 *  
	 *  홀수 목록 : 11 3
	 */
	public static void main(String[] args) {
		String result = "홀수 목록 : ";
		Scanner sc = new Scanner(System.in);
		
		int n = 0;
		do {
			System.out.print("숫자 입력 > ");
			n = sc.nextInt();
			
			if(n % 2 == 1) {
				result += n + " ";
			}
		}while(n != 0);
		System.out.println(result);
	}

}








