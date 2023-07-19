package com.techlabs.filehandlings;

import java.io.FileInputStream;

public class First {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		FileInputStream inputstream=new FileInputStream("E:\\Full Stack Java\\data1.txt"); 
		int ch;
		int charcount=0,wordcount=1,linecount=1;
		while((ch=inputstream.read())!=-1)
		{
			System.out.print((char)ch);
			charcount++;
			if((char)ch==' '||(char)ch=='\t'||(char)ch=='\n'||(char)ch=='\0')
				wordcount++;
			if((char)ch=='\n'||(char)ch=='\n')
				{linecount++;
				}
		}
		System.out.println(wordcount);
		System.out.println(charcount);
		System.out.println(linecount);
		inputstream.close();
		
		
	}

}
