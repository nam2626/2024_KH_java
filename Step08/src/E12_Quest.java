
public class E12_Quest {

	public static void main(String[] args) {
		String str = "Hello World";

		char[] arr = str.toCharArray();

		// arr의 내용을 전부 대문자로 변환
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z')
				arr[i] -= 32;
		}
		// --------------------
		str = new String(arr);
		System.out.println(str);
		// arr의 내용을 전부 소문자로 변환
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z')
				arr[i] += 32;
		}
		// --------------------
		str = new String(arr);
		System.out.println(str);

	}

}
