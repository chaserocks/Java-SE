package com.qspiders.pack1;

import java.util.ArrayList;
// Calling methods of all different objects in an ArrayList.
class Chocolate{
	void giveAroma()
	{
		System.out.println("Chocolate Aroma");
	}
}

class Nuts{
	void getAroma()
	{
		System.out.println("Nuts Aroma");
	}
}

public class CallingAllMethodsofDifferentObjs {
	public static void main(String[] args) {
		ArrayList lst=new ArrayList();
		lst.add(new Chocolate());
		lst.add(new Chocolate());
		lst.add(new Nuts());
		lst.add(new Chocolate());
		lst.add(new Nuts());
		System.out.println(lst.size());
		for(Object o:lst)
		{
			if(o instanceof Chocolate)
				((Chocolate)o).giveAroma();
			else if (o instanceof Nuts)
				((Nuts)o).getAroma();
		}
	}	
}
