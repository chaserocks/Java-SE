package com.qspiders.collections;

import java.util.LinkedList;

public class TocopyLnkdlstToArray {
	public static void main(String[] args) {
	LinkedList<String> lnkdlst=new LinkedList<String>();
		lnkdlst.add("First");
		lnkdlst.add("Second");
		lnkdlst.add("Third");
		lnkdlst.add("Random");
		System.out.println("Actual LinkedList"+ lnkdlst);
		
		String[] strArr=new String[lnkdlst.size()];
		lnkdlst.toArray(strArr);
		System.out.println("Created Array Content:");
		
		for(String str:strArr)
		{	
			System.out.println(str);
		}
	}
}


