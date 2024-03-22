package e04_calendar;

import java.util.Calendar;
//ChatGPT 작성
public class Test {
	public static void main(String[] args) {
        // 오늘 날짜 가져오기
        Calendar today = Calendar.getInstance();
        today.set(Calendar.DAY_OF_MONTH, 23);
        // 영업일 기준으로 4일 후의 날짜 계산
        Calendar deliveryDate = calculateDeliveryDate(today, 4);
        
        // 결과 출력
        System.out.println("택배 도착일: " + deliveryDate.getTime());
    }

    // 영업일 기준으로 일정 기간 뒤의 날짜를 계산하는 메서드
    public static Calendar calculateDeliveryDate(Calendar startDate, int businessDays) {
        Calendar currentDate = (Calendar) startDate.clone();
        int remainingBusinessDays = businessDays;

        // 영업일을 고려하여 날짜를 계산
        while (remainingBusinessDays > 0) {
            currentDate.add(Calendar.DAY_OF_MONTH, 1);
            if (isBusinessDay(currentDate)) {
                remainingBusinessDays--;
            }
        }

        return currentDate;
    }

    // 주말을 제외한 영업일인지 확인하는 메서드
    public static boolean isBusinessDay(Calendar date) {
        int dayOfWeek = date.get(Calendar.DAY_OF_WEEK);
        return dayOfWeek != Calendar.SATURDAY && dayOfWeek != Calendar.SUNDAY;
    }
}
