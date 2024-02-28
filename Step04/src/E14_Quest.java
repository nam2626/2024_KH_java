import java.util.Scanner;

public class E14_Quest {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = "F";
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();

		switch(score / 5) {
		case 20:
		case 19:
			grade = "A+";
			break;
		case 18:
			grade = "A";
			break;
		case 17:
			grade = "B+";
			break;
		case 16:
			grade = "B";
			break;
		case 15:
			grade = "C+";
			break;
		case 14:
			grade = "C";
			break;
		case 13:
		case 12:
			grade = "D";
			break;
		}
		
		
		System.out.println(grade);
	}

}







