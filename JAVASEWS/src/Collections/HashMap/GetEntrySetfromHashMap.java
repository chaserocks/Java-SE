package Collections.HashMap;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

// How to Get Entry Set from HashMap?
public class GetEntrySetfromHashMap {
public static void main(String[] args) {
	// HashMap<Key,Value> where Key and Value have the String type
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("First","FIRST INSERTED");
		hm.put("Second","SECOND INSERTED");
		hm.put("Third","THIRD INSERTED");
		System.out.println(hm);
		
		//Getting value from the given Key from HashMap
		Set<Entry<String,String>> entries=hm.entrySet();
		for(Entry<String,String>ent:entries)
		{
			System.out.println(ent.getKey()+"=>"+ent.getValue());
		}
    }
}
