package config;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.mariadb.jdbc.MariaDbDataSource;

import oracle.jdbc.pool.OracleDataSource;

public class CustomDataSource {
	private DataSource ds;
	public static final int ORACLE = 1;
	public static final int MARIA = 2;

	public CustomDataSource(int db) {
		try {
			switch (db) {
			case ORACLE:
				ds = initOracle();
				break;
			case MARIA:
				ds = initMariaDB();
				break;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public DataSource initOracle() throws SQLException {
		OracleDataSource ods = new OracleDataSource();
		ods.setURL("jdbc:oracle:thin:@127.0.0.1:1521/xe");
		ods.setUser("c##scott");
		ods.setPassword("123456");
		return ods;
	}

	public DataSource initMariaDB() throws SQLException {
		MariaDbDataSource mds = new MariaDbDataSource();
		mds.setUrl("jdbc:mariadb://접속주소:포트번호/DB명");
		mds.setUser("사용자명");
		mds.setPassword("암호");
		return mds;
	}

	public Connection getConnection() throws SQLException {
		return ds.getConnection();
	}

}
