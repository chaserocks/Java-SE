package com.qspiders.collections;


import java.util.LinkedList;
import java.util.List;

//How to get sub List From the Linked List?
public class TogetsubLstfromLnkdLst {
	public static void main(String[] args) {
		LinkedList<String> lnkdlst=new LinkedList<String>();
		lnkdlst.add("First");
		lnkdlst.add("Second");
		lnkdlst.add("Third");
		lnkdlst.add("Random");
		System.out.println("Actual LinkedList"+ lnkdlst);
		
		List<String> sublst=lnkdlst.subList(2, 4);
		
		System.out.println("Sub List"+sublst);
	}

}
