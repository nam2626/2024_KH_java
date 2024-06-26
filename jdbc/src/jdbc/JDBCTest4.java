package jdbc;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class JDBCTest4 {

	public static void main(String[] args) {
		OracleDataSource ods = null;
		try {
			ods = new OracleDataSource();
			String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
			String user = "c##scott";
			String passwd = "123456";
			ods.setURL(url);
			ods.setUser(user);
			ods.setPassword(passwd);
			Connection conn = ods.getConnection();
			
			String sql = "SELECT * FROM PERSON";
			Statement stmt = conn.createStatement();
			ResultSet rs = stmt.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getString("PID") + " " 
						+ rs.getString("PNAME") + " " +rs.getInt("AGE"));
			}
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
