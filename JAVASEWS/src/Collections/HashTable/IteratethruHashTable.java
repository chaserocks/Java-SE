package Collections.HashTable;

import java.util.Hashtable;
import java.util.Set;

// How to Iterate through HashTable?
public class IteratethruHashTable {
public static void main(String[] args) {
	
	Hashtable<String,String> ht=new Hashtable<String,String>();
	
	ht.put("First","FIRST INSERTED");
	ht.put("Second","SECOND INSERTED");
	ht.put("Third","THIRD INSERTED");
	System.out.println(ht);
	
	Set<String> keys=ht.keySet();
	for(String ak:keys)
		System.out.println("Value of "+ak+" is:"+ht.get(ak));
}

}
