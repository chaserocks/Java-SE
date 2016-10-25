package Collections.HashTable;

import java.util.Hashtable;
// How to Search a Key in HashTable?
public class SearchaKeyinHashTable {
	public static void main(String[] args) {

	Hashtable<String,String> ht=new Hashtable<String,String>();
	ht.put("First","FIRST INSERTED");
	ht.put("Second","SECOND INSERTED");
	ht.put("Third","THIRD INSERTED");
	System.out.println(ht);
	
	if(ht.containsKey("First"))
	{
		System.out.println("The Hashtable Contains first Key");
	}
	else
	{
		System.out.println("The Hashtable doesnt Contains first Key");
	}
	
	if(ht.containsKey("Fifth"))
	{
		System.out.println("The Hashtable Contains fifth Key");
	}
	else
	{
		System.out.println("The Hashtable doesnt Contains fifth Key");
	}
  }
}
