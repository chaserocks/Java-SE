package com.qspiders.filesystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Writing into a file using BufferedWriter.

public class DemoWriteFile {

 public static void main(String[] args) throws IOException
 {
	 System.out.println("main method starts");
	 File f1=new File("D:\\Sample\\Agile.txt");
	 FileWriter FWriter=new FileWriter(f1);
	 BufferedWriter FBufWrite=new BufferedWriter(FWriter);  
	 FBufWrite.write("Good Morning All"  );  
	 FBufWrite.newLine(); 
	 FBufWrite.write("Writing to a file");  
	 FBufWrite.newLine(); 
	 FBufWrite.write("Written to a file and checked");  
	 FBufWrite.newLine(); 
	 FBufWrite.close();
	 System.out.println("main method ends");  
	 }
 }