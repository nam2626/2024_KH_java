import java.util.Scanner;

public class E06_Quest {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성한 후에
	 * 	정수를 입력받아서 배열의 각 요소에 전부 저장한 후
	 * 	배열에 저장된 값들 중 최대값, 최소값, 배열의 총합을 출력
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1. 배열 생성
		int[] arr = new int[10];
		
		//2. 숫자 입력 받아서 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			System.out.print("숫자 입력 > ");
			arr[i] = sc.nextInt();
		}
		//3. 최대값, 최소값, 총합 저장할 변수 선언 및 초기화
		int max, min, total;
		max = min = total = arr[0];//배열의 첫번째 요소로 초기화
		
		//4. 배열에 있는 내용 중 최대값, 최소값, 배열 총합 계산
		for (int i = 1; i < arr.length; i++) {
			total += arr[i];
			max = Math.max(max, arr[i]);
			min = Math.min(min, arr[i]);
		}
		
		//5. 최대값, 최소값, 배열 총합을 출력
		System.out.printf("최대값 : %d, 최소값 : %d, 총합 : %d\n",max,min,total);
	}

}




