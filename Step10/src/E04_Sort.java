import java.util.Scanner;

public class E04_Sort {
	//전체 배열을 출력하는 메서드
	public static void printArray(int[] arr, int pass) {
		System.out.print(pass + " pass : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void bubleSort(int[] arr) {
		for(int i=0;i<arr.length-1;i++) { //pass
			for(int j=0;j<arr.length-1-i;j++) {//실제 정렬을 수행하는 부분
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			printArray(arr, i+1);
		}
	}
	public static void selectSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			int idx = i;
			for (int j = i + 1; j < arr.length; j++) {
				if(arr[idx] > arr[j])
					idx = j;
			}
			int temp = arr[idx];
			arr[idx] = arr[i];
			arr[i] = temp;
			
			printArray(arr, i+1);
		}
	}
	public static void insertSort() {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		
		for(int i=0;i<arr.length;i++) {
			//1. 숫자 입력
			System.out.print("input number > ");
			arr[i] = sc.nextInt();
			//2. 정렬
			for (int j = i; j > 0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}
			}
			printArray(arr, i+1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = new int[] {5,7,9,3,1};
//		bubleSort(arr);
//		selectSort(arr);
		insertSort();
	}

}










