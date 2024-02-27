import java.util.Scanner;

public class E06_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//나이 하나를 입력 받아서
		//19세 이상이면 true
		//19세 미만이면 false를 출력
		System.out.println("나이 입력>");
		int age = sc.nextInt();
		System.out.println(age > 18);
	}

}
