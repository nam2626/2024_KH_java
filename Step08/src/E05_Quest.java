import java.util.Scanner;

public class E05_Quest {
	/*
	 * 	정수형 배열 길이가 7인 배열을 생성한 뒤에
	 * 	배열에 숫자를 전부 사용자로부터 입력을 받아서 저장한 후에
	 * 	배열에 있는 모든 값을 출력
	 * 
	 * 	예시>
	 * 	0번째 숫자 입력 : 3
	 * 	1번째 숫자 입력 : 4
	 *  ...
	 *  6번째 숫자 입력 : 5
	 * 	
	 * 	3 4 ... 5
	 * 
	 * 	Arrays.toString은 사용하지 않는다.
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//길이가 7인 정수형 배열 생성
		int[] arr = new int[7];
		
		//배열에 데이터 입력
		for(int i = 0; i < arr.length; i++) {
			System.out.print(i+"번째 입력 > ");
			arr[i] = sc.nextInt();
		}
		
		//배열에 있는 데이터를 처음부터 마지막까지 출력
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println(3);
		//배열에 있는 내용을 전부 출력
		for(int n : arr) {
			System.out.print(n + " ");
		}
	}
	

}











