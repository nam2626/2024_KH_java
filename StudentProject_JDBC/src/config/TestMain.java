package config;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TestMain {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getInstance().getConn();
			//3. sql 작성
			String sql = "select * from person where age < ?";
			//4. Statement 생성
			pstmt =conn.prepareStatement(sql);
			//sql 완성
			pstmt.setInt(1, 50);
			//5. ResultSet 실행 결과 받음
			rs = pstmt.executeQuery();
			//6. 결과 출력
			while(rs.next()) {
				System.out.println(rs.getString(1) + " " 
			+ rs.getString(2) + " " + rs.getInt(3));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//7.close
			DBManager.getInstance().close(conn,pstmt,rs);
		}
		
	}

}
