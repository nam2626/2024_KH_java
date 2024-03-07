import java.util.Arrays;
import java.util.Scanner;

public class E09_Quest {

	public static void main(String[] args) {
		String str = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
		char[] arr = str.toCharArray();
		
		//검색어를 입력 받아서
		Scanner sc = new Scanner(System.in);
		System.out.print("검색어 입력 : ");
		String search = sc.nextLine();
		char[] s = search.toCharArray();
		
		System.out.println(Arrays.toString(arr));
		System.out.println(Arrays.toString(s));
		
		//해당 검색어가 있는 인덱스 번호를 출력
		int count = 0;
		for(int i=0;i<arr.length-s.length+1;i++) {
			//해당 검색어가 있는지 비교하는 코드
			if(s[0] == arr[i]) {//첫글자와 동일한 글자를 찾음
				boolean check = true;
				for(int j=1;j<s.length;j++) {
					if(s[j] != arr[i+j]) {
						check = false;
						break;
					}
				}
				//단어 동일한지 체크해서 출력
				if(check) 
					count++;
				
			}
		}
		System.out.println("검색어 개수 : "+count);
	}

}







