package Collections.HashTable;

import java.util.Hashtable;
// How to Search a Value in HashTable?
public class SearchaValueinHashTable {
	public static void main(String[] args) {
	
	Hashtable<String,String> ht=new Hashtable<String,String>();
	ht.put("First","FIRST INSERTED");
	ht.put("Second","SECOND INSERTED");
	ht.put("Third","THIRD INSERTED");
	System.out.println(ht);
	
	if(ht.containsValue("SECOND INSERTED"))
	{
		System.out.println("The Hashtable Contains SECOND INSERTED");
	}
	else
	{
		System.out.println("The Hashtable doesnt Contains SECOND INSERTED");
	}
	
	if(ht.containsKey("FIFTH INSERTED"))
	{
		System.out.println("The Hashtable Contains FIFTH INSERTED");
	}
	else
	{
		System.out.println("The Hashtable doesnt Contains FIFTH INSERTED");
	}
  }
}

