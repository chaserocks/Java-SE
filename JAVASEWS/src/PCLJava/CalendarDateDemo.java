package PCLJava;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class CalendarDateDemo {
public static void main(String[] args) {
	Calendar calendar=new GregorianCalendar();
	System.out.println(calendar.getTime());
	
	int year      = calendar.get(Calendar.YEAR);
	int month     = calendar.get(Calendar.MONTH);
	int dayOfMonth= calendar.get(Calendar.DAY_OF_MONTH); //Jan =0 , not 1
	
	int dayOfWeek= calendar.get(Calendar.DAY_OF_WEEK);
	int weekOfYear=calendar.get(Calendar.WEEK_OF_YEAR);
	int weekOfMonth=calendar.get(Calendar.WEEK_OF_MONTH);
	
	int hour       = calendar.get(Calendar.HOUR); // 12 hour clock 
	int hourOfDay  = calendar.get(Calendar.HOUR_OF_DAY); // 24 hour clock
	int minute     = calendar.get(Calendar.MINUTE);
	int seocnd     = calendar.get(Calendar.SECOND);
	int millisecond= calendar.get(Calendar.MILLISECOND);
	
	System.out.println(year + " "+ month + " "+ dayOfMonth);
	System.out.println(weekOfMonth+ " "+ dayOfWeek);
	
	// Adding and Subtracting to Year, Month, Day e.t.c...
	System.out.println("-------Adding  month------------");
	calendar.add(calendar.MONTH, 5); // Adding  month
	System.out.println(calendar.getTime());
	System.out.println("---------Subtracting month-----------");
	calendar.add(calendar.MONTH, -5); // Subtracting month
	System.out.println(calendar.getTime());
	
	
		System.out.println("-------Adding  Year------------");
		calendar.add(calendar.YEAR, 5); // Adding  year
		System.out.println(calendar.getTime());
		System.out.println("---------Subtracting Year-----------");
		calendar.add(calendar.YEAR, -5); // Subtracting year
		System.out.println(calendar.getTime());
		
		System.out.println("-------Adding  Day------------");
		calendar.add(calendar.DAY_OF_MONTH, 5); // Adding  dayofmonth
		System.out.println(calendar.getTime());
		System.out.println("---------Subtracting Day-----------");
		calendar.add(calendar.DAY_OF_MONTH, -5); // Subtracting dayofmonth
		System.out.println(calendar.getTime());
	
	// The Calendar class has a corresponding set() method so you can set these fields too. Here is how that looks:
	
	/*Calendar calendar  = new GregorianCalendar();
	
	calendar.set(Calendar.YEAR,2009);
	calendar.set(Calendar.MONTH,11); // 11= december.
	calendar.set(Calendar.DAY_OF_MONTH,24); // christmas eve.
*/	
	
	
	
	
	
	
}
}
