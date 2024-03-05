import java.util.Scanner;

public class E05_Quest {
	/*
	 * 숫자 10개를 입력 받은 후에
	 * 제일 큰값, 제일 작은값을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int max = 0;
		int min = 0;
		
		for(int i = 0; i < 10; i++) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
			
			if(i == 0) {
				max = min = n;
				continue;
			}
			
			max = Math.max(max, n);
			min = Math.min(min, n);
		}
		
		System.out.println("최대값 : " + max);
		System.out.println("최소값 : " + min);
	}

}









