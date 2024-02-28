import java.util.Scanner;

public class E08_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자 하나 입력 하세요 > ");
		char ch = sc.nextLine().charAt(0);
		
		//입력받은 문자가 소문자면 대문자로 변환, 대문자면 소문자로 변환
		//알파벳이 아니면 아무런 작업을 하지 않아도 됨
		if(ch >= 'A' && ch <= 'Z')
			ch += 32;
		else if(ch >= 'a' && ch <= 'z')
			ch -= 32;
		
		
		System.out.println(ch);
	}

}





