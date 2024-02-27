import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		//삼각형 밑변과 높이를 입력 받아서
		System.out.println("삼각형의 밑변을 입력하세요 >");
		double w = sc.nextDouble();
		System.out.println("삼각형의 높이를 입력하세요 >");
		double h = sc.nextDouble();
		//삼각형의 넓이를 출력, 단 출력 결과는 소수점이 반드시 나와야함
		System.out.println(w * h / 2.0);
	}

}







