package Collections.HashTable;

import java.util.Hashtable;

//How to Copy Map Content To Another HashTable?
public class CopyMapContentToAnotherHashTable {
	public static void main(String[] args) {
		Hashtable<String,String> ht=new Hashtable<String,String>();
		
		ht.put("First","FIRST INSERTED");
		ht.put("Second","SECOND INSERTED");
		ht.put("Third","THIRD INSERTED");
		System.out.println(ht);
	
	Hashtable<String,String> subMap=new Hashtable<String,String>();
	subMap.put("s1", "S1 Value");
	subMap.put("s2", "S2 Value");
	ht.putAll(subMap);
	System.out.println(ht);	
  }
}
