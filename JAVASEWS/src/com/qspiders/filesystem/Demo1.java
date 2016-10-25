package com.qspiders.filesystem;

import java.io.File;

public class Demo1 {
	public static void main(String[] args)
	{
		File fil=new File("d:\\Sample");
		if(!fil.exists())
		System.out.println(fil.mkdir());
		System.out.println(fil.getAbsolutePath());
		System.out.println(fil.getName());
		System.out.println(fil.getParent());
		System.out.println(fil.isDirectory());
		File  fils[]=fil.listFiles();
		System.out.println("----");
		for(Object o:fils)
		{
			System.out.println(((File)o).getName()); 
			System.out.println(o); //gets absolutePath
         } 
	System.out.println("***********");
	for(File fi:fils)
	{
		System.out.println(fi.getName());
		System.out.println(fi.getAbsolutePath());
		}
	System.out.println("&&&&&&&&&&&&&");
	File fil1=new File("d:\\Sample\\Agile.txt");
	System.out.println(fil1.isFile());
	System.out.println(fil1.getParent());
	System.out.println(fil1.length()/1024);
	File fil2=new File("d:\\");
	System.out.println(fil2.getName()); //works only for file or directory.
	System.out.println("----");
	System.out.println(fil2.getFreeSpace()/(1024*1024*1024));
	System.out.println(fil2.getTotalSpace()/(1024*1024*1024)); 
	}
}



