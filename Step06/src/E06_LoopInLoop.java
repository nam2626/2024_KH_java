
public class E06_LoopInLoop {

	public static void main(String[] args) {
//		for (int dan = 2; dan < 10; dan++) {
//			System.out.println("--"+dan+"단--");
//			//1~9까지 곱한 구구단 결과를 출력
//			//for문 하나더 작성
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
//			}
//		}
		
		//위에 코드를 while로 바꾸어서 실행
		int dan = 2, i = 1;
		while(dan < 10) {
			System.out.println("--"+dan+"단--");
			i = 1;
			while(i < 10) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
				i++;
			}
			
			dan++;
		}
	}

}





