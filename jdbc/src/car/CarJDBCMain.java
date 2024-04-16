package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import config.DBManager;

public class CarJDBCMain {
	public static void selectAllCar() {
		//Car 테이블에 있는 모든 정보를 조회해서 출력
		//CAR_ID, CAR_NAME, CAR_MAKE_YEAR, CAR_PRICE, CAR_MAKER_NAME
		String sql = "SELECT CAR_ID, CAR_NAME, CAR_MAKE_YEAR, "
				+ "CAR_PRICE, CAR_MAKER_NAME "
				+ "FROM CAR C JOIN CAR_MAKER CM "
				+ "ON C.CAR_MAKER_CODE = CM.CAR_MAKER_CODE";
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = DBManager.getInstance().getConnection();
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1) 
						+ " " + rs.getString(2)
						+ " " + rs.getInt(3)
						+ " " + rs.getInt(4)
						+ " " + rs.getString(5)
						);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBManager.getInstance().close(conn, pstmt, rs);
		}
	}
	public static void insertCar() {
		//자동차 정보한건 입력 받아서 CAR 테이블에 저장
	}
	public static void deleteCar() {
		//삭제할 자동차 ID를 입력 받아서 CAR 테이블에서 삭제 처리
	}
	public static void updateCar() {
		//자동차 금액이 평균 이상인 애들은 금액 10% 할인가로 수정, 소수점은 절삭 
	}
	public static void selectCarName() {
		//자동차 이름을 검색어 일부로 입력 받아서
		//해당 검색어를 포함하고 있는 자동차들을 모두 조회
	}
	public static void main(String[] args) {
		selectAllCar();
	}
}
