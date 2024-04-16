package car;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

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
		//1. 자동차 정보 한건 입력 - Scanner
		Scanner sc = new Scanner(System.in);
		System.out.print("자동차 아이디 : ");
		String carId = sc.nextLine();
		System.out.print("자동차 이름 : ");
		String carName = sc.nextLine();
		System.out.print("자동차 제조 연도 : ");
		int carMakeYear = sc.nextInt();sc.nextLine();
		System.out.print("자동차 금액 : ");
		int carPrice = sc.nextInt();sc.nextLine();
		System.out.print("자동차 제조사 코드 : ");
		String carMakerCode = sc.nextLine();

		Connection conn = null;
		PreparedStatement pstmt = null;
		//2. SQL문 작성
		String sql = "insert into car values(?,?,?,?,?)";
		//3. Connection 받아옴
		try {
			conn = DBManager.getInstance().getConnection();
			//4. PreparedStatement 생성
			pstmt = conn.prepareStatement(sql);
			//5. SQL문에 데이터 셋팅
			pstmt.setString(1, carId);
			pstmt.setString(2, carName);
			pstmt.setInt(3, carMakeYear);
			pstmt.setInt(4, carPrice);
			pstmt.setString(5, carMakerCode);
			//6. SQL문 실행
			int count = pstmt.executeUpdate();
			//7. 결과 출력
			System.out.println("적용된 건수 : " + count);
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			//8. close
			DBManager.getInstance().close(conn, pstmt, null);
		}
	}
	public static void deleteCar() {
		//삭제할 자동차 ID를 입력 받아서 CAR 테이블에서 삭제 처리
		Scanner sc = new Scanner(System.in);
		System.out.print("자동차 아이디 : ");
		String carId = sc.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getInstance().getConnection();
			String sql = "delete from car where car_id = ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, carId);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "건 삭제 됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.getInstance().close(conn, pstmt, null);
		}
		
	}
	public static void updateCar() {
		//자동차 금액이 평균 이상인 애들은 금액 10% 할인가로 수정, 소수점은 절삭 
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = DBManager.getInstance().getConnection();
			String sql = "UPDATE CAR SET CAR_PRICE = TRUNC(CAR_PRICE * 0.9,0) WHERE CAR_PRICE >= (SELECT AVG(CAR_PRICE) FROM CAR)";
			pstmt = conn.prepareStatement(sql);
			
			int count = pstmt.executeUpdate();
			System.out.println(count + "건 수정 됨");
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			DBManager.getInstance().close(conn, pstmt, null);
		}
	}
	public static void selectCarName() {
		//자동차 이름을 검색어 일부로 입력 받아서
		//해당 검색어를 포함하고 있는 자동차들을 모두 조회
	}
	public static void main(String[] args) {
//		selectAllCar();
//		insertCar();
//		deleteCar();
		updateCar();
	}
}





