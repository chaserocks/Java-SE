package Collections.TreeMap;

import java.util.Set;
import java.util.TreeMap;
import java.util.Map.Entry;

public class GetEntrySetfromKeyMap {
	public static void main(String[] args) {
		TreeMap<String, String> tm=new TreeMap<String, String>();
		tm.put("First","FIRST INSERTED");
		tm.put("Second","SECOND INSERTED");
		tm.put("Third","THIRD INSERTED");
		System.out.println(tm);
		
		Set<Entry<String,String>> entries=tm.entrySet();
		for(Entry<String,String>ent:entries)
		{
			System.out.println(ent.getKey()+"=>"+ent.getValue());
		}
	}

}
