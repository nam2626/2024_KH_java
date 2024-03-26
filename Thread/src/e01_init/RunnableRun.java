package e01_init;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class RunnableRun implements Runnable{
	public static String getTime() {
		Calendar cal = Calendar.getInstance();
		SimpleDateFormat sdf = new SimpleDateFormat("HH_mm_ss_SSS");
		return sdf.format(cal.getTime());
	}
	
	@Override
	public void run() {
		for(int i=0;i<1000000;i++);
		System.out.println(Thread.currentThread().getName() + " - 종료 " + getTime());
	}

}






