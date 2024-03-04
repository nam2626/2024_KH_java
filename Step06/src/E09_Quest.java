import java.util.Scanner;

public class E09_Quest {
	/*
	 * 	숫자 입력 > 5
	 * 
	 *  *
	 *  **	
	 *  ***
	 *  ****
	 *  *****
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String line = "";
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
		for(int i=0;i<n;i++) {
			line = "";
			for(int j=0;j<i+1;j++) {
				line += "*";
			}
			System.out.println(line);
		}
	}

}





