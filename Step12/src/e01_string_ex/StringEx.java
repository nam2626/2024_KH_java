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
		//알파벳 전부 소문자로 변환
		System.out.println(str3.toLowerCase());
		//알파벳 전부 대문자로 변환
		System.out.println(str3.toUpperCase());
		//글자 길이 리턴
		System.out.println(str3.length());
		//문자열 부분 추출 - 10번 인덱스부터 마지막 인덱스까지 문자열을 잘라내서 리턴 
		System.out.println(str3.substring(10));
		//문자열 부분 추출 - 10번 인덱스부터 15 인덱스전까지 문자열을 잘라내서 리턴 
		System.out.println(str3.substring(10,15));
		//문자열 바꾸기
		System.out.println(str3.replace("World", "Hell"));
		
		String str4 = "        Hello World      ";
		//문자열 개수랑 문자열 출력
		System.out.println(str4.length());
		System.out.println(str4);
		//문자열 양쪽에 필요없는 공백을 제거
		System.out.println(str4.trim());
		System.out.println(str4.trim().length());
		
		String str5 = "java,html,css,javascript,jsp,spring";
		//문자열을 구분자를 기준으로 잘라서 배열로 만들어줌
		String[] result = str5.split(",");
		System.out.println(Arrays.toString(result));
		System.out.println(String.join("/", result));
		
		//문자열 포멧 : %s, %d, %f %g, %o, %x %X, %b, %c
		System.out.println(String.format("이름 : %s, 나이 : %d", "김철수",20));
		System.out.println(String.format("%d %X %o", 10,10,10));
		System.out.println(String.format("%b %c", true, 'F'));
		System.out.println(String.format("%f %g", 3.1415,3.1415));
		
	}
}







