
public class E09_ThreeOperator {
	/*
	 * 		삼항 연산자
	 * 			조건식이 true/false 일때 실행할 연산을 구분해주는 연산자
	 * 		
	 * 		조건식 ? 참일때 실행할 연산 : 거짓일때 실행할 연산;
	 */
	public static void main(String[] args) {
		int n1 = 17, n2 = 10;
		//n1과 n2 중에 큰 값을 result에 저장
		int result = n1 > n2 ? n1 : n2 ;
		System.out.println(result);
	}

}
