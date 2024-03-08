import java.util.Arrays;
import java.util.Scanner;

public class E10_Quest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//정수형 배열 생성, 길이 10
		int[] arr = new int[5];
		int idx = 0;
		
		while(true) {
			System.out.println("add : 숫자 추가");
			System.out.println("del : 숫자 삭제");
			System.out.println("all : 전체 숫자 출력");
			System.out.println("exit : 프로그램 종료");
			System.out.print("원하시는 명령어를 입력 하세요 : ");
			String command = sc.nextLine();
			
			if(command.equals("exit")) {
				break;
			}else if(command.equals("add")) {
				//배열에 저장할 공간이 없으면 길이를 5씩 늘림
				if(idx == arr.length) {
					int[] temp = new int[arr.length+5];
					//배열 복사
					System.arraycopy(arr, 0, temp, 0, arr.length);
					arr = temp;
				}
				//배열에 숫자 추가
				System.out.print("숫자 입력 > ");
				arr[idx] = sc.nextInt();
				sc.nextLine();
				idx++;
				System.out.println(Arrays.toString(arr));
			}
			
		}//end - while
	}

}








