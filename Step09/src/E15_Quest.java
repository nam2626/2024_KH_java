
public class E15_Quest {

	public static void main(String[] args) {
		int[][] arr = new int[5][5];
		int row = 0, col = -1, sw = 1, n = 1, k = 5;
		
		while(true) {
			//가로방향으로 채움
			for(int i=0;i<k;i++) {
				col += sw;
				arr[row][col] = n++;
			}
			k--;
			if(k == 0) break;
			//세로방향으로 채움
			for(int i=0;i<k;i++) {
				row += sw;
				arr[row][col] = n++;
			}
			sw = -sw;
		}
		//배열 내용 출력
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}

}









