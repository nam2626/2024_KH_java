package member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import oracle.jdbc.pool.OracleDataSource;

public class LoginMember {

	public static void main(String[] args) {
		//아이디 / 비밀번호 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("로그인을 시작합니다.....");
		System.out.print("아이디 : ");
		String id = sc.nextLine();
		System.out.print("암호 : ");
		String passwd = sc.nextLine();
		
		//select 문을 사용해서 board_member 테이블에서
		//아이디 값과 비밀번호 암호한 값을 비교해서 검색한 결과를 조회
		boolean result = login(id, passwd);
		
		if(result)
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
	}

	private static boolean login(String id, String passwd) {
		OracleDataSource ods;
		boolean result = false;
		try {
			ods = new OracleDataSource();
			ods.setURL("jdbc:oracle:thin:@127.0.0.1:1521/xe");
			ods.setUser("c##scott");
			ods.setPassword("123456");
			
			String sql = "SELECT * FROM BOARD_MEMBER WHERE "
					+ "BOARD_MEMBER_ID LIKE ? AND "
					+ "BOARD_MEMBER_PASSWD LIKE STANDARD_HASH(?,'SHA512')";
			
			try(Connection conn = ods.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql)){
				
				pstmt.setString(1, id);
				pstmt.setString(2, passwd);
				
				try(ResultSet rs = pstmt.executeQuery()){
					if(rs.next()) {
						System.out.println(rs.getString(1) 
								+ " " + rs.getString(2));
						result = true;
					}
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return result;
	}

}
