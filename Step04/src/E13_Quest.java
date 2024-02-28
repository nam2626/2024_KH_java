import java.util.Scanner;

public class E13_Quest {
	/*
	 * 	100~90 : A
	 * 	 89~80 : B
	 * 	 79~70 : C
	 * 	 69~60 : D
	 *   59~ 0 : F
	 * 
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = "F";
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();

		switch(score / 10) {
		case 10:
		case 9:
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;
		}
		
		
		System.out.println(grade);
	}

}







