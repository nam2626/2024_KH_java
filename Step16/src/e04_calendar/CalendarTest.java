package e04_calendar;

import java.util.Calendar;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar calendar = Calendar.getInstance();
		
		System.out.println(calendar);
		//연도
		System.out.println(calendar.get(Calendar.YEAR));
		//월
		System.out.println(calendar.get(Calendar.MONTH));
		//일
		System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
		//요일
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
		//날짜에 해당하는 요일이 해당월에 몇번째 요일인지?
		System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
		//AM_PM
		System.out.println(calendar.get(Calendar.AM_PM));
		//시간
		System.out.println(calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println(calendar.get(Calendar.HOUR));
		//분
		System.out.println(calendar.get(Calendar.MINUTE));
		//초
		System.out.println(calendar.get(Calendar.SECOND));
		//밀리초
		System.out.println(calendar.get(Calendar.MILLISECOND));
		
		System.out.println(calendar.getTime());
		
		calendar.set(Calendar.YEAR, 1962);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_MONTH, 32);
		System.out.println(calendar.getTime());
		calendar.set(Calendar.DAY_OF_MONTH, 0);
		System.out.println(calendar.getTime());
		
		calendar.setTimeInMillis(0);
		System.out.println(calendar.getTime());
	}

}












