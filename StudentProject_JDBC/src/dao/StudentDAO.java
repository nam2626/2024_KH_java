package dao;

import java.sql.SQLException;
import java.util.ArrayList;

import config.DBConfig;
import dto.StudentDTO;
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

	public ArrayList<StudentDTO> selectAllStudent(){
		
		//학생 정보를 전부 읽어오는 작업
		//학번 이름 학과명 평점 성별 --> 학과, 학생 테이블 조인해서 sql문 실행
		
		
		return null;
	}
	
}








