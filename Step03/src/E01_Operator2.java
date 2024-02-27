
public class E01_Operator2 {
	/*
	 * 		복합 대입 연산자 : 연산 결과를 왼쪽에 있는 변수에 연산 후 저장(누적)
	 * 			+=	-=	*=	/=	%=
	 */
	public static void main(String[] args) {
		int n = 10;
		//변수 n에 숫자 10을 더해서 저장
		//n = n + 10;
		n += 10;
		System.out.println(n);
		//변수 n에 숫자 5를 뺀다음에 저장
		n -= 5;
		System.out.println(n);
		
		n *= 2;
		System.out.println(n);

		n /= 3;
		System.out.println(n);

		n %= 4;
		System.out.println(n);
		
		//--------------
		String address = "서울시 ";
		address += "영등포구 ";
		address += "당산동 ";
		address += "당산빌딩 11층";
		
		System.out.println(address);
	}

}








