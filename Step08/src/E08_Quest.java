import java.lang.reflect.Array;
import java.util.Arrays;

public class E08_Quest {
	/*
	 * 길이가 20인 정수형 배열을 생성한 후에
	 * 생성한 배열에 1~50까지의 범위의 숫자를 랜덤으로 생성해서 저장
	 * 배열에 값이 저장된 후에 홀수와 짝수들을 아래와 같은 형태로 출력
	 * 
	 * 홀수 : 1 3 7 9 11 13 3 5
	 * 짝수 : 2 4 0 10 24 28 70
	 */
	public static void main(String[] args) {
		int[] arr = new int[20];
		
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 50) + 1;
		}
		
//		System.out.println(Arrays.toString(arr));
		String oddList = "홀수 : ";
		String evenList = "짝수 : ";
		for (int i : arr) {
			if(i % 2 == 1)
				oddList += i + " ";
			else
				evenList += i + " ";
		}
		System.out.println(oddList);
		System.out.println(evenList);
	}

}














