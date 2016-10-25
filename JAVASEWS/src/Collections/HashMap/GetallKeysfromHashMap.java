package Collections.HashMap;

import java.util.HashMap;
import java.util.Set;

// How to Get all Keys from HashMap?
public class GetallKeysfromHashMap {
	public static void main(String[] args) {
	
	// HashMap<Key,Value> where Key and Value have the String type
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("First","FIRST INSERTED");
		hm.put("Second","SECOND INSERTED");
		hm.put("Third","THIRD INSERTED");
		System.out.println(hm);
		
		Set<String>keys=hm.keySet();
		for(String key:keys)
		{
			System.out.println(key);
		}
 }
}