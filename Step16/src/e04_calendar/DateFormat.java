package e04_calendar;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class DateFormat {

	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		
		//날짜 서식 문자를 이용해서 원하는 형태로 날짜를 문자열로 만들어 주는 클래스
		SimpleDateFormat sdf = new SimpleDateFormat();
		sdf.applyPattern("yyyy");//연도 4자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("yy");//연도 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("M");//월 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MM");//월 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMM");//로컬 형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("MMMM");//로컬 형식 월
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("d");//일 1자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("dd");//일 2자리
		System.out.println(sdf.format(cal.getTime()));
		sdf.applyPattern("E");//요일
		System.out.println(sdf.format(cal.getTime()));
		
		
	}

}







