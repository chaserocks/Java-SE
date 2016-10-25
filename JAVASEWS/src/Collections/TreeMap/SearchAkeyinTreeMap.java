package Collections.TreeMap;
import java.util.TreeMap;

// How to search a key in a TreeMap?
public class SearchAkeyinTreeMap {
public static void main(String[] args) {
	
	TreeMap<String,String>tm=new TreeMap<String,String>();
	
	//add key-value pair to TreeMap

	tm.put("First","FIRST INSERTED");
	tm.put("Second","SECOND INSERTED");
	tm.put("Third","THIRD INSERTED");
	System.out.println(tm);
	
	if(tm.containsKey("First"))
	{
		System.out.println("The TreeMap contains key first");
	}
	else
	{
		System.out.println("The TreeMap doesnt contains key first");
	}
	
	if(tm.containsKey("Fifth"))
	{
		System.out.println("The TreeMap contains key fifth");
	}
	else
	{
		System.out.println("The TreeMap doesnt contains key fifth");;
	}
	
}
}
