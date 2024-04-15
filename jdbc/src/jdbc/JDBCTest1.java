package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest1 {

	public static void main(String[] args) {
		try {
			//1. 드라이버 클래스 로딩
			Class.forName("oracle.jdbc.OracleDriver");
			System.out.println("드라이버 로딩 완료");
			//2. 데이터 베이스 접속
			Connection conn = 
					DriverManager.getConnection(
							"jdbc:oracle:thin:@127.0.0.1:1521:xe",
							"c##scott", "123456");
			System.out.println("DB 접속완료");
			//3. SQL문 작성
			String sql = "SELECT * FROM PERSON";
			//4. Statement 객체 생성
			Statement stmt = conn.createStatement();
			//5. Statement 객체를 사용해서 SQL문 실행
			ResultSet rs = stmt.executeQuery(sql);
			//6. 결과 출력
			while(rs.next()) {
				/*
				 * //컬럼 번호 순서로 뽑음
				 * System.out.println(rs.getString(1) + " " + rs.getString(2) + " "
				 * +rs.getInt(3));
				 */
				//컬럼명으로 뽑음
				System.out.println(rs.getString("PID") + " " 
						+ rs.getString("PNAME") + " " +rs.getInt("AGE"));
			}
			//7. close
			rs.close();
			stmt.close();
			conn.close();
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
 
	}

}
