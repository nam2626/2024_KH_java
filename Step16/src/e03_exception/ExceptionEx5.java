package e03_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionEx5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = 0, n2 = 0;
		try {
			System.out.print("숫자 입력 : ");
			n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			n2 = sc.nextInt();
		
			if(n2 == 0)
				throw new Exception("0으로 나눌수 없습니다.");
			
			
			System.out.println(n1 / n2);
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}


