
public class E03_Continue {
	/*
	 * 	continue
	 * 		반복문에서 남은 작업을 무시하고 다음 회차로 넘어갈때 사용
	 * 		특정 상황에서 해당 반복을 수행하지 않고 다음 반복회차로 넘어갈때 사용
	 */
	public static void main(String[] args) {
		//1~10까지 정수 중 짝수만 출력
		for(int i=1;i<11;i++) {
			if(i % 2 == 1)
				continue;
			System.out.println(i);
		}
	}

}
