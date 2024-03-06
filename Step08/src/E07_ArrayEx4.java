
public class E07_ArrayEx4 {

	public static void main(String[] args) {
		//길이가 10인 정수형 배열 생성
		int[] arr = new int[10];
		//Math.random()을 이용해서 1~30까지 범위로 숫자를 랜덤으로 뽑아서 배열에 저장
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int)(Math.random() * 30) + 1;
		}
		
		//배열의 전체 내용을 출력
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}

}
