package e03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx4 {
	
	//static 메서드
	//숫자 두개를 받아서 나눈 결과를 리턴하는 메서드
	public static int div(int n1, int n2) throws ArithmeticException{
			return n1 /n2;
	}
	
	public static void main(String[] args) {
		//숫자 두개 입력 받아서 위에 만든 메서드를 실행 후 결과 출력
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		try {
			System.out.print("숫자 입력 : ");
			n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			n2 = sc.nextInt();
		
			System.out.println(div(n1,n2));
			
		}catch (ArithmeticException e) {
			System.out.println("0으로 나눌 수 없습니다.");
		}catch (InputMismatchException e) {
			System.out.println("숫자만 입력하세요");
		}
	}

}







