package Collections.Vector;

import java.util.Vector;

// How to Copy Vector to an Array?
public class CopyVectortoArray {
public static void main(String[] args) {
	Vector<String> vct=new Vector<String>();
	// Adding Elements to the end
	vct.add("First");
	vct.add("Second");
	vct.add("Third");
	vct.add("Random");
	System.out.println("Actual Vector:"+vct);
	
	String[] copyArr=new String[vct.size()];
	vct.copyInto(copyArr);
	System.out.println("Copied Array Content:");
	for(String str:copyArr)
	{
		System.out.println(str);
	}
  }
}
