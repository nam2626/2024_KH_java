import java.util.Scanner;

public class E07_StringArray {

	public static void main(String[] args) {
		String[] arr1 = new String[5];
		
		//배열내용 전부 출력
		String result = "";
		for(int i=0;i<arr1.length;i++) {
			result += arr1[i];
		}
		System.out.println(result);
		
		Scanner sc = new  Scanner(System.in);
	}

}
