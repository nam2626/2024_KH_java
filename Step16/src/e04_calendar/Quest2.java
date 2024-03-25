package e04_calendar;

import java.util.Calendar;
import java.util.Date;

public class Quest2 {
	/*
	 * 오늘 날짜 기준으로 수능까지 몇일 남았는지 출력
	 * getTime, 밀리초(1000이면 1초) --> Date
	 * 
	 * Calendar.DAY_OF_YEAR -> Calendar 
	 * 
	 */
	public static void main(String[] args) {
		Date today = new Date(124,2,22);
		Date sooday = new Date(124, 10, 14);
		
		System.out.println((sooday.getTime() - today.getTime()) / (1000 * 60 * 60 * 24));
		
		Calendar t = Calendar.getInstance();
		Calendar s = Calendar.getInstance();
		s.set(2024, 10, 14);
		
		System.out.println(s.get(Calendar.DAY_OF_YEAR) - t.get(Calendar.DAY_OF_YEAR));
	}

}






