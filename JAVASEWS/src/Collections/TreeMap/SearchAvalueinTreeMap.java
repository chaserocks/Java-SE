package Collections.TreeMap;

import java.util.TreeMap;

public class SearchAvalueinTreeMap {
	public static void main(String[] args) {
	
	// TreehMap<Key,Value> where Key and Value have the String type
	TreeMap<String, String> tm=new TreeMap<String, String>();
	tm.put("First","FIRST INSERTED");
	tm.put("Second","SECOND INSERTED");
	tm.put("Third","THIRD INSERTED");
	System.out.println(tm);
	
	if(tm.containsKey("First"))
	{
		System.out.println("The TreeMap contains key first");
	}
	else
	{
		System.out.println("The TreeMap doesnt contains key first");
	}
	
	if(tm.containsKey("Fifth"))
	{
		System.out.println("The TreeMap contains key fifth");
	}
	else
	{
		System.out.println("The TreeMap doesnt contains key fifth");;
	}
  }
}


