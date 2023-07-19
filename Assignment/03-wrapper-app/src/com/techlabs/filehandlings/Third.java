package com.techlabs.filehandlings;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class Third {

	public static void main(String[] args) throws Exception {
		// File Class ***Most Important***
		File file = new File("E:\\Full Stack Java\\data.txt");
		{			
			if(file.isDirectory()==true)
			{
				//System.out.println(file.getAbsolutePath());
				String name[]=file.list();
				Arrays.sort(name);
				for(String s:name) {
					System.out.println(s);
				}				
			}
			else if(file.isFile()==true)
			{
				FileInputStream inputstream = new FileInputStream(file.getPath());
				StringBuilder content=new StringBuilder();
				int ch=-1;
				while((ch=inputstream.read())!=-1)
				{
					//System.out.print((char)ch);
					content.append((char)ch);
				}
				inputstream.close();	
				String reverse=content.reverse().toString();
				System.out.println(reverse);
			}
		}		
	}
}
