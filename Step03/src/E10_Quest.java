import java.util.Scanner;

public class E10_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//나이 하나를 입력 받아서
		//19세 이상이면 성인
		//19세 미만이면 미성년자
		System.out.println("나이 입력>");
		int age = sc.nextInt();
		
		String result = age >= 19 ? "성인" : "미성년자";
		System.out.println(result);
	}

}







