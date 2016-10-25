package Collections.TreeMap;

import java.util.Set;
import java.util.TreeMap;

public class GetAllKeysfromTreeMap {
	public static void main(String[] args) {
	TreeMap<String, String> tm=new TreeMap<String, String>();
	tm.put("First","FIRST INSERTED");
	tm.put("Second","SECOND INSERTED");
	tm.put("Third","THIRD INSERTED");
	System.out.println(tm);
	
	Set<String> allKeys=tm.keySet();
	
	for(String aks:allKeys)
	{
		System.out.println(aks);
	}
	
	}
}
