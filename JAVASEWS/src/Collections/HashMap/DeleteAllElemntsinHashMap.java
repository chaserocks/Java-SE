package Collections.HashMap;

import java.util.HashMap;

// How to Delete All Elements present in HashMap?
public class DeleteAllElemntsinHashMap {

	public static void main(String[] args) {
		HashMap<String, String> hm=new HashMap<String, String>();
		hm.put("First","FIRST INSERTED");
		hm.put("Second","SECOND INSERTED");
		hm.put("Third","THIRD INSERTED");
		System.out.println(hm);
		
		// Clearing the HashMap
		hm.clear();
	
		System.out.println("Content After Clear:"+hm);
	}
}
