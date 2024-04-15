package config;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import oracle.jdbc.pool.OracleDataSource;

public class DBManager {
	private static DBManager instance = new DBManager();
	private OracleDataSource ods;

	private DBManager() {
		try {
			// OracleDataSource 생성 및 초기화
			ods = new OracleDataSource();
			String url = "jdbc:oracle:thin:@127.0.0.1:1521/xe";
			String user = "c##scott";
			String passwd = "123456";
			ods.setURL(url);
			ods.setUser(user);
			ods.setPassword(passwd);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static DBManager getInstance() {
		if (instance == null)
			instance = new DBManager();
		return instance;
	}

	public Connection getConnection() throws SQLException {
		return ods.getConnection();
	}

	public void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if (rs != null)
				rs.close();
			if (stmt != null)
				stmt.close();
			if (conn != null)
				conn.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
