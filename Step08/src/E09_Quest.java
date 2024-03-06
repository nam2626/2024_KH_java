import java.util.Arrays;

public class E09_Quest {
	/*
	 * 	길이가 10인 정수형 배열을 생성한 후
	 * 	10~30 범위의 숫자를 랜덤으로 생성하여
	 *  배열에 저장을 한 후에 전부 출력
	 *  단 배열에는 중복된 내용이 저장되지 않음
	 * 
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = (int) (Math.random() * 21) + 10;
			//중복체크, i 위치 이전까지만 중복체크
			int j;
			for(j = 0 ; j < i; j++) {
				//중복이 되었는지 확인하는 if문
				//중복이 되면 break 정지
				if(arr[i] == arr[j])
					break;
			}
			//중복이 되었으면 다시 데이터를 넣게끔 처리
			if(i != j) {
				i--;
			}
		}
		
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
	}

}









