package dao;

import java.sql.SQLException;

import config.DBConfig;
import oracle.jdbc.pool.OracleDataSource;

public class StudentDAO {
	private static StudentDAO instance = null;
	private OracleDataSource ods;
	
	private StudentDAO() {
		//ods 접속 정보 이용해서 초기화
		try {
			ods = new OracleDataSource();
			//url, user, passwd 셋팅
			ods.setURL(DBConfig.DB_URL);
			ods.setUser(DBConfig.DB_USER);
			ods.setPassword(DBConfig.DB_PASSWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	public static StudentDAO getInstance() {
		if(instance == null)
			instance = new StudentDAO();
		return instance;
	}

	
	
}
