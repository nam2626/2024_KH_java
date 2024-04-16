package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import config.DBConfig;
import dto.StudentDTO;
import oracle.jdbc.pool.OracleDataSource;

public class StudentDAO {
	private static StudentDAO instance = null;
	private OracleDataSource ods;

	private StudentDAO() {
		// ods 접속 정보 이용해서 초기화
		try {
			ods = new OracleDataSource();
			// url, user, passwd 셋팅
			ods.setURL(DBConfig.DB_URL);
			ods.setUser(DBConfig.DB_USER);
			ods.setPassword(DBConfig.DB_PASSWD);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static StudentDAO getInstance() {
		if (instance == null)
			instance = new StudentDAO();
		return instance;
	}

	public ArrayList<StudentDTO> selectAllStudent() {
		// 학생 정보를 전부 읽어오는 작업
		// 학번 이름 학과명 평점 성별 --> 학과, 학생 테이블 조인해서 sql문 실행
		String sql = "SELECT S.STD_NO, S.STD_NAME, " + "M.MAJOR_NAME, S.STD_SCORE, S.STD_GENDER "
				+ "FROM STUDENT S JOIN MAJOR M " + "ON S.MAJOR_NO = M.MAJOR_NO";

		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		try (Connection conn = ods.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sql);) {

			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String studentNo = rs.getString(1);
					String studentName = rs.getString(2);
					String majorName = rs.getString(3);
					double score = rs.getDouble(4);
					char gender = rs.getString(5).charAt(0);
					// 데이터를 꺼내서 StudentDTO 객체를 만들어서
					// list에 등록
					list.add(new StudentDTO(studentNo, studentName, 0,
							majorName, score, gender));

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public ArrayList<StudentDTO> selectNameStudent(String name) {
		String sql = "SELECT S.STD_NO, S.STD_NAME, " + "M.MAJOR_NAME, S.STD_SCORE, S.STD_GENDER "
				+ "FROM STUDENT S JOIN MAJOR M " + "ON S.MAJOR_NO = M.MAJOR_NO "
						+ "WHERE S.STD_NAME LIKE '%' || ? || '%'";

		ArrayList<StudentDTO> list = new ArrayList<StudentDTO>();
		try (Connection conn = ods.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1, name);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String studentNo = rs.getString(1);
					String studentName = rs.getString(2);
					String majorName = rs.getString(3);
					double score = rs.getDouble(4);
					char gender = rs.getString(5).charAt(0);
					// 데이터를 꺼내서 StudentDTO 객체를 만들어서
					// list에 등록
					list.add(new StudentDTO(studentNo, studentName, 0,
							majorName, score, gender));

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return list;
	}

	public StudentDTO selectStudent(String studentNo) {
		String sql = "SELECT S.STD_NO, S.STD_NAME, " + "M.MAJOR_NAME, S.STD_SCORE, S.STD_GENDER "
				+ "FROM STUDENT S JOIN MAJOR M " + "ON S.MAJOR_NO = M.MAJOR_NO "
						+ "WHERE S.STD_NO LIKE ?";

		StudentDTO dto = null;
		try (Connection conn = ods.getConnection(); 
				PreparedStatement pstmt = conn.prepareStatement(sql);) {
				pstmt.setString(1, studentNo);
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					String studentName = rs.getString(2);
					String majorName = rs.getString(3);
					double score = rs.getDouble(4);
					char gender = rs.getString(5).charAt(0);
					// 데이터를 꺼내서 StudentDTO 객체를 만들어서
					// list에 등록
					dto = new StudentDTO(studentNo, studentName, 0,
							majorName, score, gender);

				}
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dto;
	}

}
