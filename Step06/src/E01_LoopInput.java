import java.util.Scanner;

public class E01_LoopInput {
	/*
	 * 	조건식을 이용해서 일괄적으로 계산해서 끝나는 코드를 작성했다면
	 * 	반복문에 데이터 입력을 원하는 만큼 수행해서 작업 결과를 출력하는 코드를 작성
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 숫자를 5번 입력받아서
		 * 입력 받은 숫자들의 총합을 출력
		 */
		int total = 0;
		for(int i=0;i<5;i++) {
			//숫자 입력하는 코드 작성
			System.out.print(i + 1 + "번째 숫자 입력 > ");
			int n = sc.nextInt();
			total += n;
		}
		System.out.println("입력 받은 숫자들의 총합 : " + total);
	}

}










