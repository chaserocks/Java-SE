package Collections.HashMap;

import java.util.HashMap;

// How to search a Key in HashMap?
public class SearchAKeyinHashMap {
public static void main(String[] args) {
	
	// HashMap<Key,Value> where Key and Value have the String type
	HashMap<String, String> hm=new HashMap<String, String>();
	hm.put("First","FIRST INSERTED");
	hm.put("Second","SECOND INSERTED");
	hm.put("Third","THIRD INSERTED");
	System.out.println(hm);
	
	if(hm.containsKey("First"))
	{
		System.out.println("The HashMap contains key first");
	}
	else
	{
		System.out.println("The HashMap doesnt contains key first");
	}
	
	if(hm.containsKey("Fifth"))
	{
		System.out.println("The HashMap contains key fifth");
	}
	else
	{
		System.out.println("The HashMap doesnt contains key fifth");;
	}
  }
}
