package Collections.Hashset;

import java.util.HashSet;

// How to Copy Set Content To another HashSet?
public class CopySetContentToanotherHashSet {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		hs.add("Random");
		
		System.out.println(hs);

		HashSet<String> subset=new HashSet<String>();
		subset.add("s1");
		subset.add("s2");
		hs.addAll(subset);
		System.out.println("HashSet Contents after adding another collections");
		System.out.println(hs);	
	}
}
