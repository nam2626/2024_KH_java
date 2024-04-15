package car;

public class CarJDBCMain {
	public static void selectAllCar() {
		//Car 테이블에 있는 모든 정보를 조회해서  출력
		//CAR_ID, CAR_NAME, CAR_MAKE_YEAR, CAR_PRICE, CAR_MAKER_NAME
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
