
public class E02_VariableType {
	/*
	 * 		변수타입
	 * 			정수형 : byte(1) short(2) int(4) long(8)
	 * 			실수형 : float(4) double(8)
	 * 			문자형 : char(2)
	 * 			논리형 : boolean(1)
	 * 		
	 * 		변수명 짓는 규칙
	 * 			1. 알파벳, 숫자, 특수문자 -> _ $
	 * 			2. 키워드와 동일하면 안됨
	 * 			3. 첫글자로는 숫자가 올 수 없음
	 * 			4. 중복된 변수명을 쓸 수 없음
	 * 
	 * 		변수명 네이밍 규칙
	 * 			1. 변수명의 첫글자는 소문자로 시작
	 * 			2. 합성어의 두번째 단어부터는 첫글자는 대문자
	 * 			
	 */
	public static void main(String[] args) {
		long l = 9223372036854775807L;//long 타입 데이터 양수의 최대값을 저장
		System.out.println(l);
		
		int i = 2147483647;
		System.out.println(i);
		
		short s = 100;
		System.out.println(s);
		
		byte b = 127;
		b++;
		System.out.println(b);
		
		float f = 3.1415f;
		System.out.println(f);
		
		double d = 3.1415;
		System.out.println(d);
		
		char ch1 = 'A';
		System.out.println(ch1);
		
		char ch2 = 'B';
		System.out.println(ch2);
		
		int i1 = ch1;
		System.out.println(i1);
		
		int i2 = ch2;
		System.out.println(i2);
		
		int i3 = 'Z';
		System.out.println(i3);
		
		int i4 = 'a';
		System.out.println(i4);
		
		int i5 = '가';
		System.out.println(i5);
		
		boolean flag = true;
		System.out.println(flag);
		flag = false;
		System.out.println(flag);
		
	}

}













