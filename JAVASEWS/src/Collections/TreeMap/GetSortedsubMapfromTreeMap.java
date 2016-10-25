package Collections.TreeMap;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

//How to Get Sorted subMap from TreeMap?
public class GetSortedsubMapfromTreeMap {
	public static void main(String[] args) {
		// The Tree Map sorts By Keys
		TreeMap<String,String> tm=new TreeMap<String,String>(new MyCompr());
		tm.put("Java","Language");
		tm.put("Computer","Machine");
		tm.put("India","Country");
		tm.put("Mango","Fruit");
		tm.put("Cricket","Game");
		
		System.out.println(tm);
		
		Map<String,String> subMap1=tm.subMap("Cricket", "Java");
		System.out.println("Sub-Map Entries:"+subMap1);
		System.out.println("******************");
		// How to get lower boundary which is also a part of sub-map.
		Map<String,String> lbsubMap1=tm.subMap("Cricket", true, "Java", true);
		System.out.println("Sub-Map Entries:"+lbsubMap1);
		
		//How to omit upper boundary which is also a part of sub-map.
		Map<String,String> ubsubMap2=tm.subMap("Cricket", false, "Java", true);
		System.out.println("Sub-Map Entries:"+ubsubMap2);
	}
}
		class MyCompr implements Comparator<String>
		{
			@Override
			public int compare(String str1,String str2)
			{
				return str1.compareTo(str2);
			}
		}




