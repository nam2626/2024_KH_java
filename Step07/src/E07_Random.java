
public class E07_Random {

	public static void main(String[] args) {
		//(int)(Math.random() * (최대값 - 최소값 + 1)) + 최소값
		//1~10
		for(int i=0;i<10;i++) {
			System.out.printf("%d ",(int)(Math.random() * 10)+1);
		}
		System.out.println();
		System.out.println();
		//7~15
		for(int i=0;i<10;i++) {
			System.out.printf("%d ",(int)(Math.random() * 9)+7);
		}
		System.out.println();
		System.out.println();
		//로또번호
		for(int i=0;i<10;i++) {
			System.out.printf("%d ",(int)(Math.random() * 45)+1);
		}
	}

}






