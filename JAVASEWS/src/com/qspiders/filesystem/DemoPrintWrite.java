package com.qspiders.filesystem;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.io.IOException;

//Writing into a file using PrintWriter :

public class DemoPrintWrite {

    	public static void main(String[] args) throws IOException {
    		File f1=new File("D:\\Sample\\Agile.txt");
    		FileWriter FWriter=new FileWriter(f1);
    		PrintWriter PWrite=new PrintWriter(FWriter); 
    		PWrite.println("Writing via printwriter");
    		PWrite.println("easy way-- Yes");   
    		PWrite.close();   
    		}
}