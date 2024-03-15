package e02_random;

import java.util.Arrays;
import java.util.Random;

public class GachaBox {
	private final int[] GRADE_EA;
	private final int BOX_EA = 10000;
	private static GachaBox instance = new GachaBox();

	private GachaBox() {
		GRADE_EA = new int[] { (int) (0.0014 * BOX_EA),
				(int) (0.009 * BOX_EA), (int) (0.13 * BOX_EA),
				(int) (0.4 * BOX_EA), (int) (0.4596 * BOX_EA) };
	}

	public static GachaBox getInstance() {
		if(instance == null)
			instance = new GachaBox();
		return instance;
	}

	public String[] generateGachaBox() {
		//가챠박스
		String[] arr = new String[BOX_EA];
		//아이템
		String[] grade = {"S","A","B","C","F"};		

		Random r = new Random();
		int idx = 0;
		for (int i = 0; i < grade.length; i++) {
			for(int j=0;j<GRADE_EA[i];j++) {
				arr[idx++] = grade[i];
			}
		}
		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public String[] drawItem(int ea) {
		return null;
	}
	

}









