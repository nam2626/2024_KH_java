import java.util.Arrays;

public class E02_Quest {

	public static void main(String[] args) {
		//길이가 20인 정수형 배열을 생성
		//값을 1~20까지 저장
		int[] arr = new int[20];
		for(int i=0;i<arr.length;i++)
			arr[i] = i+1;
		
		//배열에 있는 내용을 자유롭게 섞는 작업
		for(int i=0;i<arr.length;i++) {
			int idx = (int)(Math.random() * arr.length);
			
			int temp = arr[i];
			arr[i] = arr[idx];
			arr[idx] = temp;
		}
		
		//-----------------------------
		System.out.println(Arrays.toString(arr));
	}

}





