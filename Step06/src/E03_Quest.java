import java.util.Scanner;

public class E03_Quest {
	/*
	 * 	숫자를 10번 입력 받아서
	 * 	입력 받은 숫자들의 평균 값을 출력
	 * 	단, 출력 결과는 소수점까지 표현을 해야함
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int sum = 0;
		//반복문 - 10번
		for(int i=0;i<10;i++) {
		//	입력
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
		//	총합 변수에 누적
			sum += n;
		}
		//평균 출력
		System.out.println("입력하신 숫자들의 평균 : " + sum / 10.0);
	}

}





