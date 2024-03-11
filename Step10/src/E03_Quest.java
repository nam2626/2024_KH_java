import java.util.Scanner;

public class E03_Quest {
	public static boolean isPrimeNumber(int n) {
		if(n < 2)
			return false;
		for(int i=2;i<n / 2 + 1;i++) {
			if(n % i == 0)
				return false;
		}
		return true;
	}
	public static void main(String[] args) {
		/*
		 * 	숫자 하나를 입력 받은 후에
		 * 	입력 받은 숫자가 소수인지 아닌지를 출력
		 * 
		 * 	소수 : 한 숫자의 약수가 1과 자기자신 숫자
		 * 	예> 2 3 5 7 11
		 */
		Scanner sc = new Scanner(System.in);
		System.out.print("숫자 입력 > ");
		int n = sc.nextInt();
		
		if(isPrimeNumber(n))
			System.out.println("입력하신 숫자는 소수 입니다.");
		else
			System.out.println("입력하신 숫자는 소수가 아닙니다.");
		
		
	}

}













