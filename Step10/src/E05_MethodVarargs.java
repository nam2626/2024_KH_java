
public class E05_MethodVarargs {
	//데이터를 여러개 보낼려면 호출하는 쪽에서 배열로 미리 만들어서 보내야함
	public static void printArray1(int[] arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
	public static void printArray2(int...arr) {
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}
//	public static void errorMethod(int...arr, double ea) {
//		
//	}
	//가변길이 매개변수는 맨 마지막에 사용
	public static void methodEx(double ea, String str, int...arr) {}
	`
	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5};
		printArray1(arr);
		printArray2(1,2,3,4,5,6);
		printArray2(1,2,3,4);
		printArray2(1,2,3,4,5,6,100,700);
	}

}
