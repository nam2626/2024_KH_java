
public class BitOperator {
	/*
	 * 	비트 연산자
	 * 		비트 단위로 연산 ( 0과 1로 하는 연산 )
	 * 
	 *  AND -> & : 두 비트가 둘다 1일때만 1이 되는 연산
	 *  OR -> | : 둘중 하나의 비트 1일때 1이 되는 연산
	 *  NOT -> ~ : 0 -> 1, 1 -> 0 뒤집는 연산
	 *  XOR -> ^ : 두 비트 값이 서로 다를 때 1이 되는 연산
	 *  >> << : 비트를 해당 숫자만큼 해당 방향으로 이동시키는 연산
	 *  >>> : 비트를 오른쪽으로 이동, 부호비트까지 포함해서 이동
	 */
	public static void main(String[] args) {
		int n1 = 14;	//1110
		int n2 = 7;		//0111
		
		//AND 연산결과
		System.out.println(n1 & n2);
		//OR 연산결과
		System.out.println(n1 | n2);
		//XOR 연산결과
		System.out.println(n1 ^ n2);
		//NOT 연산결과
		System.out.println(~n1);
		//쉬프트 연산 <<
		System.out.println(n1 << 1); //28
		System.out.println(n1 << 2); //56
		System.out.println(n1 << 3); //112
		
		n1 = 127;
		System.out.println(n1 >> 1);//63
		System.out.println(n1 >> 2);//31
		System.out.println(n1 >> 3);//15
		
		n1 = -15;
		System.out.println(n1 >> 1);
		System.out.println(n1 << 31);
		
		System.out.println(n1 >>> 1);
	}

}








