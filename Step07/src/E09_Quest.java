import java.util.Scanner;

public class E09_Quest {
	/*
	 * 	사용자로부터 가위,바위, 보를 입력
	 * 	컴퓨터는 랜덤을 이용해서 가위, 바위 보 값을 랜덤하게 생성
	 * 
	 *  사용자와 컴퓨터의 승 무 패
	 * 
	 *  가위 - 2, 바위 - 1, 보 - 3
	 *  
	 *  
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int user = 0;
		while(true) {
			System.out.println("가위 - 2, 바위 - 1, 보 - 3");
			System.out.print("사용자 > ");
			user = sc.nextInt();
			
			if(user < 1 || user > 3) {
				System.out.println("잘못된 데이터를 입력하셨습니다.");
				System.out.println("다시 입력해 주세요.");
				continue;
			}
			break;
		}
		int com = (int)(Math.random() * 3) + 1;
		
		if(user == com)
			System.out.println("비겼다.");
		else if(user % 3 + 1 == com)
			System.out.println("사용자가 이겼습니다.");
		else
			System.out.println("컴퓨터가 이겼습니다.");
		System.out.println(user + " " + com);
	}

}






