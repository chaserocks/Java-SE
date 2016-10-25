package com.qspiders.filesystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//Reading from the file:

public class DemoReadFile {
	 public static void main(String[] args) throws IOException 
	 {
		 File f1=new File("D:\\Sample\\Agile.txt");
		 FileReader FRead=new FileReader(f1); 
		 BufferedReader FBufRead=new BufferedReader(FRead);
		 String s;
		 while((s=FBufRead.readLine())!=null)
		 {
			 if(s.length()>0)// to skip a blank line
				 System.out.println(s);
		  }
    }
}