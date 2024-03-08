
public class Quest2 {

	public static void main(String[] args) {
		//1. 길이가 10인데 9개로 생성
		int[] numbers = new int[10];

		int count = 0;

		//2. 배열 접근하기 위한 조건식이 잘못됨
		while (count < numbers.length) {
			//3. 숫자 생성 범위가 잘못됨
			int randomNumber = (int) (Math.random() * 20)+1;
			//4. 중복처리 부분이 누락
			boolean isDuplicate = false;
			for(int i=0;i<count;i++) {
				if(randomNumber == numbers[i]) {
					isDuplicate = true;
					break;
				}
			}
			if(isDuplicate) continue;
			
			numbers[count] = randomNumber;

			count++;

		}

		System.out.print("중복되지 않은 랜덤 숫자: ");

		for (int i = 0; i < numbers.length; i++) {

			System.out.print(numbers[i] + " ");

		}
	}

}
