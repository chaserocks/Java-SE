package PCLJava;

import java.text.SimpleDateFormat;
import java.util.Date;


public class DateFormatting {
public static void main(String[] args) {
	SimpleDateFormat df= new SimpleDateFormat("dd/MM/YYYY hh:mm");
	/*mm-01
	MM-JAN
	MMMM-January*/
	
	String dateString=df.format(new Date());
	System.out.println(dateString);
			
}
}

	/*Y=Year (YY or YYYY)
	M= month (MM)
	d=day in month(dd)
	h=hour (0-12) (hh)
	H=hour(0-23) (HH)
	m=minute in hour (mm)
	s=seconds (ss)
	S= Milliseconds (SSS)
	z=time zone text
	z=time zone, time offset(eg:0000).*/














  