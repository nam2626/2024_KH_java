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
					//배열 복사(복사할 원본 배열, 복사할 시작 인덱스번호, 복사 받을 배열, 복사 받을 시작 위치, 복사할 개수)
					System.arraycopy(arr, 0, temp, 0, arr.length);
					arr = temp;
				}
				//배열에 숫자 추가
				System.out.print("숫자 입력 > ");
				arr[idx] = sc.nextInt();
				sc.nextLine();
				idx++;
			}else if(command.equals("del")) {
				//삭제 처리
				//삭제할 숫자 입력 받아서 삭제
				System.out.print("삭제할 숫자 입력 > ");
				int n = sc.nextInt();
				sc.nextLine();
				
				for(int i=0;i<idx;i++) {
					//빈자리 없이 메꾸는 작업
					if(arr[i] == n) {
						for(int j=i;j<idx-1;j++) {
							arr[j] = arr[j+1];
						}
						idx--;
					}
				}
			}else if(command.equals("all")) {
				System.out.println(Arrays.toString(arr));
			}else {
				System.out.println("잘못된 명령어를 입력하셨습니다. 다시입력해주세요");
			}
			
		}//end - while
	}

}








