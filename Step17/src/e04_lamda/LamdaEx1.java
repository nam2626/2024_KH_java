package e04_lamda;

public class LamdaEx1 {
	/*
	 * 	람다
	 * 		함수형 프로그래밍 스타일 지원하는 방법으로 JDK8 버전 부터 도입된 기능입니다.
	 * 		익명 함수의 한 형태로 메서드를 간단하게 표현할 수 있습니다.
	 * 
	 * 		(매개변수) -> 실행할 코드 한줄;
	 * 		
	 * 		(매개변수) -> {
	 * 			실행할 코드 한줄;
	 * 			실행할 코드 한줄;
	 * 			실행할 코드 한줄;
	 * 		}
	 */
	public static void main(String[] args) {
		//Calcurator 익명클래스로 만들어서 덧셈하는 기능을 작성
		Calcurator sum = new Calcurator() {
			@Override
			public int calc(int x, int y) {
				return x + y;
			}
		};
		System.out.println(sum.calc(10, 20));
		//(매개변수) -> 계산식; 계산식 앞에는 return이 생략됨(return이 자동으로 들어감)
		Calcurator minus = (a, b) -> a - b;
		System.out.println(minus.calc(5, 4));
		
		Calcurator total = (a,b) -> {
			//a부터 b까지 합을 리턴하는 메서드 구현
			int s = 0;
			for(int i=a;i<=b;i++)	s += i;
			return s;
		};
		
		System.out.println(total.calc(1, 100));
		
	}

}





