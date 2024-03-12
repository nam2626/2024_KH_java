import java.util.Arrays;

public class E06_Quest {
	
	public static double circleArea(double r) {
		return r * r * Math.PI;
	}
	
	public static int squareArea(int width, int height) {
		return width * height;
	}
	
	public static int squareArea(int length) {
		return squareArea(length,length);
	}
	
	public static int maxNumber(int n1, int n2) {
		return n1 > n2 ? n1 : n2;
	}
	
	public static int minNumber(int n1, int n2) {
		return n1 < n2 ? n1 : n2;
	}
	
	public static char toUpperChar(char ch) {
		if(ch >= 'a' && ch <= 'z')
			ch -= 32;
		return ch;
	}
	public static boolean checkDuplicationNumber(int[] arr, int n) {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == n){
				return true;
			}
		}
		return false;
	}
	public static int[] generateLotto() {
		int[] lotto = new int[6];
		
		for (int i = 0; i < lotto.length; i++) {
			int n = (int)(Math.random() * 45) + 1;
			if(checkDuplicationNumber(lotto, n)) {
				i--;
			}else {
				lotto[i] = n;
			}
		
		}
		Arrays.sort(lotto);
		return lotto;
	}
	public static void main(String[] args) {
		System.out.println("반지름 3의 원넓이 : " + circleArea(3));
		System.out.println("가로 3, 세로 5인 직사각형 넓이 : "+squareArea(3, 5));
		System.out.println("길이가 5인 정사각형 넓이 : "+squareArea(5));
		System.out.println(maxNumber(3, 5) + " " + minNumber(3, 5));
		System.out.println(Arrays.toString(generateLotto()));
		System.out.println(Arrays.toString(generateLotto()));
		System.out.println(Arrays.toString(generateLotto()));
		System.out.println(Arrays.toString(generateLotto()));
		System.out.println(Arrays.toString(generateLotto()));
	}

}


