import java.util.Scanner;

public class E10_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("이번 영화의 평점을 입력 하세요(1~5) : ");
			int score = sc.nextInt();
			
			if(score > 5 || score < 1) {
				System.out.println("평점이 1~5가 아니면 다시 입력해 주세요");
				continue;
			}
			
			String str = "";
			for(int i=0;i<score;i++)
				str += "★";
			
			System.out.println("평점 : " + str);
//			System.out.println("평점 : " + "★".repeat(score));
			break;
		}
	}

}


