package com.qspiders.pack1;

import java.util.TreeSet;

class Lollypop implements Comparable {
	int wt; 
	public int compareTo(Object o) 
	{
		return this.wt - ((Lollypop)o).wt; 
	}     
	Lollypop(int wt) 
	{ 
		this.wt=wt; 
	}
	public String toString() 
	{
		return"wt="+ wt;  
	}
}

public class TreeSetDemo1 {
		public static void main(String[] args)
		{ 
			TreeSet ts=new TreeSet<>();
			ts.add(new Lollypop(25));   
			ts.add(new Lollypop(27));
			ts.add(new Lollypop(20)); 
			ts.add(new Lollypop(22)); 
			ts.add(new Lollypop(21));
			System.out.println(ts); 
	}
}