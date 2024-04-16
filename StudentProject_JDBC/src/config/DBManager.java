package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {
	private static DBManager instance = null;
	private Connection conn;
	private DBManager() {
		try {
			//1. 드라이버 클래스 로딩
			Class.forName(DBConfig.DB_DRIVER);
			//2. 데이터 베이스 접속
			conn = DriverManager.getConnection(
					DBConfig.DB_URL,
					DBConfig.DB_USER, DBConfig.DB_PASSWD);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public static DBManager getInstance() {
		if(instance == null)
			instance = new DBManager();
		return instance;
	}

	public Connection getConn() {
		return conn;
	}

	public void close(Connection conn, Statement stmt, ResultSet rs) {
		try {
			if(conn != null) conn.close();
			if(stmt != null) stmt.close();
			if(rs != null) rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	
}


