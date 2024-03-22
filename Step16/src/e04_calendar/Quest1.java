package e04_calendar;

import java.util.Calendar;

public class Quest1 {

	public static void main(String[] args) {
		// 오늘 날짜 기준으로 택배가 영업일 기준 4일이 소모됨
		// 택배가 도착할 날짜를 계산해서 출력
		Calendar today = Calendar.getInstance();
		today.set(Calendar.DAY_OF_MONTH, 24);
		for(int i=0;i<4;i++) {
			today.add(Calendar.DAY_OF_MONTH, 1);
			
			switch(today.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SATURDAY:
			case Calendar.SUNDAY:
				i--;
			}

		}
		System.out.println(today.getTime());
	}

}







