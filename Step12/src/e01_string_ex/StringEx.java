package e01_string_ex;

import java.util.Arrays;

public class StringEx {
	public static void main(String[] args) {
		String str1 = "Hello World";
		
		//저장하고 있는 문자열을 바이트형 배열로 변환
		byte[] arr = str1.getBytes();
		System.out.println(Arrays.toString(arr));
		//바이트형 배열을 문자열로 변환
		String str2 = new String(arr);
		System.out.println(str2);
		//해당 인덱스 번호에 위치한 문자 하나 리턴
		System.out.println(str1.charAt(4));
		
		String str3 = "Hello World Hello Java World";
		//문자열 왼쪽부터 검색
		System.out.println(str3.indexOf("World"));
		//문자열 왼쪽부터 검색, 7번째 인덱스부터 검색
		System.out.println(str3.indexOf("World",7));
		//문자열 왼쪽부터 검색, 24번째 인덱스부터 검색, 검색 결과가 없으면 -1
		System.out.println(str3.indexOf("World",24));
		//문자열 오른쪽 끝에서부터 검색 - 검색 결과는 인덱스 번호, 결과가 없으면 -1
		System.out.println(str3.lastIndexOf("World"));
		System.out.println(str3.lastIndexOf("World",22));
		
		
		
	}
}







