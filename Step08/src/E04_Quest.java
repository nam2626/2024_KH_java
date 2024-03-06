
public class E04_Quest {
	/*
	 * 	길이가 10인 정수형 배열을 생성 한 후 
	 *  원하는 값으로 초기화 한 후에
	 *  배열에 저장된 값들 중 짝수와 홀수의 개수를 출력
	 *  단, 숫자 0은 짝수에 포함 시킴
	 * 
	 */
	public static void main(String[] args) {
		//배열 생성 초기화
		int[] arr = {2,4,6,8,2,7,8,9,1,6};
		
		//짝수, 홀수 개수 저장할 변수 선언
		int even = 0, odd = 0;
		
		//반복문
		//	배열요소를 짝수인지 홀수 인지 판단 카운트
		for(int i = 0;i < arr.length; i++) {
			if(arr[i] % 2 == 0)
				even++;
			else
				odd++;
		}
		//짝수, 홀수 개수를 출력
		System.out.println("홀수 개수 : " + odd);
		System.out.println("짝수 개수 : " + even);
	}

}





