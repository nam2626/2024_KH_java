import java.util.Scanner;

public class E06_ElseIfQuest {
	/*
	  	사용자로부터 점수를 입력받아, 다음의 기준으로 등급을 분류하여 출력하는 프로그램을 작성하세요.

		90점 이상: A
		80점 이상 ~ 90점 미만: B
		70점 이상 ~ 80점 미만: C
		60점 이상 ~ 70점 미만: D
		60점 미만: F
		
		95점 이상 A+
		85~89 B+
		75~79 C+
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String grade = "F";
		System.out.print("점수 입력 > ");
		int score = sc.nextInt();
		
		if(score >= 90)
			grade =	"A";
		else if(score >= 80)
			grade =	"B";
		else if(score >= 70)
			grade =	"C";
		else if(score >= 60)
			grade =	"D";
		
		if(score >= 70 && score % 10 >= 5 || score == 100)
			grade += "+";
		
		System.out.println(grade);
	}

}












