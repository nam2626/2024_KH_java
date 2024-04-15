package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest2 {

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:oracle:thin:@127.0.0.1:1521:xe",
							"c##scott","123456");
//			conn.setAutoCommit(false);//auto commit 해제
			System.out.println("DB 접속 완료");
			String sql = "insert into person values('0012','홍길동3',33)";
			Statement stmt = conn.createStatement();
			int count = stmt.executeUpdate(sql);
			System.out.println("적용된 건수 : " + count);
//			conn.commit();//commit 적용
			stmt.close();
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}




