import java.util.Scanner;

public class E04_ElseQuest {
	/*
	 * 사용자로부터 나이를 입력 받아서 
	 * 입력받은 나이가 19세 이상이면 성인 이라고 출력  
	 * 입력받은 나이가 19세 미만이면 미성년자 라고 출력
	 * if - else를 이용
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 > ");
		int age = sc.nextInt();
		
		if(age >= 19) {
			System.out.println("성인");
		}else {
			System.out.println("미성년자");
		}
	}

}









