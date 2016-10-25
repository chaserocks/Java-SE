package Collections.Hashset;

import java.util.HashSet;

public class ComparetwoHashsetRetainSameElemnts {
	public static void main(String[] args) {
		HashSet<String> hs=new HashSet<String>();
		hs.add("First");
		hs.add("Second");
		hs.add("Third");
		hs.add("Random");
		hs.add("Apple");
		hs.add("Tamato");
		System.out.println(hs);

		HashSet<String> subset=new HashSet<String>();
		subset.add("Third");
		subset.add("Random");
		subset.add("Apple");
		subset.add("Tamato");
		
		System.out.println(subset);
		
		hs.retainAll(subset);
		System.out.println("HashSet Contains the Same ELements in Both Sets are:"+hs);	
	}
}
