package com.qspiders.collections;

import java.util.LinkedList;

// How to read First Element from Linked List?
public class ReadFrstandLastElmntfrmLnkdlst {
	public static void main(String[] args) {

	LinkedList<String> lnkdlst=new LinkedList<String>();
	lnkdlst.add("First");
	lnkdlst.add("Second");
	lnkdlst.add("Third");
	lnkdlst.add("Random");
	
	String fE = lnkdlst.element();
	System.out.println(fE);
	
//	One shot: First Element
	System.out.println(lnkdlst.element());
	System.out.println(lnkdlst.getFirst());
	System.out.println(lnkdlst.peek());
	System.out.println(lnkdlst.peekFirst());
	
//	One shot: Last Element
	
	System.out.println(lnkdlst.getLast());
	System.out.println(lnkdlst.peekLast());
	System.out.println(lnkdlst.pollLast());

	

	}
	
}
