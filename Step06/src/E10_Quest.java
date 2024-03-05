import java.util.Scanner;

public class E10_Quest {
	/*
	 * 	숫자 입력 > 5
	 * 					공백		별	i
	 *      *			4		1	0
	 *     ***			3		3	1
	 *    *****			2		5	2
	 *   *******		1		7	3
	 *  *********		0		9	4
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();

		String line = "";
		for(int i=0;i < n; i++) {
			line = "";
			for (int j = 0; j < n - i - 1; j++) {
				line += " ";
			}
			for(int j=0;j<i*2+1;j++) {
				line += "*";
			}
			System.out.println(line);
		}
	}

}
