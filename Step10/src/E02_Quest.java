
public class E02_Quest {
	//랜덤으로 매개변수로 받은 범위로 배열에 저장
	public static void initArray(int[] arr, int min, int max) {
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * (max - min + 1)) + 1;
		}
	}
	
	/**
	 * 배열을 하나 매개변수 받아서 홀수 개수를 리턴하는 메서드 
	 * @param arr 홀수 개수를 구할 정수형 배열
	 * @return 홀수의 개수 결과값
	 */
	public static int oddCountArray(int[] arr) {
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] %  2 == 1)
				count++;
		}
		return count;
	}
	//정수형 배열을 하나 매개변수로 받아서 홀수 목록을 문자열로 만들어서 리턴하는 메서드
	//결과 예시 >>   1 3 5 7
	public static 
	
	public static void main(String[] args) {
		//길이가 10인 정수형 배열 생성
		int[] arr = new int[10];
		//랜덤으로 숫자 1~20 범위로 생성한 배열에 저장
		initArray(arr,1,20);
		//배열에 저장된 내용 중 홀수 개수를 출력
		int count = oddCountArray(arr);
		System.out.println("홀수 개수 : " + count);
		//배열에 저장된 홀수만 출력
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 1)
				System.out.print(arr[i] + " ");
		}
		
	}

}






