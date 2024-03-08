import java.util.Arrays;
import java.util.Scanner;

public class E11_Quest {
	/*
	 * 	정수형 배열 길이가 10인 배열을 생성 한뒤에
	 *  입력한 숫자가 짝수면 맨뒤에서부터 채움
	 *  입력한 숫자가 홀수면 맨앞에서부터 채움
	 *  입력이 끝나면 전체 내용을 출력
	 *  숫자 입력 : 1
	 *  [1,0,0,0,0,0,0,0,0,0]
	 *  
	 *  숫자 입력 : 4
	 *  [1,0,0,0,0,0,0,0,0,4]
	 *  
	 *  숫자 입력 : 3
	 *  [1,3,0,0,0,0,0,0,0,4]
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[10];
		int start = 0, end = arr.length-1;
		
		while(start<=end) {
			System.out.print("숫자 입력 > ");
			int n = sc.nextInt();
			
			if(n % 2 == 0) {
				arr[end--] = n;
			}else {
				arr[start++] = n;
			}
		}
		System.out.println(Arrays.toString(arr));
		
		
	}

}













