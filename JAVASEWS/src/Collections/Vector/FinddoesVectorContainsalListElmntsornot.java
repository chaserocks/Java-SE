package Collections.Vector;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

//How to Find does Vector Contains all List Elments or not?
public class FinddoesVectorContainsalListElmntsornot {
	public static void main(String[] args) {
		Vector<String> vct=new Vector<String>();
		// Adding Elements to the end
		vct.add("First");
		vct.add("Second");
		vct.add("Third");
		vct.add("Random");
		System.out.println("Actual Vector:"+vct);
		// Create an Array list to store the values
		List<String> lst=new ArrayList<String>();
		lst.add("one");
		lst.add("two");
		lst.add("three");
		// Adding all elements of a list to a Vector
		vct.addAll(lst);
		System.out.println("Does Vector Contains all list elements?:"+vct.containsAll(lst));
		lst.add("four");
//		vct.addAll(lst);
		System.out.println("Does Vector Contains all list elements?:"+vct.containsAll(lst));
	  }
}
