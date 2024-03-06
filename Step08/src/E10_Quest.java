import java.util.Arrays;

public class E10_Quest {
	
	public static void main(String[] args) {
		//로또 번호들을 전부 저장
		int[] lottoNum = new int[45];
		
		for (int i = 0; i < lottoNum.length; i++) {
			lottoNum[i] = i+1;
		}
		
//		System.out.println(Arrays.toString(lottoNum));
		//당첨번호 총 7개를 뽑음
		int[] winningNumbers = new int[7];
		//당첨번호를 lottoNum에서 뽑아서 winningNumbers에 저장, 동일한 값은 뽑을수가 없음
		for(int i=0;i<winningNumbers.length;i++) {
			int n = (int)(Math.random()*45);
			
			if(lottoNum[n] != -1) {//뽑은 로또번호가 -1이면 이미 뽑힌번호다.
				winningNumbers[i] = lottoNum[n];//뽑기 완료한 부분
				lottoNum[n] = -1;//뽑은 로또번호는 -1로 초기화
			}else{
				i--;
			}
		}
		//출력형태
		//3 4 21 1 6 44 + 34  <--- 마지막 번호는 보너스 번호
		for(int i=0;i<winningNumbers.length-1;i++) {
			System.out.print(winningNumbers[i] + " ");
		}
		System.out.println("+ " + winningNumbers[winningNumbers.length-1]);
	}

}







