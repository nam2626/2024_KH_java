package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.pool.OracleDataSource;

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
		try {
			OracleDataSource ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@127.0.0.1:1521/xe");
			ods.setUser("c##scott");
			ods.setPassword("123456");
			
			String sql = "INSERT INTO BOARD_MEMBER "
					+ "VALUES(?,?,STANDARD_HASH(?,'SHA512'),?)";
			
			try(Connection conn = ods.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				pstmt.setString(1, id);
				pstmt.setString(2, name);
				pstmt.setString(3, passwd);
				pstmt.setString(4, nick);
				
				int count = pstmt.executeUpdate();
				System.out.println("적용된 건수 : " + count);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}







