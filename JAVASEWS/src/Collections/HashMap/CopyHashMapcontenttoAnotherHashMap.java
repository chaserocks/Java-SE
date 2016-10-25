package Collections.HashMap;

import java.util.HashMap;

public class CopyHashMapcontenttoAnotherHashMap {

	public static void main(String[] args) {
		// HashMap<Key,Value> where Key and Value have the String type
		HashMap<String,String> hm=new HashMap<String,String>();
		hm.put("First","FIRST INSERTED");
		hm.put("Second","SECOND INSERTED");
		hm.put("Third","THIRD INSERTED");
		System.out.println(hm);
		
		HashMap<String,String> subMap=new HashMap<String,String>();
		subMap.put("s1","S1 VALUE");
		subMap.put("s2","S2 VALUE");
		subMap.put("s3","S3 VALUE");
		System.out.println(subMap);
		
		hm.putAll(subMap);
		System.out.println("Copied Contents to SubMap:"+hm);
	}
}
