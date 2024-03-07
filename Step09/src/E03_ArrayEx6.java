import java.util.Arrays;

public class E03_ArrayEx6 {

	public static void main(String[] args) {
		//길이가 5인 정수형 배열 생성, 1,2,3,4,5 로 초기화
		int[] arr = new int[] {1,2,3,4,5};
		
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(arr);
		
		//arr길이가 5인 배열을 10으로 늘림
		//1. 임시배열 생성
		int[] temp = new int[10];
		//2. 원본배열(arr)의 내용을 임시배열로 복사
		for(int i=0;i<arr.length;i++) {
			temp[i] = arr[i];
		}
		//3. arr에 임시배열을 연결
		arr = temp;
		//결과 출력
		System.out.println(Arrays.toString(arr));
		System.out.println(arr.length);
		System.out.println(arr);
		
		temp[0] = 100;
		System.out.println(Arrays.toString(arr));
	}

}







