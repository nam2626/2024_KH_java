package member;

import java.util.Scanner;

public class RegisterMemberMain {

	public static void main(String[] args) {
		//회원정보 한건 입력 받아서 board_member에 저장
		//암호는 암호화 해서 저장 SHA-512
		String id, name, passwd, nick;
		Scanner sc = new Scanner(System.in);

		System.out.println("회원정보 등록을 시작합니다.....");
		System.out.print("아이디 : ");
		id = sc.nextLine();
		
		System.out.print("이름 : ");
		name = sc.nextLine();
		
		System.out.print("암호 : ");
		passwd = sc.nextLine();
		
		System.out.print("닉네임 : ");
		nick = sc.nextLine();
		
		insertMemeber(id,name,passwd,nick);
	}

	private static void insertMemeber(String id, String name, String passwd, String nick) {
		
	}

}







