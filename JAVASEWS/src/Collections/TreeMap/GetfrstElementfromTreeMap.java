package Collections.TreeMap;

import java.util.Comparator;
import java.util.Map.Entry;
import java.util.TreeMap;

//How to Get first Element from TreeMap(Sorted Map)?
public class GetfrstElementfromTreeMap {
	public static void main(String[] args) {
		// By using Salary comparator(int comparsion)
		
	TreeMap<Emp,String>tm=new TreeMap<Emp,String>(new MySalCompr());
	tm.put(new Emp("Ram", 3000),"RAM");
	tm.put(new Emp("Sam", 4000),"SAM");
	tm.put(new Emp("Cam", 5000),"CAM");
	tm.put(new Emp("Tom", 8000),"TOM");
	tm.put(new Emp("Pom", 9000),"POM");
	System.out.println(tm);
	
	Emp em=tm.firstKey();
	System.out.println("Highest Salary emp:"+em);
	Entry<Emp,String> entry=tm.firstEntry();
	System.out.println("FirstEntry:"+entry);		
	}
}

class MySalCompr implements Comparator<String>
{
	@Override
	public int compare(new Emp(String str1,str2), String str3)
	{
		return str1.compareTo(str3);
	}
 }
