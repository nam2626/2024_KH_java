
public class E06_Quest {
	/*
	 * 		1~100까지 숫자들의 합을 출력
	 */
	public static void main(String[] args) {
		int n = 1;
		int sum = 0;
		while(n < 101) {
			sum += n;
			n++;
		}
		System.out.println(sum);
	}

}
