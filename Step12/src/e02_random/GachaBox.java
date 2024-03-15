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
		//arr내용을 랜덤으로 섞음
		for(int j = 0;j < 5;j++) {
			for (int i = 0; i < arr.length / 2; i++) {
				int n = r.nextInt(arr.length);
				String temp = arr[i];
				arr[i] = arr[n];
				arr[n] = temp;			
			}
		}
		
//		System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	public String[] drawItem(int ea) {
		String[] arr = new String[ea];
		final String[] gacha = generateGachaBox();
		Random r = new Random();
		for (int i = 0; i < ea; i++) {
			//0~gacha길이 - 1 숫자를 뽑아서 해당 인덱스에 해당하는 값을 arr 저장
			int n  = r.nextInt(gacha.length);
			//해당위치값이 null이면 숫자 다시 뽑아야됨
			if(gacha[n] == null) {
				i--;
				continue;
			}
			//해당위치값을 null로 변경
			arr[i] = gacha[n];
			gacha[n] = null;
		}
//		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(gacha));
		return arr;
	}
	

}









