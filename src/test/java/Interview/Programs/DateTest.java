package Interview.Programs;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import javax.print.attribute.standard.Fidelity;

public class DateTest {
	
	public static void main(String[] args) throws Throwable {
		String date = getFutureDateTime("09/27/2021", 15);
		System.out.println(date);
		String date2 = getFutureDateTime(date, -12);
		System.out.println(date2);
	}

	public static String getFutureDate(String date, int days) throws Throwable {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		Date d = sdf.parse(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		calendar.add(Calendar.DAY_OF_YEAR, days);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		Date tomorrow = calendar.getTime();
		return sdf.format(tomorrow);
	}

	public static String getFutureDateTime(String date, int days) throws Throwable {
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy");
		String finalDate = null;
		Date d = sdf.parse(date);
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(d);
		calendar.add(Calendar.DAY_OF_YEAR, days);
		int day = calendar.get(Calendar.DAY_OF_WEEK);
		System.out.println(day);
		Date tomorrow = calendar.getTime();
		String nextDueDate = sdf.format(tomorrow);

		if(day==7) {
			finalDate = getFutureDate(nextDueDate, -1);
		}else if(day==1) {
			finalDate = getFutureDate(nextDueDate, -2);
		}else if(day==2) {
			finalDate = getFutureDate(nextDueDate, -3);
		}else {
			finalDate=nextDueDate;
		}
		return finalDate;

	}
}
