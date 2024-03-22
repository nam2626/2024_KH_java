package e04_calendar;

import java.util.Date;

public class DateExample {

	public static void main(String[] args) {
		Date today = new Date();
		System.out.println(today);
		System.out.println(today.getTime());
		Date date = new Date(0);
		System.out.println(date);
		System.out.println(date.getTime());
		
		Date end = new Date(124, 11, 31);
		System.out.println(end);
	}

}







