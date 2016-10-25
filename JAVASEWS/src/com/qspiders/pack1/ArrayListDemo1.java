package com.qspiders.pack1;

import java.util.ArrayList;

class Fig{
	int wt;
	public Fig(int wt)
	{
		this.wt=wt;
	}
	public boolean equals(Object obj)
	{
		if(obj==null)
			return false;
		if(this==obj)
			return true;
		if(obj instanceof Fig)
		{
			if(this.wt==((Fig)obj).wt)
				return true;
		}
		return false;
	}
	public int inthashCode()
	{
		return 7*5*wt; // magic number.
	}
}
public class ArrayListDemo1 {
	public static void main(String[] args) {
		ArrayList lst=new ArrayList();
		lst.add(new Fig(100));
		Fig f1=new Fig(100);
		lst.add(f1);
		System.out.println(lst);
		lst.remove(new Fig(100)); // remove first Fig object.
		//lst.remove(new Fig(100)); // removes second Fig object.
		//lst.remove(f1);
		// to remove all Fig objects use removeAll() and pass list of Fig objects
			System.out.println(lst);
			lst.removeAll(lst);
			System.out.println(lst);
		
  }
}
