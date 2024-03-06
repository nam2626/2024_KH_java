
public class E01_ArrayEx1 {
	/*
	 * 		배열(Array)
	 * 			변수 선언시 하나의 변수명으로 
	 * 			동시에 여러개 값을 저장할 공간을 만드는 자료구조
	 * 
	 * 		인덱스(Index) - 0 ~ 배열 길이 - 1
	 * 			동시에 여러개 선언된 배열의 요소들을 구분하는 번호표
	 * 
	 * 		배열 생성 방법
	 * 			변수타입[] 변수명 = new 변수타입[개수];
	 * 
	 */
	public static void main(String[] args) {
		//길이가 5인 정수형 배열을 생성
		int[] arr = new int[5];
		
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;
		arr[3] = 4;
		arr[4] = 5;
//		arr[5] = 6; //인덱스 번호를 벗어나면 런타임 에러가 발생함
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
	}

}








