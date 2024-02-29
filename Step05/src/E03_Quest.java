import java.util.Scanner;

public class E03_Quest {
	/*
	 * 	양수 하나를 입력 받아서
	 * 	입력 받은 개수만큼 Hello World를 출력
	 * 
	 * 	실행 예>
	 * 		숫자 입력 > 6
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 * 		Hello World
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 > ");
		int count = sc.nextInt();
		//case 1
		int i = 0;
		
		while(i < count) {
			System.out.println("Hello World");
			i++;
		}
		System.out.println("------------");
		//case 2
		while(count > 0) {
			System.out.println("Hello World");
			count--;
		}
	}

}















