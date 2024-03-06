
public class E02_ArrayEx2 {

	public static void main(String[] args) {
		//배열 생성과 동시에 초기화 하는 방법 - 1
		int[] arr = {1,2,3,4,5,6};
		
		System.out.println("배열의 길이 : " + arr.length);
		//arr1의 내용을 전부 출력
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("--------");
		//배열 생성과 동시에 초기화 하는 방법 - 2
		int[] arr2 = new int[] {6,7,8,9,10,11,12};
		for (int i = 0; i < arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		System.out.println("--------");
		//길이가 7인 정수형 배열을 생성 후 바로 출력
		int[] arr3 = new int[7];
		for (int i = 0; i < arr3.length; i++) {
			System.out.println(arr3[i]);
		}
	}

}







