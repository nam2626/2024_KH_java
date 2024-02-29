
public class E02_While {

	public static void main(String[] args) {
		//숫자 1~100까지 출력
		int n = 1;
		
		//case 1
		while(n < 101) {
			System.out.print(n + " ");
			n++;
		}
		System.out.println();
		//case 2
		n = 0;
		while(n < 100) {
			n++;
			System.out.print(n + " ");
		}
		System.out.println();
		//case 3
		n = 0;
		while(n++ < 100) 
			System.out.print(n + " ");
		
	}

}




