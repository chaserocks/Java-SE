package com.qspiders.collections;

import java.util.ArrayList;

// How to copy ArrayList to Array ?
public class CopyArrlstToArry {
	public static void main(String[] args) {
		ArrayList<String> arrlst=new ArrayList<String>();
		arrlst.add("First");
		arrlst.add("Second");
		arrlst.add("Third");
		arrlst.add("Random");
		System.out.println("Actual ArrayList"+ arrlst);
		
		String[] strArr=new String[arrlst.size()];
		arrlst.toArray(strArr);
		System.out.println("Created Array Content:");
		
		for(String str:strArr)
		{
			System.out.println(str);
	    }
   }
}