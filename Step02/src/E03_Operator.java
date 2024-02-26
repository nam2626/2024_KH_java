
public class E03_Operator {
	/*
	 * 		사칙 연산자
	 * 			+	덧셈
	 * 			-	뺄셈
	 * 			*	곱셈
	 * 			/	나눗셈 - 몫
	 * 			%	나눗셈 - 나머지
	 */
	public static void main(String[] args) {
		//정수형 변수 두개 선언하여, 임의의 값으로 초기화
		int n1 = 10, n2 = 7;
		//연산 결과 저장할 정수형 변수
		int result = 0;
		
		//n1과 n2의 덧셈 결과를 result에 저장, 이때 n1과 n2의 값은 안바뀜
		result = n1 + n2;
		//n1 = 100;
		System.out.println(result);
		
		result = n1 - n2;
		System.out.println(result);

		result = n1 * n2;
		System.out.println(result);
		
		result = n1 / n2;
		System.out.println(result);
		
		result = n1 % n2;
		System.out.println(result);
		
		//실수형 변수 2개 선언 후 임의의 값으로 초기화
		//사칙연산 결과 출력
		double d1 = 0.3, d2 = 0.1;
		System.out.println(d1 + d2);
		System.out.println(d1 - d2);
		System.out.println(d1 * d2);
		System.out.println(d1 / d2);
		System.out.println(d1 % d2);
		
	}
}








