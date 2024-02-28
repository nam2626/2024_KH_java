import java.util.Scanner;

public class E12_Switch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("명령어 입력 >> ");
		String command = sc.next();

		switch(command) {
		case "register":
			System.out.println("회원정보 등록 기능을 실행합니다");
			break;
		case "search":
			System.out.println("회원정보 검색 기능을 실행합니다.");
			break;
		case "delete":
			System.out.println("회원정보 삭제 기능을 실행합니다.");
			break;
		default:
			System.out.println("잘못된 명령어를 입력하셨습니다.");
		}
	
	}
}







