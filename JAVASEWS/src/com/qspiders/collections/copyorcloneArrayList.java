package com.qspiders.collections;

import java.util.ArrayList;
//How to copy or clone a ArrayList ?
public class copyorcloneArrayList {
public static void main(String[] args) {
	ArrayList<String> arrlst=new ArrayList<String>();
	// Adding Elements to the list
	arrlst.add("Bharath");
	arrlst.add("Chandra");
	arrlst.add("Manchikatla");
	arrlst.add("MBC2365");
	System.out.println("Actual ArrayList:" +arrlst);
	
	ArrayList<String> copy=(ArrayList<String>)arrlst.clone();
	System.out.println("Clone ArrayList:"+ copy);	
 }
}
