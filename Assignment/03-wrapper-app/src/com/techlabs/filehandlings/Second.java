package com.techlabs.filehandlings;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Second {

	public static void main(String[] args) throws Exception {
		// Copy Content of 1 file into another
		FileInputStream inputstream=new FileInputStream("E:\\Full Stack Java\\data.txt"); 
		FileOutputStream outputstream=new FileOutputStream("E:\\Full Stack Java\\data3.txt"); 
		int ch=-1;
		while((ch=inputstream.read())!=-1)
		{
			outputstream.write(ch);
		}
		inputstream.close();
		outputstream.close();
	}

}
