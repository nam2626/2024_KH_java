
public class E14_Array2D {
	/*
	 * 		1   2  3  4  5
	 * 		10  9  8  7  6
	 * 		11 12 13 14 15
	 * 		20 19 18 17 16
	 * 		21 22 23 24 25
	 */
	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int n = 1;
		int col = 0;
		int sw = 1;
		for(int i=0;i<arr.length;i++) {
			//각 행에 숫자 채우기
			while(col < arr[i].length && col > -1) {
				arr[i][col] = n++;
				col += sw;
			}
			sw = -sw;
			col += sw;
			
		}
		
		for (int i = 0; i < arr.length; i++) {
			for(int v : arr[i]) {
				System.out.printf("%2d ",v);
			}
			System.out.println();
		}
		
	}

}
