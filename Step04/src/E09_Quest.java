import java.util.Scanner;

public class E09_Quest {

	public static void main(String[] args) {
		// 사용자로부터 연도를 입력받아서, 해당 년도가 윤년인지 아닌지 판별하는 코드를 작성
		// 윤년은 규칙
		// 4로 나누어서 떨어지는 해는 윤년입니다.
		// 100으로 나누어서 떨어지는 해는 윤년이 아닙니다.
		// 400으로 나누어 떨어지는 해는 윤년입니다.
		Scanner sc = new Scanner(System.in);
		System.out.print("연도 입력 > ");
		int year = sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println(year + "는 윤년입니다.");
		} else {
			System.out.println(year + "는 윤년이 아닙니다.");
		}
	}

}












