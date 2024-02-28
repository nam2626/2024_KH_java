
public class E01_if {

	public static void main(String[] args) {
		int n = 0;
		
		if(n < 0) {
			System.out.println("음수 입니다.");
		}
		
		//n이 0이면 '0 입니다.' 출력
		if(n == 0) {
			System.out.println("0 입니다.");
		}
		//n이 양수면, '양수 입니다.' 출력
		if(n > 0) 
			System.out.println("양수 입니다.");
		
		System.out.println("프로그램 종료");
	}

}




