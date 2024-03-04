import java.util.Scanner;

public class E09_Quest {
	/*
	 * 	숫자 입력 > 5
	 * 				공백		별
	 *      *		4		1
	 *     **		3		2
	 *    ***		2		3
	 *   ****		1		4
	 *  *****		0		5
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
			for(int j=0;j<i+1;j++) {
				line += "*";
			}
			System.out.println(line);
		}
	}

}










