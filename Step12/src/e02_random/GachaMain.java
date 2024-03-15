package e02_random;

import java.util.Arrays;
import java.util.Scanner;

public class GachaMain {
	public static int[] count = new int[5];

	public static void gachaCount(String[] arr) {
		for (String item : arr) {
			switch (item) {
			case "S":
				count[0]++;
				break;
			case "A":
				count[1]++;
				break;
			case "B":
				count[2]++;
				break;
			case "C":
				count[3]++;
				break;
			case "F":
				count[4]++;
				break;
			}
		}
		double total = 0;
		for (int i : count) {
			total += i;
		}
		System.out.println(String.format("%d %d %d %d %d", count[0], count[1],
				count[2], count[3], count[4]));
		System.out.println(String.format("%g %g %g %g %g", count[0] / total, 
				count[1] / total, count[2] / total,
				count[3] / total, count[4] / total));
	}

	public static void main(String[] args) {
		GachaBox box = GachaBox.getInstance();
		int totalMoney = 0;
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("뽑기할 개수(-1 입력시 종료) : ");
			int n = sc.nextInt();
			if (n == -1)
				break;
			String[] arr = box.drawItem(n);
			System.out.println(Arrays.toString(arr));
			totalMoney += n * 3300;
			System.out.println("현재 사용한 금액 : " + totalMoney);
			gachaCount(arr);
		}

	}

}
