
public class E02_Quest {

	public static void main(String[] args) {
		//길이가 10인 정수형 배열 생성
		int[] arr = new int[10];
		//랜덤으로 숫자 1~20 범위로 생성한 배열에 저장
		for(int i=0;i<arr.length;i++) {
			arr[i] = (int)(Math.random() * 20) + 1;
		}
		//배열에 저장된 내용 중 홀수 개수를 출력
		int count = 0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 1)
				count++;
		}
		System.out.println("홀수 개수 : " + count);
		//배열에 저장된 홀수만 출력
		for(int i=0;i<arr.length;i++) {
			if(arr[i] % 2 == 1)
				System.out.print(arr[i] + " ");
		}
		
	}

}






