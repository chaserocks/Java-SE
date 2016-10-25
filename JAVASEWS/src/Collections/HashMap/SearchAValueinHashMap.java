package Collections.HashMap;

import java.util.HashMap;

// How to Search A Value in HashMap?
public class SearchAValueinHashMap {
	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		
		// HashMap<Key,Value> where Key and Value have the String type
		
		hm.put("First","FIRST INSERTED");
		hm.put("Second","SECOND INSERTED");
		hm.put("Third","THIRD INSERTED");
		System.out.println(hm);
		
		if(hm.containsValue("FIRST INSERTED"))
		{
			System.out.println("The HashMap contains value FIRST INSERTED");
		}
		else
		{
			System.out.println("The HashMap doesnt contains value FIRST INSERTED");
		}
		
		if(hm.containsValue("FIFTH INSERTED"))
		{
			System.out.println("The HashMap contains value FIFTH INSERTED");
		}
		else
		{
			System.out.println("The HashMap doesnt contains value FIFTH INSERTED");;
		}
	}

}
