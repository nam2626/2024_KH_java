import java.util.Arrays;
import java.util.Scanner;

public class E06_ArrayEx8 {

	public static void main(String[] args) {
		//길이가 10인 정수형 배열을 생성
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			//1~20까지 숫자를 랜덤으로 생성해서 배열에 저장
			arr[i] = (int)(Math.random() * 20) + 1;
			
		}
		//배열의 내용을 출력 Arrays.toString()을 사용
		System.out.println(Arrays.toString(arr));
		
		//숫자 하나 입력을 받음
		Scanner sc = new Scanner(System.in);
		System.out.print("검색할 숫자 입력 > ");
		int n = sc.nextInt();
		//입력한 숫자가 배열에 있는지 출력
		int result = -1;
		for(int i=0;i<arr.length;i++) {
			//있으면 인덱스 번호를 출력
			//없으면 -1
			if(arr[i] == n) {
				result = i;
				break;
			}
		}
		System.out.println(result);
		//삭제하는 코드 추가
		for(int i = result;i<arr.length-1;i++) {
			arr[i] = arr[i+1];
		}
		System.out.println(Arrays.toString(arr));
	}

}






