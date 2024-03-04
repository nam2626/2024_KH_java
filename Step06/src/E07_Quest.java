
public class E07_Quest {
	/*
	 * 1~10까지의 숫자의 약수 목록을 아래와 같은 형태로 출력
	 * 1
	 * 1 2
	 * 1 3
	 * 1 2 4
	 * 1 5
	 * 1 3 6
	 * 1 7
	 * 1 2 4 8
	 * 1 3 9
	 * 1 2 5 10
	 */
	public static void main(String[] args) {
		for (int n = 1; n <= 10; n++) {
			//System.out.println(n);
			for(int i = 1; i <= n; i++) {
				if(n % i == 0)
					System.out.print(i + " ");
			}
			System.out.println();
		}
	}

}









