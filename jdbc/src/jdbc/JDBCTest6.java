package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import config.DBManager;

public class JDBCTest6 {

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getInstance().getConnection();
			
			String sql = "SELECT * FROM PERSON";
			stmt = conn.createStatement();
			
			rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("PID") + " " 
						+ rs.getString("PNAME") + " " +rs.getInt("AGE"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.getInstance().close(conn, stmt, rs);
		}
	}

}
