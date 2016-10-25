package InterviewQsandAs;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

// Convert a given String as "15/7/2016" to a Date Object?
//Ans: Java is famous for its Libraries.
public class StringtoDate {
	public static void main(String[] args) throws ParseException  {
		SimpleDateFormat sdf=new SimpleDateFormat("dd/MM/yyyy");
		String dateString="15/7/2016";
		Date d=sdf.parse(dateString);
		System.out.println(d);
	}

}
