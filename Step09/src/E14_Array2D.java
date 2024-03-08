
public class E14_Array2D {
	/*
	 * 		1  2  3  4  5
	 * 		6  7  8  9  10
	 * 		11 12 13 14 15
	 * 		16 17 18 19 20
	 * 		21 22 23 24 25
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		
		for(int i=0;i<arr.length;i++) {
			
			//각 행에 숫자 채우기
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int v : arr[i]) {
				System.out.printf("%2d ",v);
			}
			System.out.println();
		}
		
	}

}
