
public class E04_ArrayEx7 {

	public static void main(String[] args) {
		//길이가 10인 정수형 배열 생성, 임의의 값 초기화
		int[] arr = {1,2,3,4,5,6,7,8,9,10};
		
		//배열 크기 줄이기
		//1. 임시배열 작성
		int[] temp = new int[5];
		//2. 임시배열에 데이터를 저장
		for(int i = 0;i < temp.length;i++) {
			temp[i] = arr[i];
		}
		//3. 원본 배열에 임시배열을 연결
		arr = temp;
		//4. 결과 출력
		System.out.println(arr);
	}

}




