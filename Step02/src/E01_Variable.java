
public class E01_Variable {

	public static void main(String[] args) {
		/*
		 * 		데이터 형태
		 * 			정수 : 양수, 음수, 0
		 * 			실수 : 정수에서 소수점이 추가된 형태
		 * 			문자 : 한 글자
		 * 			문자열 : 문자가 한개 이상 구성된 형태
		 * 			논리 : 참(true), 거짓(false)
		 * 
		 * 		변수(Variable) : 데이터를 하나 저장할 공간
		 */
		
		int num;//num이라는 이름으로 정수형 데이터를 하나 저장할 공간을 임대 받았다.
		//초기화(initialize) : 변수를 만든 후에 데이터를 처음 저장하는 행위
		num = 100;//정수 100을 변수 num에 저장 하겠다.
		System.out.println(num);//num이 저장하고 있는 100을 읽어와서 화면에 출력
		num = 200;
		System.out.println(num);
		num = 300;
		System.out.println(num);
		
		int age = 20;//변수를 선언하자마자 초기화
		System.out.println(age);
		
		//정수형 변수 3개를 선언한 뒤 데이터를 각각 10, 20, 30으로 초기화 후에 출력
	}
	
}












