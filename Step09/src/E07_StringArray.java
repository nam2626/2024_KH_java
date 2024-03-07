import java.util.Scanner;

public class E07_StringArray {

	public static void main(String[] args) {
		String[] arr1 = new String[] {"C", "C++","JAVA","HTML","CSS"};
		
		//배열내용 전부 출력
		String result = "";
		for(int i=0;i<arr1.length;i++) {
			result += arr1[i];
		}
		System.out.println(result);
		
		Scanner sc = new  Scanner(System.in);
		//문자열을 입력 받아서
		System.out.print("문자열 입력 > ");
		String str = sc.nextLine();
		//arr1에 해당 문자열이 있는지 없지를 체크해서 출력
		for (int i = 0; i < arr1.length; i++) {
			if(arr1[i].equals(str))//생성된 데이터가 없기 때문에 NullPointException 에러가 발생
				System.out.println("동일문자열 있음");
		}
	}

}









