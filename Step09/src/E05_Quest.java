import java.util.Arrays;
import java.util.Scanner;

public class E05_Quest {
	/*
	 * 	최초의 정수형 배열은 길이가 5인 배열을 생성
	 * 	
	 *  배열에 숫자를 순서대로 입력해 나가면서
	 *  -1을 입력할때까지 계속해서 배열에 숫자를 입력.
	 *  단, 배열에 내용이 전부채워지면 그때마다 배열의 길이를 3씩 늘림
	 *  
	 *  배열에 숫자 입력이 끝나면 입력된 내용을 전부 출력
	 *  배열에 입력된 숫자들의 평균을 출력
	 *  단, 마지막에 입력된 -1은 제외하고 평균을 구하기
	 * 
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 배열 생성, 길이가 5
		int[] arr = new int[5];
		//반복문 -> 무한 루프
		int idx = 0;//입력 받을 배열의 인덱스
		while(true) {
			//배열에 입력할 공간이 없으면 배열을 3개씩 늘려주는 작업
			
			//입력한 숫자가 -1이면 반복문 종료 되게끔 처리
			System.out.print("숫자 입력 > ");
			arr[idx] = sc.nextInt();
			
			if(arr[idx] == -1) break;
			
			idx++;
			
		}
		
		System.out.println(Arrays.toString(arr));
	}

}





