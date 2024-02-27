import java.util.Scanner;

public class E07_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반지름 데이터를 하나 입력 받아서
		System.out.println("반지름 하나 입력해주세요 > ");
		int r = sc.nextInt();
		//입력 받은 반지름의 원넓이를 출력
		//원넓이 = 반지름 * 반지름 * 3.1415
		System.out.println(r * r * 3.1415);
		
	}

}
